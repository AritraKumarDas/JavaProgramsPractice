package com.infixpostfixnotations;

import java.util.*;

public class PostfixToInfix {
	public static String postfixToInfix(String postfix) {
		// Initialize an empty stack
		Stack<String> stack = new Stack<>();

		// Iterate over the postfix expression
		for (int i = 0; i < postfix.length(); i++) {
			char c = postfix.charAt(i);

			// If the character is an operand, push it onto the stack
			if (Character.isLetterOrDigit(c)) {
				stack.push(Character.toString(c));
			} else {
				// Pop two operands from the stack and concatenate them with the operator in
				// infix notation
				String operand2 = stack.pop();
				String operand1 = stack.pop();
				String infix = "(" + operand1 + c + operand2 + ")";

				// Push the resulting infix expression onto the stack
				stack.push(infix);
			}
		}
		// The final element in the stack is the fully parenthesized infix expression
		return stack.pop();
	}

	public static void main(String[] args) {
		String postfix = "abcd^e-fgh*+^*+i-";
		String infix = postfixToInfix(postfix);
		System.out.println("Postfix expression: " + postfix);
		System.out.println("Infix expression: " + infix);
	}
}
