package MadBasic;

import ParserMadBasic.MadBasicLexer;
import ParserMadBasic.MadBasicParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;

/**
 * Created by lsanchez on 3/10/16.
 */
public class Parser {

    public static ParseTree parse(String fileName,
                                          String combinedGrammarFileName,
                                          String startRule)
            throws IOException
    {
        ANTLRInputStream input = new ANTLRFileStream(fileName);
        MadBasicLexer lexer = new MadBasicLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MadBasicParser parser = new MadBasicParser(tokens);
        ParseTree tree = parser.madbasic();
        return tree;
    }

}
