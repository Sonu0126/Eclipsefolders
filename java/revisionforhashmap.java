import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class revisionforhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Program1
//		HashMap<String, Integer> h = new HashMap<>();
//		// Add
//		h.put("Sonu", 9);
//		h.put("Sash", 14);
//		h.put("Saksyam", 18);
//		h.put("Taraa", 8);
//		System.out.println(h);
//
//		// Update
//		h.put("Sanjaya", 5);
//		System.out.println(h);
//
//		// Retrieve( getting the value )
//		Integer one = h.get("Sonu");
//		System.out.println(one);
//
//		// Delete
//		h.remove("Sonu");
//		System.out.println(h);
//		
//		//allow duplicate value or not
//		h.put("Sash", 16);
//		System.out.println();
//		
//		//To know how many key values are there
//		System.out.println(h.size());
//		
		// Program2
		HashMap<Integer, String> uni = new HashMap<>();
		uni.put(1, "Oxford");
		uni.put(2, "Harvard");
		uni.put(3, "Cambridge");
		uni.put(4, "Stanford");
		System.out.println(uni);

		// To check whether a key exist or not?
		boolean u = uni.containsKey(3);
		System.out.println(u);
		// Or you can also use
		if (uni.containsKey(1)) {
			System.out.println(uni.get(1));
		}
		if (uni.containsValue("Harvard")) {
			System.out.println("Available on 2");
		}

		Object h;
		// forEach loop
		for (Integer key : uni.keySet()) {
			System.out.println(key);
			System.out.println(uni.get(key));
		}
		System.out.println(uni.keySet());
		System.out.println(uni.values());

		// for loop
		for (Map.Entry<Integer, String> entry : uni.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// Using Iterator
		Iterator<Map.Entry<Integer, String>> rank = uni.entrySet().iterator();
		while (rank.hasNext()) {
			Map.Entry<Integer, String> entry = rank.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
