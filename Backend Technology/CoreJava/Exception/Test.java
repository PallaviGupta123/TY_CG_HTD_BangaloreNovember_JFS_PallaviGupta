

public class Test {
	void write()
	{
		String s=null;
		try {
		System.out.println("length of string"+s.length());
	}
		catch(NullPointerException e)
		{
			System.out.println("Dont deal with Null");
		}
	}
	public static void main(String[] args) {
		System.out.println("Main Started");
		Test t1=new Test();
		t1.write();
		System.out.println("main ended");
		
	}

}
