package task3;


class Candy{
	void taste() {
		System.out.println("It tastes chocolatey");
		
	}
}
class Chocolate{
	void taste() {
		System.out.println("tastes sweet!");
		System.out.println("It tastes chocolatey");
	}
}

public class Task3 {
	public static void main(String[] args) {
		Candy c = new Candy();
		Chocolate c1 = new Chocolate();
		c.taste();
		c1.taste();
	}

}
