package rjt.b14.threads;


public class MyThreadInterface implements Runnable{
	public void run() {
		System.out.println("I am doing a time taking task");
	}
}