package pack3;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int[] roll_nos = new int[10];
		int [] marks = {70,45,80,69,74,85};
		
		
		for(int x: roll_nos) {
			System.out.print(x + " " );
		}
		
		System.out.println("\n---------------");
		
		for(int x: marks) {
			System.out.print(x + " ");
		}
		
	}

}