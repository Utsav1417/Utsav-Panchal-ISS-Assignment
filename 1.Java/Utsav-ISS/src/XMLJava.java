
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class XMLJava {

	public static void main(String[] args) {
		try {
			// Creating a constructor of file class and parsing an XML file
			File file = new File("C:/Users/Utsav/eclipse-workspace/Utsav-ISS/src/XMLFile.xml");
			
			// An instance of factory that gives a document builder
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			
			// An instance of builder to parse the specified XML file
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Student");
			
			// NodeList is not iterable, so we are using for loop
			for (int itr = 0; itr < nodeList.getLength(); itr++) {
				Node node = nodeList.item(itr);
				System.out.println("\nNode Name: " + node.getNodeName());
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					System.out.println("Student Roll Number: " 
			                  + eElement.getAttribute("rollno"));
					System.out.println(
							"Name: " + eElement.getElementsByTagName("Name").item(0).getTextContent());
					System.out.println(
							"Marks: " + eElement.getElementsByTagName("Marks").item(0).getTextContent());
					System.out.println("Address: " + eElement.getElementsByTagName("Address").item(0).getTextContent());
					System.out.println("Branch: " + eElement.getElementsByTagName("Branch").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
