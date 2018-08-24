package rjt.b14.exceptions;

public class NestedTryCatch {
	
	public static void main (String[] args) {
		try {//outer
			try{
				int a =10/0;
			}catch(ArithmeticException e) {
				System.out.println("arithmetic exception occured");
			}
			try{
				int b[] = new int[5];
				b[5] = 10;
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("arithmetic exception occured");
			}
		}
	}

}
