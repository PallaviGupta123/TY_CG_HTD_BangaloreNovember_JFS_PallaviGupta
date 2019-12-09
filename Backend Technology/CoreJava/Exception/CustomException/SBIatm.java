
package CustomException;

public class SBIatm {
	public static void main(String[] args) {
		System.out.println("MAin starerd");
		
		ATMSimulator a1=new ATMSimulator();
		try {
			a1.withDraw(41000);
		}
		catch(DayLimitException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("main method");
	}

}
