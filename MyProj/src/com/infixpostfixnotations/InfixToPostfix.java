package com.infixpostfixnotations;

import java.util.*;

public class InfixToPostfix {
	public static String infixToPostfix(String infix) {
		// Initialize an empty stack and result string
		Stack<Character> stack = new Stack<>();
		StringBuilder postfix = new StringBuilder();

		// Iterate over the infix expression
		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);

			// If the character is an operand, append it to the postfix string
			if (Character.isLetterOrDigit(c)) {
				postfix.append(c);
			}
			// If the character is a left parenthesis, push it onto the stack
			else if (c == '(') {
				stack.push(c);
			}
			// If the character is a right parenthesis, pop all operators from the stack
			// until a left parenthesis is reached
			else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				}
			}
			// If the character is an operator, pop all operators with higher or equal
			// precedence and append them to the postfix string
			else {
				while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
					postfix.append(stack.pop());
				}
				stack.push(c);
			}
		}
		// Pop any remaining operators from the stack and append them to the postfix
		// string
		while (!stack.isEmpty()) {
			if (stack.peek() == '(') {
				return "Invalid expression";
			}
			postfix.append(stack.pop());
		}
		return postfix.toString();
	}

	// Helper method to determine operator precedence
	private static int precedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
		}
	}

	public static void main(String[] args) {
		String infix = "a+b*(c^d-e)^(f+g*h)-i";
		// String infix = "a+b-c*d";
		// String infix = "x+y*(z^p-q)";
		String postfix = infixToPostfix(infix);
		System.out.println("Infix expression: " + infix);
		System.out.println("Postfix expression: " + postfix);
	}
}
