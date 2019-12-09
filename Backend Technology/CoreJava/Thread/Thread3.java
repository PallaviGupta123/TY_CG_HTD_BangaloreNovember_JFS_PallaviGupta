package com.cap.thread.creatingthread;

public class Thread3 {
	public static void main(String[] args) {
		System.out.println("Main started");
		PVR  p=new PVR();
		User u1=new User(p);
		u1.start();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("Main ended");
         p.leaveMe();		
	}

}
