import java.util.*;
import java.lang.*;

class Utsav_QueErr extends Exception {
	public Utsav_QueErr(String message) {
		super(message);
	}
}

class Queue {
	int size;
	int fr = -1;
	int re = -1;
	Integer[] utsavque;

	public Queue(int size) {
		this.size = size;
		utsavque = new Integer[size];
	}

	public void insert(int number) throws Exception, Utsav_QueErr {
		try {
			if (re == size - 1) {
				throw new Utsav_QueErr("Queue Overflow");
			} else if (fr == -1) {
				re++;
				utsavque[re] = number;
				fr = re;
			} else {
				re++;
				utsavque[re] = number;
			}
		} catch (Utsav_QueErr Q) {
			Q.printStackTrace();
		}
	}

	public void delete() throws Exception, Utsav_QueErr {
		try {
			if (fr == -1 && re == -1) {
				throw new Utsav_QueErr("Queue Underflow");
			} else if (fr == re) {
				System.out.println("\nRemoved " + utsavque[fr] + " from Queue");
				utsavque[fr] = null;
				fr--;
				re--;
			} else {
				System.out.println("\nRemoved " + utsavque[fr] + " from Queue");
				utsavque[fr] = null;
				for (int i = fr + 1; i <= re; i++) {
					utsavque[i - 1] = utsavque[i];
				}
				re--;
			}
		} catch (Utsav_QueErr Q) {
			Q.printStackTrace();
		}
	}

	public void display() throws Exception, Utsav_QueErr {
		try {
			if (fr == -1)
				throw new Utsav_QueErr("Queue is Empty");
			else {
				System.out.print("\nQueue is: \n");
				for (int i = fr; i <= re; i++) {
					System.out.println(utsavque[i]);
				}
			}
		} catch (Utsav_QueErr Q) {
			Q.printStackTrace();
		}
	}
}

class ExceptionHandling {
	public static void main(String[] args) throws Exception, Utsav_QueErr {
		Scanner scan = new Scanner(System.in);
		System.out.print("\n \t Exception Handling \t\n ");
		System.out.print("\n Enter size of Queue array: ");
		int size = scan.nextInt();
		Queue que = new Queue(size);
		char ch;
		try {
			while (true) {
				System.out.println("\n====================");
				System.out.println("Press 1 to Insert");
				System.out.println("Press 2 to Delete");
				System.out.println("Press 3 to Exit");
				System.out.println("====================\n");
				System.out.println("Your Choice : ");
				char opt = scan.next().charAt(0);
				switch (opt) {
				case '1':
					System.out.print("Enter integer you want to insert: ");
					que.insert(scan.nextInt());
					que.display();
					break;
				case '2':
					que.delete();
					que.display();
					break;
				case '3':
					System.out.print("Thanks for checking the code :) ");
					return;
				default:
					System.out.println("Kindly enter valid input");
				}
			}
		} catch (Utsav_QueErr Q) {
			Q.printStackTrace();
		}
	}
}