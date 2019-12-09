package com.cap.thread.creatingthread;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("main started");
		IRCTC i=new IRCTC();
		User1 u1=new User1(i);

		u1.start();
		 User1 u2=new User1(i);
		 u2.start();
		 u2.getId();
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 i.leaveMe();
		  System.out.println("Main ended");
	}

}
