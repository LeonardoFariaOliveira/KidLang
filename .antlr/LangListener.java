// Generated from c://Users//joaop//OneDrive//Área de Trabalho//compiladores//Lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code progLine}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgLine(LangParser.ProgLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progLine}
	 * labeled alternative in {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgLine(LangParser.ProgLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(LangParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(LangParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fnBlockLine}
	 * labeled alternative in {@link LangParser#fnBlock}.
	 * @param ctx the parse tree
	 */
	void enterFnBlockLine(LangParser.FnBlockLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fnBlockLine}
	 * labeled alternative in {@link LangParser#fnBlock}.
	 * @param ctx the parse tree
	 */
	void exitFnBlockLine(LangParser.FnBlockLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fnBodyLine}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void enterFnBodyLine(LangParser.FnBodyLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fnBodyLine}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void exitFnBodyLine(LangParser.FnBodyLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fnBodyLineMore}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void enterFnBodyLineMore(LangParser.FnBodyLineMoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fnBodyLineMore}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void exitFnBodyLineMore(LangParser.FnBodyLineMoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fnReturnExprLine}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void enterFnReturnExprLine(LangParser.FnReturnExprLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fnReturnExprLine}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void exitFnReturnExprLine(LangParser.FnReturnExprLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fnReturnLine}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void enterFnReturnLine(LangParser.FnReturnLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fnReturnLine}
	 * labeled alternative in {@link LangParser#fnBody}.
	 * @param ctx the parse tree
	 */
	void exitFnReturnLine(LangParser.FnReturnLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LangParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LangParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineStmt}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineStmt(LangParser.LineStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineStmt}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineStmt(LangParser.LineStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineIf}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineIf(LangParser.LineIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineIf}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineIf(LangParser.LineIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineWhile}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineWhile(LangParser.LineWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineWhile}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineWhile(LangParser.LineWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineFor}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineFor(LangParser.LineForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineFor}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineFor(LangParser.LineForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineEOL}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLineEOL(LangParser.LineEOLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineEOL}
	 * labeled alternative in {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLineEOL(LangParser.LineEOLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcInvocLine}
	 * labeled alternative in {@link LangParser#funcInvoc}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvocLine(LangParser.FuncInvocLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcInvocLine}
	 * labeled alternative in {@link LangParser#funcInvoc}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvocLine(LangParser.FuncInvocLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAtrib}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtAtrib(LangParser.StmtAtribContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAtrib}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtAtrib(LangParser.StmtAtribContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtInput}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtInput(LangParser.StmtInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtInput}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtInput(LangParser.StmtInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtOutput}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtOutput(LangParser.StmtOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtOutput}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtOutput(LangParser.StmtOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lineFuncInvoc}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLineFuncInvoc(LangParser.LineFuncInvocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lineFuncInvoc}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLineFuncInvoc(LangParser.LineFuncInvocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputRead}
	 * labeled alternative in {@link LangParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInputRead(LangParser.InputReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputRead}
	 * labeled alternative in {@link LangParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInputRead(LangParser.InputReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputWriteVar}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutputWriteVar(LangParser.OutputWriteVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputWriteVar}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutputWriteVar(LangParser.OutputWriteVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputWriteStr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutputWriteStr(LangParser.OutputWriteStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputWriteStr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutputWriteStr(LangParser.OutputWriteStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputWriteExpr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutputWriteExpr(LangParser.OutputWriteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputWriteExpr}
	 * labeled alternative in {@link LangParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutputWriteExpr(LangParser.OutputWriteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoNumero}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoNumero(LangParser.TipoNumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoNumero}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoNumero(LangParser.TipoNumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoTexto}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoTexto(LangParser.TipoTextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoTexto}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoTexto(LangParser.TipoTextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoDecimal}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoDecimal(LangParser.TipoDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoDecimal}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoDecimal(LangParser.TipoDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoBit}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoBit(LangParser.TipoBitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoBit}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoBit(LangParser.TipoBitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipoPotinho}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipoPotinho(LangParser.TipoPotinhoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipoPotinho}
	 * labeled alternative in {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipoPotinho(LangParser.TipoPotinhoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstIf}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 */
	void enterIfstIf(LangParser.IfstIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstIf}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 */
	void exitIfstIf(LangParser.IfstIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstIfElse}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 */
	void enterIfstIfElse(LangParser.IfstIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstIfElse}
	 * labeled alternative in {@link LangParser#ifst}.
	 * @param ctx the parse tree
	 */
	void exitIfstIfElse(LangParser.IfstIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whilestWhile}
	 * labeled alternative in {@link LangParser#whilest}.
	 * @param ctx the parse tree
	 */
	void enterWhilestWhile(LangParser.WhilestWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whilestWhile}
	 * labeled alternative in {@link LangParser#whilest}.
	 * @param ctx the parse tree
	 */
	void exitWhilestWhile(LangParser.WhilestWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whilestDoWhile}
	 * labeled alternative in {@link LangParser#whilest}.
	 * @param ctx the parse tree
	 */
	void enterWhilestDoWhile(LangParser.WhilestDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whilestDoWhile}
	 * labeled alternative in {@link LangParser#whilest}.
	 * @param ctx the parse tree
	 */
	void exitWhilestDoWhile(LangParser.WhilestDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forstFor}
	 * labeled alternative in {@link LangParser#forst}.
	 * @param ctx the parse tree
	 */
	void enterForstFor(LangParser.ForstForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forstFor}
	 * labeled alternative in {@link LangParser#forst}.
	 * @param ctx the parse tree
	 */
	void exitForstFor(LangParser.ForstForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockLine}
	 * labeled alternative in {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockLine(LangParser.BlockLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockLine}
	 * labeled alternative in {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockLine(LangParser.BlockLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condRelop}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondRelop(LangParser.CondRelopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condRelop}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondRelop(LangParser.CondRelopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(LangParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(LangParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(LangParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condAnd}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(LangParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(LangParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOr}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(LangParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(LangParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condNot}
	 * labeled alternative in {@link LangParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(LangParser.CondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribVar}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtribVar(LangParser.AtribVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribVar}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtribVar(LangParser.AtribVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribVarStr}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtribVarStr(LangParser.AtribVarStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribVarStr}
	 * labeled alternative in {@link LangParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtribVarStr(LangParser.AtribVarStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(LangParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(LangParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(LangParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(LangParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTerm(LangParser.ExprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link LangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTerm(LangParser.ExprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termMult}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermMult(LangParser.TermMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termMult}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermMult(LangParser.TermMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermDiv(LangParser.TermDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermDiv(LangParser.TermDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termFactor}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermFactor(LangParser.TermFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termFactor}
	 * labeled alternative in {@link LangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermFactor(LangParser.TermFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpr(LangParser.FactorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpr(LangParser.FactorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorVar}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorVar(LangParser.FactorVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorVar}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorVar(LangParser.FactorVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorNum}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNum(LangParser.FactorNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNum}
	 * labeled alternative in {@link LangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNum(LangParser.FactorNumContext ctx);
}