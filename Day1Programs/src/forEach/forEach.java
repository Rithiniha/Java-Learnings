package forEach;

public class forEach {
	public static void main(String[] args) {
		int [] numbers = {40,50,10,60};
		
		for (int i =1;i<=numbers.length;i++) {
			System.out.println(i);
		}
		for (int n : numbers) {
			System.out.println(n);
		}
	}

}
