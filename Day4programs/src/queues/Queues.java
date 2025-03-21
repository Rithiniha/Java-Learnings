package queues;
import java.util.*;
public class Queues {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(100);
		q.add(200);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.remove(200));
		System.out.println(q);
	}

}
