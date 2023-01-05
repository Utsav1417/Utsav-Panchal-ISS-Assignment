import java.util.*;
import java.util.Scanner;

public class Basics_1 {

	// Instance variables
		String Name;
		
		// Instance methods
		public void helloPerson() {
			System.out.println("Hello " + Name);
		}
}

class Person{
	public static void main(String[] args) {
		
		System.out.println("Welcome to Utsav-ISS Project");
		
		// Creating an object
		Basics_1 object1 = new Basics_1();

		System.out.print("Enter Name: ");
		Scanner in = new Scanner(System.in);
		String inputName = in.next();
		object1.Name= inputName;
		object1.helloPerson();
	}
}
