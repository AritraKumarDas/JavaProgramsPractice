package inheritance;

class InheritanceA {

	public float circleArea(float radius){
		
		return (22/7 * radius * radius);	
	}
}

class InheritanceB extends InheritanceA {

	public float rectangleArea(float length, float breadth){
		
		return (length * breadth);	
	}
}

class InheritanceC extends InheritanceB{

	public float triangleArea(float base, float height){
		
		return (1/2f * base * height);	
	}
}

public class Main{
	public static void main(String[] args) {
		
		InheritanceC obj = new InheritanceC();
		
		float circlearea = obj.circleArea(7.5f);
		float rectanglearea = obj.rectangleArea(7.2f, 9f);
		float trianglearea = obj.triangleArea(52.9f, 8.9f);
		
		System.out.println("Area of Circle = " + circlearea);
		System.out.println("Area of Rectangle = " + rectanglearea);
		System.out.println("Area of Triangle = " + trianglearea);
		
	}
}




