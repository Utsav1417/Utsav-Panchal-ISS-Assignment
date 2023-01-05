package fig1;

public class Circle {
	private int radius;
	private double circumference;

	public Circle(int radius) {
		this.radius = radius;
		this.circumference = calcCircum(radius);
	}

	public int getRadius() {
		return radius;
	}

	public double getCircum() {
		return circumference;
	}

	public void displayInfo() {
		System.out.println("Radius is: " + radius);
		System.out.println("Circumference of given Circle is: " + circumference);
	}

	protected double calcCircum(int radius) {
		return (Math.PI) * (radius * 2);
	}
}
