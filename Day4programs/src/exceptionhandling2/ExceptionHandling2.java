package exceptionhandling2;

public class ExceptionHandling2 {
			static void checkAge(int age) {
				if(age < 18) {
					throw new IllegalArgumentException("age must be 18 or older");
				}
				System.out.println("Access granted");
			}
			public static void main(String[] args) {
				try {
					
				checkAge(16); //will throw an exception
				}catch (IllegalArgumentException e) {
					System.out.println("Caught exception "+e.getMessage());
				}
	}

}
