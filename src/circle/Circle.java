package circle;

import misc.Dog;

public class Circle extends Object implements ICircle {

	private static final double DEFAULT_RADIUS = 10.0;
	
	public static int count;
	
	// Properties
	private double radius;
	
	// Constructor
	public Circle() {
		this(DEFAULT_RADIUS);
		count++;
	}
	
	public Circle(double radius) {
		setRadius(radius);
		count++;
	}

	// Methods
	
	@Override
	public double getRadius() {
		return radius;
	}

	@Override
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "I am a circle whose radius is " + radius;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Circle))
			return false;
			
		ICircle other = (ICircle) object;
		
		return other.getRadius() == getRadius();
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		String s1 = new String("Hello World");
		
		if (c1.equals(s1))
			System.out.println("True");
		else
			System.out.println("False");
			
	}
}
