import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.PrintStream;

public class Stdin2File {
	public static void main(String args[]) {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		try {
			System.setOut(new PrintStream(new FileOutputStream("log.txt"))); 

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
