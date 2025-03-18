package trim;

public class Trim {

	public static void main(String[] args) {
		String str = "  java  "; //only trims whitespaces at the front and at the back
		System.out.println(str.length());
		String str1 = str.trim();
		System.out.println(str1);
		System.out.println(str1.length());
	}

}
