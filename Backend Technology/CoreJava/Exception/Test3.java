
public class Test3 {
	public static void main(String[] args) {
		System.out.println("Mian started");
		int a[]=new int[2];
		a[0]=10;
		a[1]=20;
		try {
		a[2]=30;
		//System.out.println("Try executed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("There is no size for data");
		}
		System.out.println("Main ended");
	}

}
