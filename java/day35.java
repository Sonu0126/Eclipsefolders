import java.util.HashMap;
import java.util.Map;

public class day35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program1
		Map<String, String> names = new HashMap<String, String>();
		names.put("Father", "Sanjay");
		names.put("Mother", "Tara");
		names.put("Daughter1", "Sonika");
		names.put("Daughter2", "Shweta");
		names.put("Son", "Sakshyam");
		// System.out.println(Names);

		// Entry method
		for (Map.Entry<String, String> entry : names.entrySet()) {
			// System.out.println(entry.getKey());
			// System.out.println(entry.getValue());
			// System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// Program2
		Map<String, String> profression = new HashMap<String, String>();
		profression.put("Medical", "Doctor");
		profression.put("Educational", "Professor");
		profression.put("Government", "Judge");
		profression.put("Business", "CEO");

		for (String key : profression.keySet()) {
			// System.out.println(key);
		}

		for (String values : profression.values()) {
			// System.out.println(values);
		}

		// Program3
		Map<String, String> language = new HashMap<String, String>();
		language.put("English", "Improved");
		language.put("Spanish", "Need Practice");
		language.put("French", "Try Hard");
		language.put("Arabic", "Failed");
		// System.out.println(language);
		System.out.println(language.get("Arabic"));

		for (String key : language.keySet()) {
			// System.out.println(key);
			System.out.println(language.get(key));
		}

	}

}
