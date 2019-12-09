import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> a1 =new ArrayList<Integer>();
		a1.add(55);
		a1.add(23);
		a1.add(45);
		a1.add(55);
		
		System.out.println(a1);
		
		a1.remove(new Integer(55));
		System.out.println(a1);
		
		System.out.println("-----ForLoop-----");
		//Iterating the array list using for loop
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
			
		}
//		//Iterating the array list using for eachloop
			System.out.println("------ForEachLoop----");
			for(Integer i:a1)
			{
				System.out.println(i);
			}
			//Iterating the array list using iterator
			System.out.println("----iterator method---");
			Iterator<Integer>itr=a1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			//Iterating using the List Iterator
			System.out.println("------ListIterator");
			ListIterator<Integer>itr1=a1.listIterator(a1.size());
					while(itr1.hasPrevious())
					{
						System.out.println(itr1.previous());
					}
			
			
			
			
;
			
		
	}

}
