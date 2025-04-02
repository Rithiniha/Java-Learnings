package fileop;
import java.io.*;
public class FileOp {
	public static void main(String[] args) {
		
		try {
			//writing data to a file
			FileWriter w = new FileWriter("demo.txt");
			w.write("Hello world. Rise and shine");
			w.close();
			System.out.println("Data written to the  file!");
			//reading data from the file
			FileReader r = new FileReader("demo.txt");
			int character;
			while((character = r.read()) != -1) {
				System.out.print ((char) character);
			}
			r.close();
		} catch(IOException e) {
			System.out.println("An error occured" + e.getMessage());
		}

	}

}
