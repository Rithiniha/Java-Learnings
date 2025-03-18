package Demo;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		
		//User input using scanner class
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		String name = scanner.nextLine();
		
		
		System.out.println("Enter mark 1 : ");
		int mark1 = scanner.nextInt();
		
		System.out.println("Enter the mark 2 : ");
		int mark2 = scanner.nextInt();
		
		
		System.out.println("My name is : " +name);
		System.out.println("My mark is : " +mark1);
		System.out.println("My mark is : " +mark2);
		System.out.println("Your total is : " +(mark1+mark2));
	}

}
