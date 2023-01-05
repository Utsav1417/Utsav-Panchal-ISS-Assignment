public class ThreadSafetyVolatile {

	static volatile int a = 0, b = 0;

	static void one()
	{
		System.out.println("Current Thread: "+Thread.currentThread().getName());
		a++;
		b++;
	}
	static void two()
	{
		System.out.println("Current Thread: "+Thread.currentThread().getName());
		System.out.println(
			"a=" + a + " b=" + b);
	}

	public static void main(String[] args)
	{

		// Creating an instance t1 of Thread class
		Thread t1 = new Thread() {
			public void run()
			{
				for (int i = 0; i < 5; i++)
					
					one();
			}
		};

		// Creating an instance t2 of Thread class
		Thread t2 = new Thread() {
			public void run()
			{
				for (int i = 0; i < 5; i++)
					two();
			}
		};

		// Starting instance t1 and t2
		t1.start();
		t2.start();
	}
}


