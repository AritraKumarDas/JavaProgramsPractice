package gl.prob1.mainpack;
import java.util.Scanner;

import gl.prob1.matchingbrackets.MatchingBrackets;

// Driver MainClass
public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string of brackets: ");
		String str = sc.nextLine();
		sc.close();
		
		if(str.isEmpty()) {
			System.out.println("The string cannot be empty. Try Again!");
			return;
		}
		
		MatchingBrackets ob = new MatchingBrackets();  // Instance created to invoke utility method
		
		if (ob.isBalanced(str)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}
	
}
