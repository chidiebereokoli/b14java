package rjt.b14.threads;

public class WorkerThread implements Runnable{

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	private String message;
	
	public WorkerThread (String msg) {
		message = msg;
	}
	


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"start message="+message);
		processing();
		System.out.println(Thread.currentThread().getName()+"end");
	}



	private void processing() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}