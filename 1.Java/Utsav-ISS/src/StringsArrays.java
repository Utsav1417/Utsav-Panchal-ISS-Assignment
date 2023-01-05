import java.util.*;
import java.lang.*;

public class StringsArrays {
	public static void main(String[] args) {

		//Strings
		String personName = "   Alexander  the  Great"     ;

		System.out.println("String : " + personName);
		
		// Printing the length of the string
		System.out.println("The length of the string is = " + personName.length());
		
		// Printing the string in upper case
		System.out.println("The string in uppercase is = " + personName.toUpperCase());
		
		// Printing the string in lower case
		System.out.println("The string in lowercase is = " + personName.toLowerCase());
		
		// Replacing 'e' with 'o'
		System.out.println("Replacing E with O in the string = " + personName.replace('e', 'o'));
		
		// Printing the string without white space
		System.out.println("The string without whitespace is = " + personName.trim());
		
		System.out.println();		
		System.out.println();

		
		
		//Arrays
		int[] intArray=new int[] {1,3,4,2,9,5,6,7,8,10};
		System.out.println("The array is = ");
		for(int x:intArray) System.out.print(x+" ");
		System.out.println();
		
		// Sorting the array in ascending order
		Arrays.sort(intArray);
		System.out.println("\nThe sorted array is = ");
		for(int x:intArray) System.out.print(x+" ");
		System.out.println();
		
		// Filling the array with 0
		Arrays.fill(intArray,0);
		System.out.println("\nThe modified array is = ");
		for(int x:intArray) System.out.print(x+" ");
		System.out.println();
	}
}
 