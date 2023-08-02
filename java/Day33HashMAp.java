import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Day33HashMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> students = new HashMap<>();
		students.put("Sonika", 23);
		students.put("Astha", 25);
		students.put("Ajay", 24);
		students.put("Bijay", 24);
		System.out.println(students);

		// Accessing the value From HashMap:
		int s = students.get("Astha");
		System.out.println(s);

		// Retrieve a value by using get:
		// To check a particular key exists
		boolean a = students.containsKey("Ajay");
		System.out.println(a);
		System.out.println(students.containsKey("Sonu"));

		// Finding out how many elements are there by using size:
		// Size() - Total number of key value in HashMap:
		int st = students.size();
		System.out.println(st);

		// Remove(the key and value both)
		students.remove("Sonika", 23);
		System.out.println(students);

		// Update the value
		students.put("Sonika", 26);
		System.out.println(students);

		// Looping through HashMap
		System.out.println(students.values()); // Gives all the value
		System.out.println(students.keySet());

		// using for each loop
		for (Map.Entry<String, Integer> names : students.entrySet()) {
			String key = names.getKey();
			Integer value = names.getValue();
			System.out.println("Key=" + key + ", Value=" + value);

		}
		
        //using while loop
		Iterator<Entry<String, Integer>> iterator = students.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
