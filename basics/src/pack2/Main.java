package pack2;


public class Main {

    final float pi = 7 / 22f;

    float radius = 5, area = 0;

 

public void calculateArea(){

//    pi = 22/7;

    area = pi * radius * radius;

    System.out.println(" Area of circle is: " + area);

}

 

    public static void main(String[] args) {

        Main obj = new Main();

        obj.calculateArea();

    }

}