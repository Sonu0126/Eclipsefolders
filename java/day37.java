import java.util.Arrays;
import java.util.List;

public class day37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Streams -- API Testing
		// Count of blank Strings
		List<String> hobbies = Arrays.asList("Reading novels", "", "Painting", "Horse riding", "", "Dancing");
		System.out.println(hobbies.stream().filter(x -> x.isEmpty()).count());

		// taking the blank String to list
		List<String> hobbies2 = Arrays.asList("Reading novels", "", "Painting", "Horse riding", "", "Dancing");
		System.out.println(hobbies2.stream().filter(x -> x.isEmpty()).toList());

		// Only the String
		List<String> hobbies3 = Arrays.asList("Reading novels", "", "Painting", "Horse riding", "", "Dancing");
		System.out.println(hobbies3.stream().filter(x -> !x.isEmpty()).toList());

		// names contains "i"
		List<String> hobbies4 = Arrays.asList("Reading novels", "", "Painting", "Horse riding", "", "Dancing");
		System.out.println(hobbies4.stream().filter(x -> x.contains("i")).toList());

		// string greater then 4
		System.out.println(hobbies4.stream().filter(x -> x.length() > 4).toList());

		// Working with every element of string
		// ["chinmay","shirish","ravi"] ===> //["CHINMAY","SHIRISH","RAVI"]
		// ["chinmay","shirish","ravi"] ===> // ["chinmay","shirish"]

		List<Integer> transactions = Arrays.asList(100, -1500, 60000, -500, -2000, 50);

		System.out.println(transactions.stream().filter(tra -> tra > 0).toList());
		System.out.println(transactions.stream().filter(tra -> tra < 0).toList());

		// Convert every list in map to Upper case()

		List<String> cities = Arrays.asList("ktm", "pokhara", "bhaktapur", "dharan", "birtamode");
		System.out.println(cities.stream().map(x -> x.toUpperCase()).toList());

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(numbers.stream().map(x -> x * 4).toList());

		List<Integer> salary = Arrays.asList(6000, 6000, 6500, 56777, 9000);
		System.out.println(numbers.stream().map(x -> x * 4).toList());

		System.out.println(salary.stream().map(x -> x + x * 0.10).toList());

	}

}
