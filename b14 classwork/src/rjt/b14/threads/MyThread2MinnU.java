//
package rjt.b14.threads;
public class MyThread2MinnU extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {}
			System.out.println(i);}
		}
		
		public static void main (String[] args) {
			MyThread2MinnU mt = new MyThread2MinnU();
			
			mt.start();
		}
	}
	

