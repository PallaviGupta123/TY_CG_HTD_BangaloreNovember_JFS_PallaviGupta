package ExceptionPropagation;

public class C {
	static void m()
	{ try {
	
	
		System.out.println(10/0);
	}
	catch(Exception e)
	{
		System.out.println("/ by zero");
		throw e;
		
		
		
	}

}}
