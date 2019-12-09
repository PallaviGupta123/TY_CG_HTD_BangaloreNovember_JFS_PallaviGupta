
public class Demo5 {
	public static void main(String[] args) {
		String s1=new String("Pallavi");
		System.out.println(s1.hashCode());
		
		String s2=new String("Ankita");
		String s3=new String("Pallavi");
		
		s1=new String("Diksha");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
		
	}

}
