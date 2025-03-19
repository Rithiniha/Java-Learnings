package classandobject;
import java.util.*;
class Student{   //class
	String name = "Rithu";
	int rollnum = 26;
	String dept = "SS";
	
	void displayData() {  //method
		System.out.println("My name is : "+name);
		System.out.println("My rollnum is : "+rollnum);
		System.out.println("My dept is : "+dept);
	}
	
	void print() {
		System.out.println(name);
		System.out.println(rollnum);
		System.out.println(dept);
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		Student student = new Student(); //object
		//student.name="Rithu";
		//student.rollnum=26;
		//student.dept="SS";
		student.displayData();
		student.print();
	}

}
