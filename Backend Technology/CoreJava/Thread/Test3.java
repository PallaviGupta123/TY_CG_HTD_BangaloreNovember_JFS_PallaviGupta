package com.cap.thread.creatingthread;

public class Test3 {
	public static void main(String[] args) {
		PVR p=new PVR();
		User u1=new User(p);
		u1.start();
		
	}

}
