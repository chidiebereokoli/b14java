package rjt.b14.exceptions;

public class Abdul {

	public void eat() {
		
	}
//A little comment to demonstrate a little change	
	public static void validate (int age) throws InvalidAgeException{
		if (age > 18) {
			System.out.println("Welcome to vote");
		}
		else {
			throw new InvalidAgeException();
			//throw new ArithmeticException("not allowed to vote");
		}
	}
}
