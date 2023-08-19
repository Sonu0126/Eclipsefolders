import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Day43readlineB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader("example.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			// String line;
			try {
				String line = bufferReader.readLine();
				while (line != null) {
					System.out.println(line);
					line = bufferReader.readLine();
				}
				bufferReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
