package single;

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
	public class singleInheritance {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.bark();

	}

}
