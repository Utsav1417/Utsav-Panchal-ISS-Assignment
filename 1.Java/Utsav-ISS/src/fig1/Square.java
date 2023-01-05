package fig1;

public class Square {
	private int side;
	private double Perimeter;

	public Square(int side) {
		this.side = side;
		this.Perimeter = calcPeri(side);
	}

	public int getSide() {
		return side;
	}

	public double getPeri() {
		return Perimeter;
	}

	public void displayInfo() {
		System.out.println("Side length is: " + side);
		System.out.println("Perimeter of given Square is: " + Perimeter);
	}

	protected double calcPeri(int side) {
		return 4 * side;
	}
}