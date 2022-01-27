package circle;

public class Circle implements ICircle {

	// Properties
	private double radius;
	
	// Constructor
	public Circle() {
	}

	public Circle(double radius) {
		setRadius(radius);
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

}
