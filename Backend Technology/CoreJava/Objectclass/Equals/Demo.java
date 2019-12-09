package Equals;

public class Demo {
   public static void main(String[] args) {
	   String s1="Shree";
	   String s2="Shree";
	   String s3="Dinga";
	   String s4=new String();
	   System.out.println(s1.equals(s2));//Comparison on the basis of object class
	   // Equals used only for non primitive data types
	   System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
}
}
