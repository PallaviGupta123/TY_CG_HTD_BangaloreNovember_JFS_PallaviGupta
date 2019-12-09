package com.cap.thread.creatingthread;

public class Test1 {
  public static void main(String[] args) {
	  System.out.println("Main Started");
	  Thread1 t1=new Thread1();
	  t1.start();
	  System.out.println("Main Ended");
}
}
