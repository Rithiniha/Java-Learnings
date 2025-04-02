package bufferwriter;
import java.io.*;
public class BufferWriter {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter (new FileWriter("C:\\hello\\hellooo.txt"));
			bw.write("java file handling example");
			bw.newLine();
			bw.write("Makes writing more efficient");
			bw.newLine();
			bw.write("--------------------------------");
			bw.close();
		
		System.out.println("Data written to file successfully");
	}catch(IOException e) {
		System.out.println("Error occured " + e.getMessage()); 
	}
}
}
