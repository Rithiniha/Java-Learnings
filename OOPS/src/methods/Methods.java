package methods;
import java.util.*;

public class Methods {
public static int add(int a,int b) {
	return a+b;
}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		System.out.println(add(input1,input2));
		
		//int c = add(100,200);
	    //System.out.println(c);
		
		//System.out.println(add(100,200));

	}

}
