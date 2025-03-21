package task2;

class Car{
	void Skoda() {
		System.out.println("the car is Slavia");
	}
}
class Exotic extends Car{
	void Skoda() {
		System.out.println("the car is Exotic");
	}
}
public class Task2 {
	public static void main(String[] args) {
		Car c = new Car();
		Exotic e = new Exotic();
		e.Skoda();
        c.Skoda();	}

}
