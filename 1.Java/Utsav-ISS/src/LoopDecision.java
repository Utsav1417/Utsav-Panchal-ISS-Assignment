import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class LoopDecision {

	public static void main(String[] args) {
		
		// Looping control
		// Using a loop to display the square first n terms.
		System.out.println("Looping Control");
		int n = 10;
		System.out.println("Square of 1 to " + n + " terms:");
		for (int i = 1; i <= n; i++) {
			double ans = Math.pow(i,2);
			System.out.print("Square of " + i + " is " + ans + ".\n\n");
		}
		
		// Decision Making
		System.out.println("Decision Making");
		System.out.println("Enter the time: ");
		Scanner in = new Scanner(System.in);
		int inputTime = in.nextInt();
		int time = inputTime;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 18) {
		  System.out.println("Good Afternoon.");
		} else {
		  System.out.println("Good evening.");
		}

	}

}
