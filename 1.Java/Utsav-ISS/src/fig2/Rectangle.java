package fig2;

public class Rectangle {
	private int length;
	private int width;
	private double Perimeter;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		this.Perimeter = calcPerimeter(length, width);
	}

	public int getBase() {
		return length;
	}

	public int getHeight() {
		return width;
	}

	public double getPeri() {
		return Perimeter;
	}

	public void displayInfo() {
		System.out.println("Length is: " + length);
		System.out.println("Width is: " + width);
		System.out.println("Perimeter of given Rectangle is: " + Perimeter);
	}

	protected double calcPerimeter(int length, int width) {
		return (2) * (length + width);
	}
}
