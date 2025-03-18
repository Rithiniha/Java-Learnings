package split;

public class Split {

	public static void main(String[] args) {
		String str = "java!python,springBoot";
		String [] language = str.split("!");
		String [] language2 = str.split(",");
		
		for(String s1:language) {
			System.out.println(s1);		
		}
		for(String s2:language2) {
			System.out.println(s2);		
		}

	}

}
