package task;
import java.util.*;

class Message {
 
    void talk(String name) {
        System.out.println("My name is: " + name);
    }

    void talk() {
        System.out.println("Hello! I don't have a name.");
    }

}


public class Task {
    public static void main(String[] args) {
        Message message = new Message();
        message.talk("Alice");         
        message.talk();                  
    }
}
