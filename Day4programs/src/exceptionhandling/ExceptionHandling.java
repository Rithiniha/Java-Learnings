package exceptionhandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int num = 10 / 0; //Arithmetic Exception
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by  zero" + e.getMessage());
		}finally {
			System.out.println("Execution completed" );
		}
		
	}

}
