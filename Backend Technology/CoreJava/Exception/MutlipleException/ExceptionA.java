package MutlipleException;

public class ExceptionA 
{
 void exception(int a,String b) {
	 try {
		 System.out.println(500/a);
		 System.out.println(b.length());
	 }
	 catch(ArithmeticException a1) {
		 System.out.println("Dont Deal with 0");
	 }
	 catch(NullPointerException b1)
	 {
		 System.out.println("Dont not deal with Null");
	 }
	 
 }
}
