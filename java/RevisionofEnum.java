enum Size1 {
	SMALL, MEDIUM, LARGE, EXTRALARGE;
}

class TestSize {
	Size1 shirt;

	public TestSize(Size1 shirt) {
		this.shirt = shirt;
	}

	public void ordershirt() {
		switch (shirt) {
		case SMALL:
			System.out.println("Small Size available");
			break;
		case MEDIUM:
			System.out.println("Medium Size available");
			break;
		case LARGE:
			System.out.println("Large Size available");
			break;
		case EXTRALARGE:
			System.out.println("ExtraLarge Size available");
			break;
		default:
			System.out.println("Size1 Not Available");

		}
	}
}

public class RevisionofEnum {

	public static void main(String[] args) {
		TestSize s = new TestSize(Size1.MEDIUM);
		s.ordershirt();

	}

}
