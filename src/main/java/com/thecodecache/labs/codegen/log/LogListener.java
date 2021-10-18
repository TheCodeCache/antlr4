// Generated from Log.g4 by ANTLR 4.4
package com.thecodecache.labs.codegen.log;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogParser}.
 */
public interface LogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(@NotNull LogParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(@NotNull LogParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(@NotNull LogParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(@NotNull LogParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(@NotNull LogParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(@NotNull LogParser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(@NotNull LogParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(@NotNull LogParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(@NotNull LogParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(@NotNull LogParser.TimestampContext ctx);
}