import java.util.Scanner;

class Bank {
	int amount;
	int months;
	int interest;

	void checkbalance() {
		System.out.println("");
	}

	void getInterest(int interest) {
		System.out.println("");
	}

	void withdrawl(int amt) {
		System.out.println("\n");
	}

}

class ICICI extends Bank {
	int balance = 1000;
	float interest = 7;

	void checkbalance() {
		System.out.println("Your Current Balance is: " + balance);
		System.out.println();
		System.out.println("===================================================");
	}

	void getInterest(int principle) {
		if (principle < 500) {
			System.out.println("Principle Amount Cannot be less than 500");
			System.out.println("===================================================");
		} else {
			System.out.println("Enter the Period(Years): ");
			Scanner ss = new Scanner(System.in);
			months = ss.nextInt();
			float tempint = principle * ((interest / 100) * months);
			System.out.println("The Interest of Your Loan will be: " + tempint);
			System.out.println();

			float finalam = principle + tempint;
			System.out.println("The Final Amount of Your Loan will be: " + finalam);
			System.out.println();
			System.out.println("===================================================");
			System.out.println("Are you sure want to accept this loan ? If YES, Press Y");
			char confirm = ss.next().charAt(0);

			if (confirm == 'Y') {
				balance += principle;
			}
			System.out.println("The New Balance is: " + balance);
			System.out.println("===================================================");
			ss.close();
		}
	}

	void withdraw(int with) {
		if (with > balance) {
			System.out.println("Your account balance is not sufficient to withdraw " + with + " Rupees");
			System.out.println();
			System.out.println("===================================================");
		} else {
			balance -= with;
			System.out.println("Your New Account Balance is " + balance);
			System.out.println();
			System.out.println("===================================================");
		}
	}

}

class AXIS extends Bank {
	int balance = 3000;
	float interest = 9;

	void checkbalance() {
		System.out.println("Your Current Balance is: " + balance);

		System.out.println("===================================================");
		System.out.println();
	}

	void getInterest(int principle) {
		if (principle < 300) {
			System.out.println("Principle Amount Cannot be less than 300");
			System.out.println("===================================================");
		} else {
			System.out.println("Enter the Period(Years): ");
			Scanner ss = new Scanner(System.in);
			months = ss.nextInt();
			float tempint = principle * ((interest / 100) * months);
			System.out.println("The Interest of Your Loan will be: " + tempint);
			System.out.println();

			float finalam = principle + tempint;
			System.out.println("The Final Amount of Your Loan will be: " + finalam);
			System.out.println();
			System.out.println("===================================================");
			System.out.println("Are you sure want to accept this loan ? If YES, Press Y");
			char confirm = ss.next().charAt(0);
			if (confirm == 'Y') {
				balance += principle;
			}
			System.out.println("The New Balance is: " + balance);
			System.out.println("===================================================");
			ss.close();
		}
	}

	void withdraw(int with) {
		if (with > balance) {
			System.out.println("Your account balance is not sufficient to withdraw " + with + " Rupees");
			System.out.println();
			System.out.println("===================================================");
		} else {
			balance -= with;
			System.out.println("Your New Account Balance is " + balance);
			System.out.println();
			System.out.println("===================================================");
		}
	}

}

class SBI extends Bank {
	int balance = 5000;
	float interest = 8;

	void checkbalance() {
		System.out.println("Your Current Balance is: " + balance);
		System.out.println("===================================================");
	}

	void getInterest(int principle) {
		if (principle < 100) {
			System.out.println("Principle Amount Cannot be less than 100");
			System.out.println("===================================================");
		} else {

			System.out.println("Enter the Period(Years): ");
			Scanner ss = new Scanner(System.in);
			months = ss.nextInt();
			float tempint = principle * ((interest / 100) * months);
			System.out.println("The Interest of Your Loan will be: " + tempint);
			System.out.println();

			float finalam = principle + tempint;
			System.out.println("The Final Amount of Your Loan will be: " + finalam);
			System.out.println();
			System.out.println("===================================================");
			System.out.println("Are you sure want to accept this loan ? If YES,Press Y");
			char confirm = ss.next().charAt(0);
			if (confirm == 'Y') {
				balance += principle;
			}
			System.out.println("The New Balance is: " + balance);
			System.out.println("===================================================");

			ss.close();
		}
	}

	void withdraw(int with) {
		if (with > balance) {
			System.out.println("Your account balance is not sufficient to withdraw " + with);
			System.out.println();
			System.out.println("===================================================");
		} else {
			balance -= with;
			System.out.println("Your New Account Balance is " + balance);

			System.out.println();
			System.out.println("===================================================");
		}

	}

}

class PolymorphismOverriding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		ICICI a = new ICICI();
		AXIS b = new AXIS();
		SBI c = new SBI();
		while (!stop) {
			boolean next_stop;
			System.out.print("Enter your choice:\n 1.ICICI Bank \n 2.AXIS \n 3.SBI \n 4.Exit \n");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				next_stop = false;
				while (!next_stop) {
					System.out.println("===================================================");
					System.out.println("Welcome to ICICI Bank");
					System.out
							.print("Enter your choice:\n 1.Check Balance\n 2.Ask for loan \n 3.Withdraw \n 4.Exit \n");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						a.checkbalance();
						break;
					case 2:
						System.out.println("Rate of Interest is " + a.interest + "% \n");
						System.out.println("Enter the Amount You want Loan for: ");
						int principle = sc.nextInt();
						a.getInterest(principle);
						break;
					case 3:
						System.out.println("Enter the Amount You want to Withdraw: ");
						int with = sc.nextInt();
						a.withdraw(with);
						break;
					case 4:
						System.out.println("Thanks for visiting ICICI Bank");
						next_stop = true;
						break;
					default:
						System.out.println("Enter correct option \n");
					}
				}
				break;

			case 2:
				next_stop = false;
				while (!next_stop) {
					System.out.println("===================================================");
					System.out.println("Welcome to AXIS Bank");
					System.out
							.print("Enter your choice:\n 1.Check Balance\n 2.Ask for loan \n 3.Withdraw \n 4.Exit \n");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						b.checkbalance();
						break;
					case 2:
						System.out.println("Rate of Interest is " + a.interest + "% \n");
						System.out.println("Enter the Amount You want Loan for: ");
						int principle = sc.nextInt();
						b.getInterest(principle);
						break;
					case 3:
						System.out.println("Enter the Amount You want to Withdraw: ");
						int with = sc.nextInt();
						b.withdraw(with);
						break;
					case 4:
						System.out.println("Thanks for visiting AXIS Bank");
						next_stop = true;
						break;
					default:
						System.out.println("Enter correct option \n");
					}
				}
				break;
			case 3:
				next_stop = false;
				while (!next_stop) {
					System.out.println("===================================================");
					System.out.println("Welcome to SBI Bank");
					System.out
							.print("Enter your choice:\n 1.Check Balance\n 2.Ask for loan \n 3.Withdraw \n 4.Exit \n");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						c.checkbalance();
						break;
					case 2:
						System.out.println("Rate of Interest is " + a.interest + "% \n");
						System.out.println("Enter the Amount You want Loan for: ");
						int principle = sc.nextInt();
						c.getInterest(principle);
						break;
					case 3:
						System.out.println("Enter the Amount You want to Withdraw: ");
						int with = sc.nextInt();
						c.withdraw(with);
						break;
					case 4:
						System.out.println("Thanks for visiting SBI Bank");
						next_stop = true;
						break;
					default:
						System.out.println("Enter correct option \n");
					}
				}
				break;
			default:
				System.out.println("Bye\n");
			}
		}
	}
}
