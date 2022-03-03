package generics;

public class Circle implements ICircle, Comparable<Circle> {

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

	@Override
	public int compareTo(Circle circle) {
		return this.getRadius() > circle.getRadius()? 1:
			(this.getRadius() < circle.getRadius()? -1: 0);
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		
		System.out.println(c1.compareTo(c2));
	}

}
