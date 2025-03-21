package iterators;
import java.util.*;
public class Iterrators {

	public static void main(String[] args) {
		ArrayList <String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("kiwi");
		Iterator<String> iterator = fruits.iterator();
		System.out.println("Fruits using Iterator: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
