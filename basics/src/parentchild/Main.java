package parentchild;

public class Main {
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.display();     // 1000
		p.salary = 5000;
		p.display();
		
		Child c = new Child();
		c.display();
		c.salary=8000;
		c.display();
	}

}
