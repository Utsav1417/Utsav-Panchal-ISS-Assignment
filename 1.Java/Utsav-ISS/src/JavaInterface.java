import java.util.*;
import java.io.*;
import java.lang.*;

interface branch {
	String Cname = "";

	void attributes();
}

class Hostel {
	String cname;
	String location;

	void H_setter(String cname, String location) {
		this.cname = cname;
		this.location = location;
	}

	void getcname() {
		System.out.println("\nThe Name of College is: " + cname);
	}

	void getlocation() {
		System.out.println("Location: " + location);
	}

	void disp_Cdetails() {
		getcname();
		getlocation();
	}
}

class Student extends Hostel {
	static ArrayList<Student> EXTC_Branch = new ArrayList<Student>();
	static ArrayList<Student> COMPS_Branch = new ArrayList<Student>();
	static ArrayList<Student> Students = new ArrayList<Student>();
	String sname = "";
	int uid;
	String branch = "";
	String bhead = "";
	float cgpa;
	String subjects[] = new String[] { "LA", "SS", "PSP", "ED", "NT" };

	int marks[] = new int[5];

	void S_setter(String sname, int uid, String branch, String bhead, float cgpa) {
		this.sname = sname;
		this.uid = uid;
		this.branch = branch;
		this.bhead = bhead;
		this.cgpa = cgpa;
	}

	void getsname() {
		System.out.println(" \nName of the Student: " + sname);
	}

	void getuid() {
		System.out.println("UID: " + uid);
	}

	void getbranch() {
		System.out.println("Branch: " + branch);
	}

	void gethbranch() {
		System.out.println("Branch Head: " + bhead);
	}

	void getcgpa() {
		System.out.println("CGPA: " + cgpa);
	}

	float n = marks.length;

	public static float avgmarks(Student obj) {
		float sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += obj.marks[i];
		}
		return sum / 5;

	}

	void disp_Sdetails() {
		getsname();
		getuid();
		getbranch();
		gethbranch();
		getcgpa();
		System.out.println("Marks of " + sname + " are:");
		for (int i = 0; i < 5; i++) {
			System.out.print(this.subjects[i] + " ");
			System.out.print(this.marks[i] + " ");
			System.out.println();
		}
	}

	public static void changeStudent(String prebranch, int del_uid, String newbranch) {
		if (prebranch == "EXTC") {
			for (Student s : EXTC_Branch) {
				if (s.uid == del_uid) {
					EXTC_Branch.remove(s);
					if (newbranch == "COMPS") {
						COMPS_Branch.add(s);
					}
					break;
				}
			}
		} else if (prebranch == "COMPS") {
			for (Student s : COMPS_Branch) {
				if (s.uid == del_uid) {
					COMPS_Branch.remove(s);
					if (newbranch == "EXTC") {
						EXTC_Branch.add(s);
					}
					break;
				}

			}
			System.out.println("Removed from " + prebranch + " and added to " + newbranch + " Successfully ");
		}
	}

	public static class JavaInterface {
		public static void main(String[] args) {
			boolean next_stop;
			while (true) {
				System.out.println("==========================================");
				System.out.println(
						"Enter your choice \n 1.Enter College Details\n 2.Admit New Student \n 3.Migrate Branch \n 4. Get Details (uid)\n 5.Exit\n");
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				switch (n) {
				case 1:
					next_stop = false;
					while (!next_stop) {
						Hostel h1 = new Hostel();
						System.out.println("Enter the College Name");
						String cname = sc.next();
						System.out.println("Enter the Location");
						String location = sc.next();
						h1.H_setter(cname, location);
						h1.disp_Cdetails();
						break;
					}
					break;
				case 2:
					next_stop = false;
					while (!next_stop) {
						Student s1 = new Student();

						System.out.println("Enter the Student name");
						String sname = sc.next();
						System.out.println("Enter the UID:");
						int uid = sc.nextInt();
						System.out.println("Enter Branch:");
						String branch = sc.next();
						System.out.println("Enter Branch Head:");
						String bhead = sc.next();
						System.out.println("Enter the CGPA:");
						float cgpa = sc.nextFloat();
						s1.S_setter(sname, uid, branch, bhead, cgpa);
						System.out.println("Enter " + sname + "'s marks ");
						for (int i = 0; i < 5; i++) {
							System.out.println("Marks of " + s1.subjects[i] + " are");
							int mark = sc.nextInt();
							s1.marks[i] = mark;
						}
						System.out.println("Average of Marks is " + s1.avgmarks(s1));
						if (branch.equals("EXTC")) {
							Student.EXTC_Branch.add(s1);
						} else if (branch.equals("COMPS")) {
							Student.COMPS_Branch.add(s1);
						}
						Student.Students.add(s1);
						break;
					}
					break;
				case 3:
					next_stop = false;
					while (!next_stop) {
						System.out.println("Enter your current Branch:");
						sc.next();
						String pbranch = sc.nextLine();
						System.out.println("Enter the New Branch:");
						String nbranch = sc.nextLine();

						System.out.println("Enter your UID");
						int uid2 = sc.nextInt();
						Student.changeStudent(pbranch, uid2, nbranch);
						break;
					}
					break;
				case 4:
					next_stop = false;
					while (!next_stop) {
						System.out.println("Enter your UID");
						int check_uid = sc.nextInt();
						for (Student s : Student.Students) {
							if (s.uid == check_uid) {
								s.disp_Sdetails();
							}
						}
						break;
					}
					break;
				case 5:
					next_stop = false;
					while (!next_stop) {
						System.out.println("Exiting ");
						break;
					}
					break;
				default:
					System.out.println("Bye\n");
				}
			}
		}
	}
}