package MutlipleException;

public class TestException {
	public static void main(String[] args) {
		
		
		System.out.println("Main started");
		ExceptionA e=new ExceptionA();
		e.exception(0, "Pallavi");
		e.exception(2, null);
		System.out.println("MAin ended");
		
	}

}
