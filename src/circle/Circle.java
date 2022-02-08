package circle;

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
		ICircle other = (ICircle) object;
		
		return other.getRadius() == getRadius();
	}

}
