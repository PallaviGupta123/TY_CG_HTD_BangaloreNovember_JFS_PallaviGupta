import java.util.LinkedList;     

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(13);
		l1.add(36);
		l1.add(42);
		l1.add(54);
		System.out.println(l1);
		
		System.out.println("-----Push----");
		l1.push(03);
		System.out.println(l1);
		
	   System.out.println("----pop----");
	   l1.pop();
	   System.out.println(l1);
	   
	   
	 System.out.println("---element---Show First Element----");
	
	 System.out.println(l1.element());
	 System.out.println(l1);
	}

}
