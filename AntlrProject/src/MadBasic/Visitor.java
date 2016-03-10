package MadBasic;

import ParserMadBasic.MadBasicBaseVisitor;
import ParserMadBasic.MadBasicParser;

/**
 * Created by lsanchez on 3/10/16.
 */
public class Visitor extends MadBasicBaseVisitor<String> {
    @Override
    public String visitE(MadBasicParser.EContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            System.out.println(ctx.getChild(i));
        }
        return super.visitE(ctx);
    }
}
