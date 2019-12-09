import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(11);
		v1.add(21);
		v1.add(31);
		v1.add(41);
		v1.add(51);
		System.out.println(v1);
		System.out.println("-----remove------");
		
		v1.remove(new Integer(21));
		System.out.println(v1);
		System.out.println(v1.set(1, 90));
		System.out.println(v1);
		
		System.out.println("-----forloop----");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
	}

}
