import java.io.IOException;
import java.io.FileWriter;

public class file39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter write = new FileWriter("MyFile.txt", true);
			System.out.println(2 / 0);
			write.write("Namaste");
			write.write("\n");
			write.write("hello Student");
			write.close();

		} catch (IOException e) {

			e.printStackTrace();
		} catch (ArithmeticException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
