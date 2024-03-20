package arithmetic;

class Superclass {
    int rollNo = 10;
    public void displayRoll() {
    	System.out.println(rollNo);
    }
}

class Subclass extends Superclass {
    int rollNo = 20;
    public void displayRoll() {
    	System.out.println(rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
    	
        Superclass obj = (Superclass)new Subclass();

        System.out.println(obj.rollNo);  // This will print 10, not 20
        obj.displayRoll();
    }
}

