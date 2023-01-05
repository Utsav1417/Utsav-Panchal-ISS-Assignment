import java.util.*;

class CollectionArrayList {
	public static void main(String args[]) {
		// creating ArrayList of string type
		ArrayList<String> arrList = new ArrayList();

		// adding few elements
		arrList.add("Cricket"); // list: ["Cricket"]
		arrList.add("Hockey"); // list: ["Cricket", "Hockey"]

		// inserting element at first position, index 0
		// represents first element because ArrayList is based
		// on zero based indexing system
		arrList.add(0, "BasketBall"); // list: ["BasketBall", "Cricket", "Hockey"]

		System.out.println("ArrayList Elements: ");
		// Traversing ArrayList using enhanced for loop
		for (String str : arrList)
			System.out.println(str);
	}
}