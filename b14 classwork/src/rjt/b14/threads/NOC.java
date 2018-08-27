package rjt.b14.threads;

public class NOC extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrinterThread printerThread;
		
		printerThread = new PrinterThread();
		printerThread.start();
		
		
		NWThread nwThread = new NWThread();
		nwThread.start();
		
		DBThread dbThread = new DBThread();
		dbThread.start();
	}

}
