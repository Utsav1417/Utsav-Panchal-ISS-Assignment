import java.util.Scanner;

// Data Types = https://www.w3schools.com/java/java_data_types.asp
// Modifiers = https://www.w3schools.com/java/java_modifiers.asp

public class Basics_2 {	
	
	String personName;
	
	//Modifiers
	final int x = 10;
	private int data=40;  
	private void msg(){System.out.println("Hello java");}  
	
	// Constructor
	Basics_2(String inputName){
		    System.out.println("Constructor Called:");
		    personName = inputName;
		  }
	}


class Test{
	public static void main(String[] args) {
		
		Basics_1 object1 = new Basics_1();
		System.out.print("Enter Name: ");
		Scanner in = new Scanner(System.in);
		String inputName = in.next();
		
		// constructor is invoked while
	    // creating an object of the Main class
		Basics_2 obj = new Basics_2(inputName);
	    System.out.println("The person's name is " + obj.personName);
	    
	    //obj.x = 50; // will generate an error: cannot assign a value to a final variable
	  
	    //System.out.println(obj.data);//Compile Time Error  
	    //obj.msg();//Compile Time Error  
	    
	    // Line number 36, 38 and 39 will give error. 
	    // But I have kept it to demonstrate the working of modifiers

	}
}
