interface Course {
	public void courseOne();

	public void courseTwo();

	public void courseThree();

	public void courseFour();

}

class Zorba implements Course {

	@Override
	public void courseOne() {
		System.out.println("Zorba courseOne");

	}

	@Override
	public void courseTwo() {
		System.out.println("Zorba courseTwo");

	}

	@Override
	public void courseThree() {
		System.out.println("Zorba courseThree");

	}

	@Override
	public void courseFour() {
		System.out.println("Zorba courseFour");

	}
}

class Minskole implements Course {

	@Override
	public void courseOne() {
		System.out.println("courseOne");

	}

	@Override
	public void courseTwo() {
		System.out.println("courseTwo");

	}

	@Override
	public void courseThree() {
		System.out.println("courseThree");

	}

	@Override
	public void courseFour() {
		System.out.println("courseFour");

	}
}

public class Day34 {

	public static void main(String[] args) {

		Course firm;
		firm = new Zorba();
		firm.courseThree();

		firm = new Minskole();
		firm.courseTwo();
	}

}
