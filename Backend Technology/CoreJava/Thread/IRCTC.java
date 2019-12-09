package com.cap.thread.creatingthread;

public class IRCTC {
	synchronized void confirmTicket (){
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			/*try {
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}*/
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
	}
	synchronized void leaveMe()
	{
		System.out.println("Notify called");
		notifyAll();
	}

}
