package com.thecodecache.labs.codegen.json;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Printer for the Abstract Syntax Tree
 * 
 * @author manoranjan
 */
public class AstPrinter {

	public static void print(RuleContext ctx) {
		explore(ctx, 0);
	}

	// recursively explores the parse tree
	private static void explore(RuleContext ctx, int indentation) {
		String ruleName = JsonParser.ruleNames[ctx.getRuleIndex()];
		for (int i = 0; i < indentation; i++) {
			System.out.print("  ");
		}
		System.out.println(ruleName);
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ParseTree element = ctx.getChild(i);
			if (element instanceof RuleContext) {
				explore((RuleContext) element, indentation + 1);
			}
		}
	}

}
