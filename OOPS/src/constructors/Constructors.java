package constructors;
import java.util.*;

class Bike{
	String color;
	int NumPlate;
	String Brand;
	Bike(){ //default constructor
	color = "chrome";
	}
	Bike(int numPlate,String brand){ //parameterized constructor
		this.NumPlate=numPlate;
		this.Brand=brand;
		
	}
	void Display() {
		System.out.println("The bike color is : "+color);
		System.out.println("The bike number is : "+NumPlate);
		System.out.println("The bike brand is : "+Brand);
	}
}
public class Constructors {
	public static void main(String[] args) {
		Bike bike = new Bike(1234,"GT"); //initialized when creating the object
		bike.Display();
	}
}
