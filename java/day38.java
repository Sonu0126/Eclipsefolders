import java.util.List;

import java.util.stream.Collectors;

public class day38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (Program1)
		List<PersonS> people = List.of(new PersonS("Sonika", 24, "Biratnager"), new PersonS("Srijal", 20, "Damak"),
				new PersonS("Ishan", 27, "Itahari"), new PersonS("Apsara", 26, "dharan"),
				new PersonS("Sisam", 23, "ktm")

		);

		// collect people below age 25

		List<PersonS> belowAge25 = people.stream().filter(person -> person.getAge() < 25).collect(Collectors.toList());
		System.out.println(belowAge25);

		// looping using For Each loop
		for (int i = 0; i < belowAge25.size(); i++) {
			System.out.println(belowAge25.get(i).getAge());
			System.out.println(belowAge25.get(i).getName());
			System.out.println(belowAge25.get(i).getCity());
		}

		// Map&collect(Program 2)
		// print only Names("Sonika","Srijal","Ishan","Apsara","Sisam")
		List<String> names = people.stream().map(person -> person.getName()).collect(Collectors.toList());
		for (String nm : names) {
			System.out.println(nm);

		}

//(program3)print city & name "Sonika:Biratnagar"
		List<String> n = people.stream().map(Person -> Person.getName().concat(" :").concat(Person.getCity()))
				.collect(Collectors.toList());

		for (String nC : n) {
			System.out.println(nC);
		}

	}

}

class PersonS {
	private String name;
	private int age;
	private String city;

	public PersonS(String nm, int ag, String ct) {
		this.name = nm;
		this.age = ag;
		this.city = ct;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getCity() {
		return this.city;
	}

}