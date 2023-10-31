package packageName;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsForRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program1 -Finding names with more than 4 letters.
		List<String> names = Arrays.asList("Sonu", "Aashraya", "Shweta", "Sakshyam");
		List<String> longnames = names.stream().filter(name -> name.length() > 4).collect(Collectors.toList());
		System.out.println(longnames);

		// Program2
		List<Integer> transaction = Arrays.asList(100, 2200, 300, -500, -700, -200, 1000);
		// finding the deposit amount
		List<Integer> deposit = transaction.stream().filter(t -> t > 0).collect(Collectors.toList());
		System.out.println(deposit);

		// finding the withdrawn amount
		List<Integer> withdrawl = transaction.stream().filter(t -> t < 0).collect(Collectors.toList());
		System.out.println(withdrawl);

		// Program3
		// Finding the age
		List<Integer> birthYear = Arrays.asList(1986, 1999, 2001, 2005, 2010);
		List<Integer> ages = birthYear.stream().map(age -> 2023 - age).collect(Collectors.toList());
		System.out.println(ages);

		// table of 3
		List<Integer> table = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> tableof3 = table.stream().map(x -> x * 3).collect(Collectors.toList());
		System.out.println(tableof3);

		// Program4
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, (x, y) -> x + y);

		List<String> fName = Arrays.asList("Sonika", "Aashraya", "Shweta", "Sakshyam");
		fName.stream().forEach(nm -> System.out.println("Welcome " + nm));

	}

}
