package task5;

class Pet{
	void brag() {
		System.out.println("I have the best pet");
	}
}
class Dog extends Pet{
	void brag() {
		super.brag();
		System.out.println("I have the best Dog");
		
	}
}

public class Task5 {
	public static void main(String[] args) {
Dog dog = new Dog();
dog.brag();
	}

}
