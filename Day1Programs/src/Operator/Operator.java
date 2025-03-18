package Operator;

public class Operator {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		System.out.println("Arithmetic");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); 
		
		System.out.println("Relational");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b); 
		
		System.out.println("Logical");
		boolean c = true;
		boolean d = false;
		System.out.println(c&&d);
		System.out.println(c||d);
		System.out.println(!c); 
		
		System.out.println("unary");
		System.out.println("post increment");
		int e = 10;
		System.out.println(e); //10
		System.out.println(e++); //10
		System.out.println(e); //11 
		
		System.out.println("pre increment");
		System.out.println(e); //10
		System.out.println(++e); //11
		System.out.println(e); //11 
		
		System.out.println("post decrement");
		System.out.println(e); //10
		System.out.println(e--); //10
		System.out.println(e); //9
		
		System.out.println("pre decrement");
		System.out.println(e); //10
		System.out.println(--e); //9
		System.out.println(e); //9
		
		System.out.println("Assignment");
		System.out.println("a+=200"); //a=a+200 // a=300
		
	    //task
		int a1=10;
		int b1=20;
		
		a1+=b1; //a1=30
		b1=a1-b1; //b1=10
		a1-=b1; //a1=20
		
		System.out.println(a1); 
		System.out.println(b1); 
		
		System.out.println("Ternary");
		int age=17;
		String result = (age>=18)?"Eligible to vote":"Not eligible to vote";
		System.out.println(result);
		
		System.out.println("Bitwise"); 
		
	}

}
