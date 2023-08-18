
public class trycatchday42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sonika");
		try {
			System.out.println(9 / 0);
		} catch (ArithmeticException e) {
			e.getStackTrace();
			System.out.println("caught");

		}
		System.out.println("pass");

	}

}
