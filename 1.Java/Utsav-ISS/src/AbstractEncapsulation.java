
//Encapsulation
class Encapsulation {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}

}

//Abstraction
abstract class Car {
	public abstract void run();
}

class Honda extends Car {
	public void run() {
		System.out.println("\nCar is Running.");
	}
}


public class AbstractEncapsulation{
	public static void main(String[] args) {

		Encapsulation varEncap = new Encapsulation();

		varEncap.setName("Utsav");
		System.out.print("Name: " + varEncap.getName());

		Car car = new Honda();
		car.run();
	}
}