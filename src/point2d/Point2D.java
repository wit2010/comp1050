package point2d;

public class Point2D {
	
	private final double x;
	private final double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}	

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double computeDistance(Point2D point) {
		// To implement
		
		return 0.0;
	}
	

	public static void main(String[] args) {
		
		if (args.length != 4) {
			System.out.println("Please enter X1, Y1, X2, Y2");
			return;
		}

		double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);

		Point2D point1 = new Point2D(x1, y1);
		
		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);

		Point2D point2 = new Point2D(x2, y2);

		point1.computeDistance(point2);
		point2.computeDistance(point1);
	}

}
