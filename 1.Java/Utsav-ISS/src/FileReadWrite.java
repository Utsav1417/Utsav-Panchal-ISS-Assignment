
import java.util.*;
import java.io.*;

public class FileReadWrite {

	public static void main(String[] args) {
		
		// Creating and writing to a text file
		try {
            FileWriter Writer = new FileWriter("UtsavAssignmentISS.txt");
            Writer.write("The author of this file is Utsav The Great. This is file handling in Java.");
            Writer.close();
            System.out.println("Successfully written.");
        }
		// Catching IO Exception 
        catch (IOException e) {
            System.out.println("ERROR Occurred! Learn some coding and come back.");
            e.printStackTrace();
        }
		
		// Reading the newly created file using the Scanner object
		try {
            File Obj = new File("UtsavAssignmentISS.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
		// Catching exceptions in case the file does not exist.
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
	}

}
