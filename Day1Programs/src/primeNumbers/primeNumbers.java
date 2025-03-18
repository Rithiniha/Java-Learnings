package primeNumbers;
import java.util.*;

public class primeNumbers {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int  n = scanner.nextInt();
		
		for (int i=2;i<=n;i++) {
			if (i%1==0 && i%i==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
