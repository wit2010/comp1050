package circle;

public class Circle implements ICircle {

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
	}

}
