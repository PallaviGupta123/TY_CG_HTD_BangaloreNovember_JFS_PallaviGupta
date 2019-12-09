import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList <Integer>l1=new LinkedList<Integer>();
		l1.add(2);
		l1.add(22);
		l1.add(57);
		l1.add(2);
		System.out.println("===Iterator====");
		ListIterator itr=l1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(l1);
		l1.remove(new Integer(2));
		System.out.println(l1);
		System.out.println("-----forEachLoop-----");
		
		for(Object i1:l1)
		{
			System.out.println(i1);
		}
		System.out.println("---ForLoop---");
		for(int i=1;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		
	}

}
