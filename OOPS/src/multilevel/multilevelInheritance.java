package multilevel;

class Animal{
	void sound() {
		System.out.println("The animal makes sound");
		
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("The dog barks");
	}
}
class Cat extends Animal{
	void cute() {
		System.out.println("The cat is cute");
	}
}

public class multilevelInheritance {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound();
		dog.bark();
		cat.cute();

	}

}
