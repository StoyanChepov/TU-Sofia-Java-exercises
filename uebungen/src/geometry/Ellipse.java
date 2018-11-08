package geometry;

public class Ellipse {
	private Point startPoint;
	private double a;
	private double b;

	public Ellipse() {
		startPoint = new Point(0, 0);
		this.a = 1;
		this.b = 1;
	}

	public Ellipse(Point startPoint, double a, double b) {
		this.startPoint = new Point(startPoint);
		this.a = a;
		this.b = b;

	}

	public Ellipse(Ellipse otherEllipse) {
		startPoint = new Point(otherEllipse.startPoint);
		this.a = otherEllipse.a;
		this.b = otherEllipse.b;
	}

	public boolean isValid() {
		return (a > 0 && b > 0);

	}

	public void initialize() {
		do {
			System.out.println("Anfangspunkt der Ellipse:");
			startPoint.initialize();
			System.out.print("Halbachse a: ");
			a = Help.INPUT.nextDouble();
			System.out.print("Halbachse b: ");
			b = Help.INPUT.nextDouble();
		} while (!isValid());

	}

	public double calculatePerimeter() {
		return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));

	}

	public double calculateArea() {
		return Math.PI * a * b;

	}

	public String getType() {
		return (a == b) ? "Kreis" : "Ellipse";

	}

	public String toString() {
		int a=(int) (this.a);
		int b=(int) (this.b);
		return startPoint + "-[" + a + ", " + b + "]";

	}

	public void print() {
		double perimeter = calculatePerimeter();
		System.out.format("%s, %s, U=%.2f, F=%.2f\n", this, getType(), perimeter, calculateArea());

	}

	public boolean equal(Ellipse otherEllipse) {
		boolean sameA = Help.equal(a, otherEllipse.a);
		boolean sameB = Help.equal(b, otherEllipse.b);
		boolean sameAReversed = Help.equal(a, otherEllipse.b);
		boolean sameBReversed = Help.equal(b, otherEllipse.a);

		return (sameA && sameB) || (sameAReversed && sameBReversed);
	}

}