package Control;

import java.util.*;

public class Control {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
	/*	if(a<b) {
			System.out.print("A less than B");
		  }
		else{
		    System.out.println("A greater than B");
		  } */
		
		
		/* if(a<b){
			if(a%2==0){
			System.out.print(a + "Even number");
		    } 
		    else{
			System.out.print(a + "odd number");
		    }
		       } */ 
		
		
		/* if(a>b && a>c) {
			System.out.print("A is greater");
		}
		else if(b>a && b>c){
			System.out.print("B is greater");
		}
		else if(c>a && c>b){
			System.out.print("C is greater");
		}
		else{
			System.out.print("All are equal");
		} */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value 1 : ");
		int a1 = scanner.nextInt();
		System.out.println("Enter value 2 : ");
		int b1 = scanner.nextInt();
		char choice;
		System.out.println("+,-");
		choice = scanner.next().charAt(0);
		switch(choice) {
		case '+' :
			int d =a1+b1;
			System.out.println("ADD"+d);
			break;
		case '-' :
			int e =a1-b1;
			System.out.println("SUB"+e);
			break;
		default:
			System.out.println("Invalid");
			
		}

	}

}
