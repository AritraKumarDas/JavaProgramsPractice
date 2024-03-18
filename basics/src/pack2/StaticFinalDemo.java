package pack2;

public class StaticFinalDemo {
	int var1 = 10;
	static int var2 = 10;

	public void method1() {
		var1++;
		System.out.println(var1);
	}

	public void method2() {
		var2++;
		System.out.println(var2);
	}

	public static void main(String[] args) {
		StaticFinalDemo obj = new StaticFinalDemo();
		StaticFinalDemo obj2 = new StaticFinalDemo();
		StaticFinalDemo obj3 = new StaticFinalDemo();
		System.out.println("Using non-static keyword");
		obj.method1();
		obj2.method1();
		obj3.method1();
		System.out.println("\nUsing static keyword");
		obj.method2();
		obj2.method2();
		obj3.method2();
	}
}
