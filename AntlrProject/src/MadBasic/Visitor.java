package MadBasic;

import ParserMadBasic.MadBasicBaseVisitor;
import ParserMadBasic.MadBasicParser;

/**

 * Created by lsanchez on 3/10/16.
 */
public class Visitor extends MadBasicBaseVisitor<String> {

    BasicSemantic basicSemantic;
    String lastType;

    public Visitor() {
        basicSemantic = BasicSemantic.getInstance();
    }

//    @Override
//    public String visitType(MadBasicParser.TypeContext ctx) {
//        if (ctx.getChildCount() == 1){
//            System.out.print(ctx.getChild(0));
//        }
//        else {
//            System
//        }
//        String t = visitChildren(ctx);
//        return t;
//    }

    @Override
    public String visitE(MadBasicParser.EContext ctx) {
        System.out.print(ctx.getChild(0).getText());
        System.out.print(ctx.getChild(1).getText());
        System.out.print(ctx.getChild(2).getText());
        System.out.println();
        return super.visitE(ctx);
    }

//    @Override
//    public String visitF(MadBasicParser.FContext ctx) {
//        if (ctx.getChildCount() > 1) {
//            System.out.print(ctx.getChild(1));
//        }
//        String t = visitChildren(ctx);
//        return t;
//    }


}
