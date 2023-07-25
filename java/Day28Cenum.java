enum Size {
	Small, Medium, Large, Extralarge;

	public String getSize() {
		switch (this) {
		case Small:
			return "Small size ordered";
		case Medium:
			return "Medium size ordered";
		case Large:
			return "Large size ordered";
		case Extralarge:
			return "Extralarge size ordered";
		default:
			return null;

		}
	}

}

public class Day28Cenum {

	public static void main(String[] args) {
		String order = Size.Medium.getSize();
		System.out.println(order);
	}

}
