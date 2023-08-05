import java.util.Arrays;
import java.util.List;

public class Day36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object for employees class
		Employees[] employees = { new Employees(26, "Sonika Subedi", 500), new Employees(21, "Prakash Bastola", 1000),
				new Employees(16, "Shwets Subedi", 200), new Employees(04, "Avir Bhattrai", 10)

		};

		for (int i = 0; i <= employees.length - 1; i++) {
			employees[i].displayFullName();
		}

		List<Employees> emplist = Arrays.asList(employees);

		// forEach()

		emplist.stream().forEach(emp -> emp.incrementSalary(10));

		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].salary);
		}

	}

}

class Employees {
	int id;
	String fullName;
	int salary;

	public Employees(int id, String fn, int sal) {
		this.id = id;
		this.fullName = fn;
		this.salary = sal;
	}

	public void displayFullName() {
		System.out.println(this.fullName);
	}

	public void incrementSalary(int x) {
		this.salary = this.salary + x;
	}

}