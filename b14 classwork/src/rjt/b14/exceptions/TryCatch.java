/**
 * 
 */
/**
 * @author chidi
 *
 */
package rjt.b14.exceptions;

import java.io.File;



public class TryCatch{
	
	public static void main(String [] args) {
		
		int c = add(10,20);
		
		
		try {
			System.out.println("Opened files and n/w connections");
			int b[] = new int [5];
			//b[6] = 10;
			int a = 10/c; //medicine is not available
			
		}
		
		catch (ArrayIndexOutOfBoundsException aiobe) {//abdul
			System.out.println("Arrayindex out of bound exception occurred");
		}
		catch(ArithmeticException ae) {//abdul
			System.out.println("arithmetic exception occurs");
		}
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("yang is speaking with abdul");
		
		}
		finally {
			System.out.println("Before proceeding, close files and network connections");
		}
		System.out.println("yang will continue with the rest of the program");
	}
	
	private static int add(int i, int j) {
		int a =8+9;
		return i + j;
	}
	
}