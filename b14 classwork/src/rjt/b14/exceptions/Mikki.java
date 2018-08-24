package rjt.b14.exceptions;

import java.io.IOException;

public class Mikki {
	public void m() {
		try {
			n();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("IO excpetion is hanlded in m");
		}
		//
	}
	public void n() throws IOException {
		
		o();
		System.out.println("IO excpetion is propagated in n");
		//as n is not handling it, it will forward to m
	}
	public void o() throws IOException {
		System.out.println("IO excpetion is hanlded in o");
		throw new IOException();
		//int a = 10/0;
		//since o is not handling exception
		//it will forward exception to n
	}
	public static void main(String[] args)
	{
			Mikki mikiGuo =new Mikki();
					mikiGuo.m();

			//	Abdul.validate(15);
	

	}
}
