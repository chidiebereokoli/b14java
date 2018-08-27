package rjt.b14.threads;

public class DbLookup extends Thread{
	
	public DbLookup (String string) {
		super(string);
	}
	
	
	public void run(){
		
		//super.run();
		//System.out.println("THis is my blocking call downloading 100G");
		
		

		for (int i = 0; i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+i);

		}
}
}