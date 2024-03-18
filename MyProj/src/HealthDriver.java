class Health{
	protected int age;
	protected float weight;
	protected float bmi;
}


public class HealthDriver {

	public static void main(String[] args) {
		
		Health obj = new Health();
		obj.age=25;
		obj.weight= 56.65f;
		obj.bmi=99.99f;
		System.out.println(obj.age);
		System.out.println(obj.weight);
		System.out.println(obj.bmi);
		
		

	}

}
