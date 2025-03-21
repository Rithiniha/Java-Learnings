package hashmaps;
import java.util.*;
public class HashMaps {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		//Adding key-value pairs
		h.put("Apple", 1);
		h.put("Orange", 2);
		h.put("Mango", 3);
		h.put("Kiwi", 4);
		
		System.out.println("HashMap" + h);
		System.out.println("Apple count : " + h.get("Apple"));  //get the value
		
		//checking if a key exists
		if (h.containsKey("Orange")) {
			System.out.println("Orange is in the map");
		}
		
		h.remove("Orange"); //remove key-value pair
		System.out.println("After removing Orange : " + h);
		
		System.out.println("Size of the map : " + h.size());
		
		//iterating over HashMap - using entryset
		System.out.println("Iterating using EntrySet : ");
		for (Map.Entry<String,Integer> entry : h.entrySet()) {
			System.out.println(entry.getKey()+ ": " + entry.getValue());
		}
		
		//using keyset
		System.out.println("Iterating using KeySet : ");
		for (String key : h.keySet()) {
			System.out.println(key + ": " + h.get(key));
		 }
	}

}
