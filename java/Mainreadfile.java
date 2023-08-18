class MyException extends Exception {
	public MyException(String s) {
		// call the constructor of parent Exception
		super(s);
	}

}

class Invalidmobile extends Exception {
	public Invalidmobile(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

public class Mainreadfile {

	public static void main(String[] args) {
		try {
			String book = "RichDad PoorDad";
			if (book.length() < 15) {
				throw new MyException("book length is small.");
			}
			String mobile = "038274465";
			if (mobile.length() <= 10) {
				throw new Invalidmobile("please enter correct number");
			}

			System.out.println("user registered");
		} catch (Exception e) {
			System.out.println("function called");
			System.out.println("caught");
			System.out.println(e.getMessage());
			e.printStackTrace();
			;
		}

	}

}
