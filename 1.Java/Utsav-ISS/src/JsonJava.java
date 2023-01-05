
import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonJava {

	public static void main(String[] args) throws IOException {
		
		// Encoding JSON in Java
		// Creating a JSON object
		JSONObject jsonObj = new JSONObject();
		
		// Putting key value pairs
	    jsonObj.put("Name","Utsav");
	    jsonObj.put("Number", 1417);
	    jsonObj.put("ID","202070"); 
	    jsonObj.put("Age",27);    
	    jsonObj.put("Salary",13000000); 
	    jsonObj.put("isEmployeed",true);

	    // Convert JSON object to string
	    StringWriter out = new StringWriter();
	    jsonObj.writeJSONString(out);
	    
	    // Printing out the JSON string
	    String jsonText = out.toString();
	    System.out.println("Encoded JSON-");
	    System.out.println(jsonText);
	    
	    // Decoding JSON in Java
	    Object obj=JSONValue.parse(jsonText);  
	    JSONObject jsonObject = (JSONObject) obj;  
	  
	    // Getting the values from the keys
	    String name = (String) jsonObject.get("Name");  
	    long number = (Long) jsonObject.get("Number");  
	    String ID = (String) jsonObject.get("ID");
	    long age = (Long) jsonObject.get("Age"); 
	    long salary = (Long) jsonObject.get("Salary"); 
	    boolean isEmployeed = (Boolean) jsonObject.get("isEmployeed");
	    System.out.println("\nDecoded JSON-");
	    System.out.println("Name="+name+", Number="+number+", ID="+ID+", Age="+age+", Salary="+salary+", isEmployeed="+isEmployeed);  
	}

}
