

public class Demo6 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Pallavi ");
		System.out.println(s1.hashCode());
		
		s1=s1.append("Gupta");
		System.out.println(s1.hashCode());
		 System.out.println(s1);
	}

}
