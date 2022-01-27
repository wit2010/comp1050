package circle;

public class Main {

	public static void main(String[] args) {

		ICircle c = new Circle();

		c.setRadius(10);
		
		System.out.printf("Radius = %.2f, Area = %.2f%n",
				c.getRadius(), c.computeArea());
	}

}
