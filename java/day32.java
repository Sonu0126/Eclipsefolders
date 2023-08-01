import java.util.ArrayList;

public class day32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		// add()
		boolean Nms = names.add("Sonu");
		System.out.println(Nms);
		names.add("Siri");
		names.add("Sasha");
		names.add("Avir");
		names.add("Aria");
		System.out.println(names);

		// add(position,element)
		names.add(3, "Neya");
		System.out.println(names);

		// remove
		names.remove(0);
		System.out.println(names);
		names.remove("Avir");
		System.out.println(names);

		// clear
		names.clear();
		System.out.println(names);
		names.add("Kamana");
		names.add("Prajani");
		names.add("Asia");
		names.add("Soumya");
		System.out.println(names);

		// set()
		names.set(3, "Sikha");
		System.out.println(names);

		// contains()
		boolean n1 = names.contains("Kamana");
		System.out.println(n1);

		// get()
		String n2 = names.get(1);
		System.out.println(n2);

		// indexOf()
		int num = names.indexOf("Sikha");
		System.out.println(num);

		int num1 = names.indexOf("Sonika");
		System.out.println(num1);

		ArrayList<String> Vehicles = new ArrayList<>();
		Vehicles.add("Car");
		Vehicles.add("Motorbike");
		Vehicles.add("Scooter");
		Vehicles.add("Jet");
		Vehicles.add("Bicycle");
		System.out.println(Vehicles);

		String Element = "Jet";
		if (Vehicles.contains(Element)) {
			System.out.println("Element Available");
		} else {
			System.out.println("Element unavailable");
		}

		// indexOf()
		if (Vehicles.indexOf("Scooter") >= 0) {
			System.out.println("Element Available");
		} else {
			System.out.println("Element unavailable");
		}

		ArrayList<String> cities = new ArrayList<>();
		cities.add("Austin");
		cities.add("Houston");
		cities.add("Dallas");
		cities.add("San Antonio");
		cities.add("Austin");

		System.out.println(cities.size());
		System.out.println(cities);

		System.out.println(cities.indexOf("Austin"));
		System.out.println(cities.lastIndexOf("Austin"));

	}

}
