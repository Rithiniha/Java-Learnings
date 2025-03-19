package accessSpecifiers;
import java.util.*;

class Student{
	public String name = "Rithu";
	private int age = 21;
	protected String grade = "A";
	String school = "Tea Public";
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
		System.out.println("Grade : "+grade);
		System.out.println("School : "+school);
	}
}

public class AccessSpecifiers {
	public static void main(String[] args) {
		Student student = new Student();
		student.display(); //accessing all values
		
		System.out.println("public Name : "+student.name);
		System.out.println("default school : "+student.school);
		
		//System.out.println("private age : "+student.age);
		System.out.println("protected grade : "+student.grade);
		
	}

}
