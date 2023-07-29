import java.util.ArrayList;

public class Day31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleS Sonu = new PeopleS("Sonu", "subedi");
		PeopleS Srijan = new PeopleS("Srijan", "subedi");
		PeopleS Sakshyam = new PeopleS("Sakshyam", "subedi");
		PeopleS Shweta = new PeopleS("Shweta", "subedi");
		PeopleS Salina = new PeopleS("Salina", "subedi");

		ArrayList<PeopleS> students = new ArrayList<>();
		students.add(Sonu);
		students.add(Srijan);
		students.add(Sakshyam);
		students.add(Shweta);
		students.add(Salina);

		students.get(0).displayFullname();

		// for

		for (int i = 0; i < students.size(); i++) {
			// System.out.println(i);
			System.out.println(students.get(i).firstName);
			System.out.println(students.get(i).lastName);
			students.get(i).displayFullname();

		}

		// while loop
		int t1 = 0;
		while (t1 < students.size()) {
			System.out.println(students.get(t1).firstName);
			System.out.println(students.get(t1).lastName);
			students.get(t1).displayFullname();
			t1++;
		}

		// forEach

		for (PeopleS a : students) {
			System.out.println(a.firstName);
			System.out.println(a.lastName);
			a.displayFullname();
		}
	}

}

class PeopleS {
	String firstName;
	String lastName;

	public PeopleS(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void displayFullname() {
		System.out.println(this.firstName + this.lastName);
	}

}