package Hashcode;

public class TestEmplyoee1 {
	
		public static void main(String[] args) {
			Emplyoee1 e1=new Emplyoee1(22,"PAllavi");
			Emplyoee1 e2=new Emplyoee1(22,"PAllavi");
			
			System.out.println(e1.equals(e2));
			System.out.println(e1.hashCode());
			System.out.println(e2.hashCode());
			//System.out.println(e1);
			// 
			Object obj=new Object();// to go to only source code
			
			
		}

	}


