import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class ArrayList2 {
	public static void main(String[] args) {
		
		ArrayList<String>a1=new ArrayList<String>();
		a1.add(0,"Pallavi");
		a1.add(1, "Ankita");
		a1.add(2, "Saumya");
		a1.add(3, "Sama");
		a1.add(4, "Diksha");
		
		System.out.println(a1);
		a1.remove(new String("Saumya"));
		System.out.println(a1);
		
		 System.out.println("---------ForLoop-----------");
		 for(int i=0;i<a1.size();i++)
		 {
			 System.out.println(a1.get(i));
		 }
		 System.out.println("------ForEachLoop-----");
		 for(String s1:a1)
		 {
			 System.out.println(s1);
		 }
		 System.out.println("---ListIterator---");
		 ListIterator<String> itr= a1.listIterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 System.out.println("==============================");
		 ArrayList<String> aa1=new ArrayList<String>();
		 aa1.add("ABC");
		 aa1.add("XYZ");
		 aa1.add("abc");
		 aa1.add("ABC");
		 a1.addAll(aa1);
		 System.out.println(a1);
		 
		System.out.println(a1.lastIndexOf("XYZ"));
		System.out.println(a1.contains("Pallavi"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.subList(2, 4));
		
		System.out.println(a1.retainAll(aa1));
		
		System.out.println();
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
