package com.cap.thread.creatingthread;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

public class PVR {
  synchronized void confirmTicket() 
  {
	  for(int i=0;i<3;i++)
	  {		
		  System.out.println(i);
		  try {
			  wait();
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	  
  }
  synchronized void leaveMe()
  {
	  System.out.println("Notify called");
	  notify();
  }
}
