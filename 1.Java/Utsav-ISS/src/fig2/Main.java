package fig2;

import java.util.*;
import fig1.*;
import fig2.Rectangle;

public class Main {
	public static void main(String[] args) {
		System.out.print("Find the Perimeter of the any given shapes: \n\n");
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println(
					"Press 1 for Square\nPress 2 for Rectangle\nPress 3 for Circle\nPress 0 to Exit\nYour Choice: ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter side-length of Square: ");
				int side = sc.nextInt();
				Square s1 = new Square(side);
				s1.displayInfo();
				System.out.println("=============================================");
			} else if (choice == 2) {
				System.out.println("Enter length of Rectangle: ");
				int length = sc.nextInt();
				System.out.println("Enter width of Rectangle: ");
				int width = sc.nextInt();
				Rectangle t1 = new Rectangle(length, width);
				t1.displayInfo();
				System.out.println("=============================================");
			} else if (choice == 3) {
				System.out.println("Enter radius of Circle: ");
				int radius = sc.nextInt();
				Circle c1 = new Circle(radius);
				c1.displayInfo();
				System.out.println("=============================================");
			} else if (choice == 0) {
				run = false;
			} else {
				System.out.println("Invalid Choice!");
			}
			System.out.println("=============================================");
		}
		sc.close();
	}
}