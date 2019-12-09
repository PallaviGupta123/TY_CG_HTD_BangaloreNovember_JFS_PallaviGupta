
public class TryCatch extends TestA 
{
	void divide(int a, int b)
	{
		System.out.println("Divide method called");
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Dont not divide");
		}
		System.out.println("Diviide");
	}


}
