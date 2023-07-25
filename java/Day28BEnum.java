enum Sports {
	Tennis, Football, Badmintion, Basketball
}

class Play {
	Sports selection;

	public Play(Sports selection) {
		this.selection = selection;
	}

	public void confirmationOfselection() {
		switch (selection) {

		case Tennis:
			System.out.println("Congratulation for being selected on Tennis team.");
			break;
		case Football:
			System.out.println("Congratulation for being selected on Football team.");
			break;
		case Badmintion:
			System.out.println("Congratulation for being selected on  Badmintion team.");
			break;
		case Basketball:
			System.out.println("Congratulation for being selected on  Basketball team.");
			break;

		}

	}

}

public class Day28BEnum {

	public static void main(String[] args) {
		Play play = new Play(Sports.Football);
		play.confirmationOfselection();
	}

}
