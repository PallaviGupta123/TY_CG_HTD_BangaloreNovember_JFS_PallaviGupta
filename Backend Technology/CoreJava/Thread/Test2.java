package com.cap.thread.creatingthread;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Thread2 t2=new Thread2();//Crating object for Runnable implementation class
		
		Thread t=new Thread(t2);//Creating object for thread class
		t.start();
		System.out.println("Main ended");
	}

}
