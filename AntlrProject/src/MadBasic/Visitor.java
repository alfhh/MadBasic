package MadBasic;

import ParserMadBasic.MadBasicBaseVisitor;
import ParserMadBasic.MadBasicParser;

import java.util.Arrays;
import java.util.LinkedList;

/**

 * Created by lsanchez on 3/10/16.
 */
public class Visitor extends MadBasicBaseVisitor<String> {

    BasicSemantic basicSemantic;

    public Visitor() {
        basicSemantic = BasicSemantic.getInstance();
    }


    @Override
    public String visitE(MadBasicParser.EContext ctx) {
        String type = ctx.getChild(0).getText();
        LinkedList<String> ids = new LinkedList<>();
        ids.add(ctx.getChild(1).getText());
        ids.addAll(Arrays.asList(ctx.getChild(2).getText().trim().split(",")));
        for (String id : ids) {
            if (id.trim().length() > 0) {
                basicSemantic.getVariables().add(new Variable(id, type, basicSemantic.getScopeStack().peek()));
            }
        }
        return super.visitE(ctx);
    }


}
