package circle;

public class Main {

	public static void main(String[] args) {

		ICircle c1 = new Circle();
	
		c1.setRadius(10);
		
		System.out.println(c1.toString());
		
		
		System.out.printf("Radius = %.2f, Area = %.2f%n",
				c1.getRadius(), c1.computeArea());

		System.out.printf("Count = %d%n", Circle.count);
	}

}
