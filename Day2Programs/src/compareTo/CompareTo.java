package compareTo;

public class CompareTo {

	public static void main(String[] args) {
		
		String str = "java";
		String str1 = "python"; //negative 
		
		System.out.println(str.compareTo(str1));
		
		String str2 = "java";
		String str3 = "java"; //zero

		System.out.println(str2.compareTo(str3));
		
		String str4 = "python";
		String str5 = "java";  //positive
 
		System.out.println(str4.compareTo(str5));
	}

}
