package ExceptionPropagation;

public class A {
	static void o()
	{
		try {
		B.n();
	}catch(Exception e)
		{
		//System.out.println("/ by zero");
		System.out.println("Handle by A"+e.getMessage());
		}
		
	}

}
