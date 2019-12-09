
public class TestCalculator {
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		
		int r1=c1.add(200);
		System.out.println("Result of 1st is:" +r1);
		
		int r2=c1.add(20,20);
		System.out.println("Result of 2st is:" +r2);
		
		
		double r3=c1.add(20.0);
		System.out.println("Result of 3st is:" +r3);
		
		Calculator.multiply(23);
		Calculator.mullti(10, 90);
		
	}

}
