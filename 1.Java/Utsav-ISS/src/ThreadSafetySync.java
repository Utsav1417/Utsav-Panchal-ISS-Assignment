class A {
	synchronized void sum(int n)
	{

		// Creating a thread instance
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(
				t.getName() + " : " + (n + i));
		}
	}
}

// Class B extending thread class
class B extends Thread {

	// Creating an object of class A
	
	A a = new A();
	
	public void run()
	{

		// Calling sum() method
		
		a.sum(10);
	}
}
class ThreadSafetySync {
	public static void main(String[] args)
	{

		// Creating an object of class B
		B b = new B();

		// Initializing instance t1, t2 of Thread class with object of class B
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);

		t1.setName("Thread A");

		t2.setName("Thread B");

		// Starting thread instance t1 and t2
		t1.start();
		t2.start();
	}
}
