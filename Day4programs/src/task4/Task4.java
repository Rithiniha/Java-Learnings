package task4;

class Message {
	 
    void greet(String name) {
    	System.out.println("Hello!");
        System.out.println("Hello! sansa");
    }

    void greet() {
        System.out.println("Hello!");
    }

}

public class Task4 {
	public static void main(String[] args) {
Message message = new Message();
message.greet();
message.greet("hi");

	}

}
