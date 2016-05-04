package MadBasic;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.misc.IntervalSet;

/**
 * Created by lsanchez on 5/4/16.
 */

public class MadBasicErrorStrategy extends DefaultErrorStrategy {

    private boolean error;
    private String errorMesage;

    MadBasicErrorStrategy() {
        Visitor.getInstance().setErrorStrategy(this);
        error = false;
        errorMesage = "";

    }

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if (tokens != null) {
            if (e.getStartToken().getType() == -1) {
                input = "<EOF>";
            } else {
                input = tokens.getText(e.getStartToken(), e.getOffendingToken());
            }
        } else {
            input = "<unknown input>";
        }

        String msg = "no viable alternative at input " + this.escapeWSAndQuote(input);
        if (!error) {
            errorMesage = msg;
            error = true;
        }
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
        System.out.println(msg);
    }

    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "mismatched input " + this.getTokenErrorDisplay(e.getOffendingToken()) +
                " expecting " + e.getExpectedTokens().toString(recognizer.getVocabulary());
        if (!error) {
            errorMesage = msg;
            error = true;
        }
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
        System.out.println(msg);
    }

    @Override
    protected void reportFailedPredicate(Parser recognizer, FailedPredicateException e) {
        String ruleName = recognizer.getRuleNames()[recognizer.getContext().getRuleIndex()];
        String msg = "rule " + ruleName + " " + e.getMessage();
        if (!error) {
            errorMesage = msg;
            error = true;
        }
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
        System.out.println(msg);
    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "extraneous input " + tokenName + " expecting " + expecting.toString(recognizer.getVocabulary());
            recognizer.notifyErrorListeners(t, msg, (RecognitionException) null);
            if (!error) {
                errorMesage = "Line " + t.getLine() + ":" + t.getCharPositionInLine() + " " + msg;
                error = true;
            }
            System.out.println(msg);
        }
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "missing " + expecting.toString(recognizer.getVocabulary()) + " at " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException) null);
            if (!error) {
                errorMesage = "Line " + t.getLine() + ":" + t.getCharPositionInLine() + " " + msg;
                error = true;
            }
            System.out.println(msg);
        }
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getErrorMesage() {
        return errorMesage;
    }

    public void setErrorMesage(String errorMesage) {
        this.errorMesage = errorMesage;
    }
}
