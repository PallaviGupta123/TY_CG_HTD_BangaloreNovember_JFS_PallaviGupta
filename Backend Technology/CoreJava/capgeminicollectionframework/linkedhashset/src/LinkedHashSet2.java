import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
		l1.add(12);
		l1.add(89);
		l1.add(122);
		
		Iterator<Integer> itr=l1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
	}

}
