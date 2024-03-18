package com.infixpostfixnotations;

import java.util.*;

public class PostfixEvaluator {
	public static int evaluatePostfix(String postfix) {
		// Initialize an empty stack
		Stack<Integer> stack = new Stack<>();

		// Iterate over the postfix expression
		for (int i = 0; i < postfix.length(); i++) {
			char c = postfix.charAt(i);

			// If the character is an operand, push it onto the stack
			if (Character.isDigit(c)) {
				stack.push(c - '0'); // Convert the character to an integer and push onto the stack
			} else {
				// Pop two operands from the stack and apply the operator to them
				int operand2 = stack.pop();
				int operand1 = stack.pop();
				int result = applyOperator(c, operand1, operand2);

				// Push the result back onto the stack
				stack.push(result);
			}
		}
		// The final element in the stack is the result of the expression
		return stack.pop();
	}

	// Helper method to apply an operator to two operands
	private static int applyOperator(char operator, int operand1, int operand2) {
		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			return operand1 / operand2;
		case '%':
			return operand1 % operand2;
		case '^':
			return (int) Math.pow(operand1, operand2);
		default:
			throw new IllegalArgumentException("Invalid operator");
		}
	}

	public static void main(String[] args) {
		// String postfix = "34+5*6-";
		String postfix = "1230^5-*+";
		int result = evaluatePostfix(postfix);
		System.out.println("Postfix expression: " + postfix);
		System.out.println("Result: " + result);
	}
}
