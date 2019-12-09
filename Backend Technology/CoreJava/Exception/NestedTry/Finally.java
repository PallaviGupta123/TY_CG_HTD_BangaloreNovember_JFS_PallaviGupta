package NestedTry;

public class Finally {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException a)
		{
			System.out.println("dont deal with 0");
		}
		finally {
			System.out.println("Finally executed");
		}
	
	System.out.println("MAin ended");
	}
}
