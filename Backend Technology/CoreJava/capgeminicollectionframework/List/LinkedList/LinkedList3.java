import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(24);
		l1.add(36);
		l1.add(48);
		l1.add(60);
		l1.add(72);
		System.out.println(l1);
		System.out.println("-----Peak-----");
		
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		
		System.out.println("------Poll----");
		System.out.println(l1.poll());
		System.out.println(l1.pollLast());
		System.out.println(l1.peekFirst());
		
		System.out.println("------Offer-----");
		l1.offer(86);
		System.out.println(l1);
		l1.offerFirst(120);
		System.out.println(l1);
		l1.offerLast(96);
		System.out.println(l1);
		
		
		
		
		
		
		
	}
}
