
public class TestA {
	public static void main(String[] args) {
		
System.out.println("Main started");
		A a1=new A();
		a1.divide(10, 0);// WE ARE not handling exception..JVM handle the exception
	}
}
