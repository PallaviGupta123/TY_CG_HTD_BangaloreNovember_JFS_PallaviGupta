import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add(86);
		hs.add(23);
		hs.add(44);
		hs.add(null);
		
		
		for(Object obj:hs)
		{
			System.out.println(obj);
		}
		HashSet<String>hs1=new HashSet<String>();
		hs1.add("Pallavi");
		hs1.add("Ankita");
		hs1.add("Diksha");
		hs1.add(null);
		for(Object obj1:hs1)
		{
			System.out.println(obj1);
		}
	}

}
