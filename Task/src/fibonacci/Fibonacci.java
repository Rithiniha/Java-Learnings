package fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 5;
		int x =-1;
		int y =1;
		for(int i=1;i<=n;i++) {
		int z = x+y;
		x=y;
		y=z;
		System.out.println(z);
		}
	}

}
