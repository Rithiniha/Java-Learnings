package buffer;
import java.util.*;
public class Buffer {

	public static void main(String[] args) {
		
		//similar to stringbuilder but synchronized in multi-threaded environment
		//thread safe
		
        StringBuffer str = new StringBuffer("Hello");
		
		//append
		str.append("World");
		System.out.println("After append : "+str);
		
		//insert
		str.insert(5,",");
		System.out.println("After insert : "+str);
		
		//replace
		str.replace(6,11,"Java");
		System.out.println("After replace : "+str);
		
		//reverse
		str.reverse();
		System.out.println("After reverse : "+str);

	}

}
