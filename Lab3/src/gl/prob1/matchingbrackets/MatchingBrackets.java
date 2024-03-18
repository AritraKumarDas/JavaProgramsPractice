package gl.prob1.matchingbrackets;

import java.util.Stack;

// MatchingBrackets utility class created
public class MatchingBrackets {

	// isBalance() method to check whether string contains balanced brackets 
	public boolean isBalanced(String str) {		
		char[] arr = str.toCharArray();   // string converted to char array
		
		// Stack Data Structure from Java Collections used
		Stack<Character> stack = new Stack<Character>(); 

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			switch (ch) {
			case '[':
			case '{':
			case '(':
				stack.push(ch);
				break;
			case ']':

				if (stack.isEmpty() || stack.pop() != '[') {
					return false;

				}
				break;
			case '}':
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;

				}
				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;

				}
				break;

			default:
				return false;

			}

		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
