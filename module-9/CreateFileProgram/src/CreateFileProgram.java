/*
 * Module 9 Programming Assignment created by Liz Hinz
 * for CSD402-A339: Java for Programmers 
*/
import java.util.Random;
import java.io.*;

public class CreateFileProgram {
	public static void main(String[] args) {
		String fileName = "data.file";
		java.io.File file = new java.io.File("data.file");
		
		try {
			PrintWriter output;
			if (file.exists()) {
				// apend existing file
				output = new PrintWriter(new FileWriter(file, true)); 
			} else {
				// create file
				output = new PrintWriter(file); 
			}
			// Number generator 
			Random rand = new Random();
			for (int i = 0; i < 10; i++) {
				output.print(rand.nextInt(100) + " ");
			}
			output.close();
			
			// read file
			BufferedReader input = new BufferedReader(new FileReader(file));
			String line;
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			} 
			input.close();
		} catch (IOException e) {
			System.out.println("Error occured." + e.getMessage());
		}
	}
}
