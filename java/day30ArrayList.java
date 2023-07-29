import java.util.ArrayList;

public class day30ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> language = new ArrayList<>();
		language.add("Spanish");
		language.add("English");
		language.add("Nepali");
		language.add("Marathi");
		System.out.println(language);

		// Retrieve
		String learn = language.get(0);
		String learn1 = language.get(1);
		String learn2 = language.get(2);
		String learn3 = language.get(3);
		System.out.println(learn);
		System.out.println(learn1);
		System.out.println(learn2);
		System.out.println(learn3);

		// looping with for loop
		for (int i = 0; i < language.size(); i++) {
			// System.out.println(i);
			System.out.println(language.get(i));
		}

		// Updating the value of array list
		ArrayList<String> Subjects = new ArrayList<>();
		Subjects.add("science");
		Subjects.add("geography");
		Subjects.add("mathmatics");
		Subjects.add("account");
		System.out.println(Subjects);

		Subjects.set(3, "computer");
		System.out.println(Subjects);

		// Deleting the value on array list
		Subjects.remove(1);
		System.out.println(Subjects);

	}

}
