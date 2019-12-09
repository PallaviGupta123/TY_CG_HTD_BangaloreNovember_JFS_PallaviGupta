package ExceptionPropagation;

public class B {
	static void n()
	{
		try {
		C.m();
	}
		catch(Exception e)
		{
			System.out.println("/ by zero");
			throw e;
		}

}}
