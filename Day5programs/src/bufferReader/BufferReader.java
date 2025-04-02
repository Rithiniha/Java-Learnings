package bufferReader;
import java.io.*;
public class BufferReader {
	public static void main(String[] args) {
		try {
		BufferedReader b = new BufferedReader (new FileReader("C:\\hello\\hellooo.txt"));
		String line;
		System.out.println("Reading file line by line : ");
		while((line = b.readLine()) != null) {
			System.out.println(line);
		}
		b.close();
		} catch(IOException e) {
			System.out.println("Error reading file :" + e.getMessage());
		}
	}

}

