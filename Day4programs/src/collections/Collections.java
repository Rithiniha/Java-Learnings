package collections;
import java.util.*;
public class Collections {

	public static void main(String[] args) {  //generic type
		ArrayList <Integer> arrlist = new ArrayList<>();
		
		arrlist.add(100);
		arrlist.add(200);
		//arrlist.add("Rithu");
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.set(0,1000));
		System.out.println(arrlist.remove(0));  //100 removed
		System.out.println(arrlist.get(0));     //200 becomes (0) now
		System.out.println("........................");
		
	/*	for(int i=1;i<=10;i++) {
			arrlist.add(i);
			System.out.println(arrlist);
		}      */

		//for each
		for(int i:arrlist) {
			System.out.println(i);
		}
		
	}

}
