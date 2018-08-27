//Exception Propagation by MinnYu
//if it was a checked exception, it will be handlded in o
package rjt.b14.threads;

public class ExceptionPropagationMinnYu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [5];
		
/*		try {
			arr[5] = 1;
		} catch (ArithmeticException ae) {
			System.out.println("caught arithmetic exception");
		} catch (ArrayIndexOutOfBoundsException aioob) {
			System.out.println("caught array index out of bounds exception");
		}*/
		m();
	}

	public static void m() {
		
		try {
			n();
		}catch (Exception e){
			System.out.println("caught in m");
		}
		
		//System.out.println("m");
	}
	
	public static void n() {
		o();
		System.out.println("n");
	}
	
	public static void o() {
		int a = 1/0;
		System.out.println("o");
	}
}
