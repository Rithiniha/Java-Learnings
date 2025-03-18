package equals;

public class Equals {
	public static void main(String[] args) {
		
		String str = "JAVA";
		String str1 = "java";
		System.out.println(str==str1); 
		System.out.println(str.equals(str1)); 
		
		System.out.println(str.equalsIgnoreCase(str1)); //no case sensitivity
		
	}

}
