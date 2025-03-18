package wrapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		// wrapper class - creating an object
		Integer myInt = Integer.valueOf(100);
		Double myDouble = Double.valueOf(12.34);
		Character myChar = Character.valueOf('A');
		Boolean myBool = Boolean.valueOf(true);
		
		//autoboxing:converting primitive to wrapper class
		Integer intObj = 50; // Equivalent to Integer

		//unboxing:converting object to primitive
		int intValue = intObj; //Equivalent to primitive
		System.out.println(intValue);
	}

}
