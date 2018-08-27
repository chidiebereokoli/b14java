//Create thread using runnable interface, dragos demo

package rjt.b14.threads;

public class ThreadsClassDragos implements Runnable{

	public static void main(String[] args) {
		ThreadsClassDragos t1 = new ThreadsClassDragos();
		Thread thread1 = new Thread(t1);

		thread1.start();
		
		DThreadDragos db1 = new DThreadDragos();
				db1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running a task");
	}

}
