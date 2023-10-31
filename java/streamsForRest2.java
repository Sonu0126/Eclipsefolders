package packageName;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamsForRest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Human> people = new ArrayList<>();
		people.add(new Human("Sonika", "Subedi", 21));
		people.add(new Human("Salina", "Dhakal", 25));
		people.add(new Human("Tara", "Dangal", 48));
		people.add(new Human("Sanjay", "Subedi", 50));
		people.add(new Human("Sonika", "Bastola", 36));
		people.add(new Human("Sneha", "Subedi", 21));
		people.add(new Human("Sneha", "Parajuli", 25));

		// age above 25
//		List<Human> ageAbove25 = people.stream().filter(x -> x.getAge() > 25).collect(Collectors.toList());
//		ageAbove25.forEach(x -> System.out.println(x.displayFullName()));

		// Filter based on lastname :("Subedi")
//		List<Human> lastName = people.stream().filter(x -> x.displayFullName().contains("Subedi"))
//				.collect(Collectors.toList());
//		lastName.forEach(x -> System.out.println(x.displayFullName()));

		// collecting only names
//		List<String> names = people.stream().map(x -> x.firstName).collect(Collectors.toList());
//		names.forEach(x -> System.out.println(x));

		// average age of everyone
//		List<Integer> age = people.stream().map(x -> x.getAge()).collect(Collectors.toList());
//		int sum = age.stream().reduce(0, (x, y) -> x + y);
//		System.out.println(sum / people.size());

		// sorting in ascending order by their age
//		List<Human> sortedAge = people.stream().sorted(Comparator.comparingInt(Human::getAge))
//				.collect(Collectors.toList());
//
//		sortedAge.forEach(x -> System.out.println(x.displayFullName()));

		// name of first three people>30
//		List<Human> above30 = people.stream().filter(x -> x.getAge() > 30).limit(3).collect(Collectors.toList());
//		above30.forEach(x -> System.out.println(x.displayFullName()));

		// distinct name list
		List<String> distinctName = people.stream().map(x -> x.firstName).distinct().collect(Collectors.toList());
		distinctName.forEach(x -> System.out.println(x));

		// count of name with same age
		Map<Integer, Long> ageCount = people.stream()
				.collect(Collectors.groupingBy(Human::getAge, Collectors.counting()));
		ageCount.forEach((age, nameCounts) -> {
			if (nameCounts > 1) {
				System.out.println("Age " + age + ": " + nameCounts + " people");
			}
		});
	}
}

class Human {
	String firstName;
	String lastName;
	int age;

	public Human(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public String displayFullName() {
		return (this.firstName + this.lastName);
	}

	public int getAge() {
		return (this.age);
	}
}
