package builder;
import java.util.*;
public class Builder {

	public static void main(String[] args) {
		//not thread safe
		//it is a class
		
		StringBuilder str = new StringBuilder("Hello");
		
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
