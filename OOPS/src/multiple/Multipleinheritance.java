package multiple;

interface Animal{
	void eat();
}
interface Bird{
	void fly();
}

class Bat implements Animal,Bird{
	public void eat() {
		System.out.println("The bat eats");
	}
	public void fly() {
		System.out.println("The bat fly");
	}
}

public class Multipleinheritance {
	public static void main(String[] args) {
	Bat bat = new Bat();
	bat.eat();
	bat.fly();

	}

}
