package rjt.b14.threads;

public class TestThreads {

	public static void main (String[] args){
		
		
		//MyThread myThread = new MyThread); // new thread is creadted in memory
		//myThread.start();// I am telling the scheduler my thread is ready to be  scheduled
		/*MyThreadInterface mti = new MyThreadInterface();
		Thread t1 = new Thread(mti);
		t1.start(); */
		
		DbLookup t1 = new DbLookup("First");
		DbLookup t2 = new DbLookup("Second");
		DbLookup t3 = new DbLookup("third");
		
		//t1.run(); //This will work, but the operations will be like methods, and not like threads
		//t2.run();
		t1.start();
		try {  //This try catch block sets t1 at a higher priority.
			t1.join(); 
			//t1.join(1500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//t2.setName("SecondNew");
		System.out.println("isalive"+ t1.isAlive());
		t2.start();
		
		t3.start();
				
	}
	
}

