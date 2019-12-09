import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(12);
		s1.add(23);
		s1.add(45);
		s1.add(98);
		System.out.println(s1);
		s1.push(76);
		System.out.println(s1);
		
		System.out.println(s1.peek());
		//Searchig last from last index...
	
		System.out.println(s1.search(new Integer(12)));
		
		
	}

}
