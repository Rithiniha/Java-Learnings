package creatingfile;
import java.io.*;
public class CreatingFile {

	public static void main(String[] args) {
		File obj = new File("demo.txt");
		try {
			obj.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File created !");

	}

}
