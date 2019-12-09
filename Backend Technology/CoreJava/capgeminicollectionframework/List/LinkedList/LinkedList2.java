import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(55);
		l1.add(66);
		l1.add(33);
		System.out.println(l1);
		
	l1.addFirst(00);
	System.out.println(l1);
	l1.addLast(99);
	System.out.println(l1);
	System.out.println("-----remove---");
	l1.remove();//Always Remove the first element;
	System.out.println(l1);
	
	l1.removeFirst();
	System.out.println(l1);
    l1.removeLast();
    System.out.println(l1);
    l1.removeFirstOccurrence(33);//remove the first duplicate value
    System.out.println(l1);
    l1.removeLastOccurrence(33);
    System.out.println(l1);
	System.out.println("=======get====");
	//FIRST ELEMENT OF COLLECTION
	System.out.println(l1.getFirst());
	

	}

}
