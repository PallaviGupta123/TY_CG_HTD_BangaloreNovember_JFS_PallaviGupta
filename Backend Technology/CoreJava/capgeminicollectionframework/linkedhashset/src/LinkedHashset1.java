import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset1 {
	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		l.add(12);
		l.add(23);
		l.add(23);
		l.add(67);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
