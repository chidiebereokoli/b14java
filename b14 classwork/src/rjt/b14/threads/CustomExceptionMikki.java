//Custom exception demonstrated by Mikki
package rjt.b14.threads;

public class CustomExceptionMikki extends Exception{
	
	public CustomExceptionMikki() {
		super("throw exception"); //Variables and methods taken from the Exception classs
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CustomExceptionMikki();
		}catch(CustomExceptionMikki ex) {
			System.out.println("exception catch");
		}
		
		
	}

}
