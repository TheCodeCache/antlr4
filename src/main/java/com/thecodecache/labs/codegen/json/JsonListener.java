// Generated from Json.g4 by ANTLR 4.4

package com.thecodecache.labs.codegen.json;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(@NotNull JsonParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(@NotNull JsonParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(@NotNull JsonParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(@NotNull JsonParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull JsonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull JsonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull JsonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull JsonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(@NotNull JsonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(@NotNull JsonParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(@NotNull JsonParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(@NotNull JsonParser.JsonObjectContext ctx);
}