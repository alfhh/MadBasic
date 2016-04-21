// Generated from /home/lsanchez/Documents/Compiladores/MadBasic/AntlrProject/src/MadBasic/MadBasic.g4 by ANTLR 4.5.1
package ParserMadBasic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MadBasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MadBasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#madbasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMadbasic(MadBasicParser.MadbasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MadBasicParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(MadBasicParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(MadBasicParser.BContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(MadBasicParser.CContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#classe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(MadBasicParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dParent}
	 * labeled alternative in {@link MadBasicParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDParent(MadBasicParser.DParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dEmpty}
	 * labeled alternative in {@link MadBasicParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDEmpty(MadBasicParser.DEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(MadBasicParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(MadBasicParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(MadBasicParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitG(MadBasicParser.GContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(MadBasicParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#h}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH(MadBasicParser.HContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#j}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ(MadBasicParser.JContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(MadBasicParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitK(MadBasicParser.KContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL(MadBasicParser.LContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link MadBasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(MadBasicParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link MadBasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFloat(MadBasicParser.TypeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeString}
	 * labeled alternative in {@link MadBasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeString(MadBasicParser.TypeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link MadBasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(MadBasicParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeList}
	 * labeled alternative in {@link MadBasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(MadBasicParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeObject}
	 * labeled alternative in {@link MadBasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeObject(MadBasicParser.TypeObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDeclare}
	 * labeled alternative in {@link MadBasicParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclare(MadBasicParser.ArrayDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVoid}
	 * labeled alternative in {@link MadBasicParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVoid(MadBasicParser.ArrayVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayEmpty}
	 * labeled alternative in {@link MadBasicParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayEmpty(MadBasicParser.ArrayEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(MadBasicParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(MadBasicParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#m}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM(MadBasicParser.MContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN(MadBasicParser.NContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MadBasicParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(MadBasicParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(MadBasicParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(MadBasicParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MadBasicParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitO(MadBasicParser.OContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MadBasicParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pElse}
	 * labeled alternative in {@link MadBasicParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPElse(MadBasicParser.PElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pEmpty}
	 * labeled alternative in {@link MadBasicParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPEmpty(MadBasicParser.PEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(MadBasicParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(MadBasicParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qWrite}
	 * labeled alternative in {@link MadBasicParser#q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQWrite(MadBasicParser.QWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qEmpty}
	 * labeled alternative in {@link MadBasicParser#q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQEmpty(MadBasicParser.QEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(MadBasicParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(MadBasicParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MadBasicParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(MadBasicParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MadBasicParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sDot}
	 * labeled alternative in {@link MadBasicParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSDot(MadBasicParser.SDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sEmpty}
	 * labeled alternative in {@link MadBasicParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSEmpty(MadBasicParser.SEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ssExp}
	 * labeled alternative in {@link MadBasicParser#ss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsExp(MadBasicParser.SsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ssEmpty}
	 * labeled alternative in {@link MadBasicParser#ss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSsEmpty(MadBasicParser.SsEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MadBasicParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(MadBasicParser.TContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uAnd}
	 * labeled alternative in {@link MadBasicParser#u}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUAnd(MadBasicParser.UAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uOr}
	 * labeled alternative in {@link MadBasicParser#u}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUOr(MadBasicParser.UOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(MadBasicParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(MadBasicParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#v}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV(MadBasicParser.VContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wPlus}
	 * labeled alternative in {@link MadBasicParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWPlus(MadBasicParser.WPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wMinus}
	 * labeled alternative in {@link MadBasicParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWMinus(MadBasicParser.WMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(MadBasicParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xArgs}
	 * labeled alternative in {@link MadBasicParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXArgs(MadBasicParser.XArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xEmpty}
	 * labeled alternative in {@link MadBasicParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXEmpty(MadBasicParser.XEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(MadBasicParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(MadBasicParser.YContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zGreater}
	 * labeled alternative in {@link MadBasicParser#z}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZGreater(MadBasicParser.ZGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zLesser}
	 * labeled alternative in {@link MadBasicParser#z}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZLesser(MadBasicParser.ZLesserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zEqualEqual}
	 * labeled alternative in {@link MadBasicParser#z}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZEqualEqual(MadBasicParser.ZEqualEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zDifferent}
	 * labeled alternative in {@link MadBasicParser#z}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZDifferent(MadBasicParser.ZDifferentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zzEqual}
	 * labeled alternative in {@link MadBasicParser#zz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZzEqual(MadBasicParser.ZzEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zzEmpty}
	 * labeled alternative in {@link MadBasicParser#zz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZzEmpty(MadBasicParser.ZzEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MadBasicParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#aa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAa(MadBasicParser.AaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abMultiplication}
	 * labeled alternative in {@link MadBasicParser#ab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbMultiplication(MadBasicParser.AbMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abDivision}
	 * labeled alternative in {@link MadBasicParser#ab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbDivision(MadBasicParser.AbDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorExpression}
	 * labeled alternative in {@link MadBasicParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpression(MadBasicParser.FactorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorValue}
	 * labeled alternative in {@link MadBasicParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorValue(MadBasicParser.FactorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code acPlus}
	 * labeled alternative in {@link MadBasicParser#ac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcPlus(MadBasicParser.AcPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code acMinus}
	 * labeled alternative in {@link MadBasicParser#ac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcMinus(MadBasicParser.AcMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code acEmpty}
	 * labeled alternative in {@link MadBasicParser#ac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcEmpty(MadBasicParser.AcEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#ad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAd(MadBasicParser.AdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueIdentifier}
	 * labeled alternative in {@link MadBasicParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueIdentifier(MadBasicParser.ValueIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link MadBasicParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueInt(MadBasicParser.ValueIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link MadBasicParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFloat(MadBasicParser.ValueFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueString}
	 * labeled alternative in {@link MadBasicParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueString(MadBasicParser.ValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueBool}
	 * labeled alternative in {@link MadBasicParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBool(MadBasicParser.ValueBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueCall}
	 * labeled alternative in {@link MadBasicParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueCall(MadBasicParser.ValueCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MadBasicParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(MadBasicParser.MainContext ctx);
}