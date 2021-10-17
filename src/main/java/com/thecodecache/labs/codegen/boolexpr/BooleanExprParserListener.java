// Generated from BooleanExprParser.g4 by ANTLR 4.4

package com.thecodecache.labs.codegen.boolexpr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BooleanExprParser}.
 */
public interface BooleanExprParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(@NotNull BooleanExprParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(@NotNull BooleanExprParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalExpression(@NotNull BooleanExprParser.DecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalExpression(@NotNull BooleanExprParser.DecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull BooleanExprParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull BooleanExprParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(@NotNull BooleanExprParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(@NotNull BooleanExprParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull BooleanExprParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull BooleanExprParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(@NotNull BooleanExprParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(@NotNull BooleanExprParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(@NotNull BooleanExprParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(@NotNull BooleanExprParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull BooleanExprParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull BooleanExprParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryboolExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryboolExpression(@NotNull BooleanExprParser.UnaryboolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryboolExpression}
	 * labeled alternative in {@link BooleanExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryboolExpression(@NotNull BooleanExprParser.UnaryboolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanExprParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull BooleanExprParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExprParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull BooleanExprParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull BooleanExprParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull BooleanExprParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull BooleanExprParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BooleanExprParser#basicBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull BooleanExprParser.LogicalExpressionContext ctx);
}