import java.io.FileWriter;
import java.io.IOException;

public class Day43readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "example.txt";
		try {
			FileWriter writer = new FileWriter(fileName);
			// Write into file
			writer.write("Namaste");
			writer.write("\n");
			writer.write("I am practicing javascript");
			writer.write("\n");
			writer.write("I am learning java");
			writer.write("\n");
			writer.write("I am learning python");
			writer.write("\n");
			writer.write("I am learning git");
			writer.write("\n");
			writer.write("I am learning sql");
			writer.write("\n");
			writer.close();
			System.out.println("Data successfully written and file is closed");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
