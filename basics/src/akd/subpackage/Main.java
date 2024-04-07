package akd.subpackage;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        // give input through keyboard
        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);

        System.out.println("The ASCII value of a is: " + (int)a);
        System.out.println("The ASCII value of b is: " + (int)b);
    }
}
