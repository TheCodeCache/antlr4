package com.thecodecache.labs.codegen.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

public class UppercaseMethodListener extends Java8BaseListener {

	private List<String> errors = new ArrayList<String>();

	@Override
	public void enterMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
		TerminalNode node = ctx.Identifier();
		String methodName = node.getText();

		if (Character.isUpperCase(methodName.charAt(0))) {
			errors.add(String.format("Method %s is uppercased!", methodName));
		}
	}

	public List<String> getErrors() {
		return Collections.unmodifiableList(errors);
	}
}