package threads;

class MyThread extends Thread{
	public void run() {
		System.out.println("thread is running");
		
	}
}

public class Threads {
	public static void main(String[] args) {
		//Creating a thread by extending Thread class
		MyThread thread1 = new MyThread();
		thread1.start(); //Start the thread

	}

}
