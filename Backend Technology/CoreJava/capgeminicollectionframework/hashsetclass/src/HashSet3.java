import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		HashSet<Student> h1=new HashSet<Student>();
		h1.add(new Student(22,"pallavi"));
		h1.add(new Student(77,"divya"));
		h1.add(new Student(65,"soni"));
		h1.add(new Student(98,"moni"));
		h1.add(new Student(24,"vinay"));
		
		for(Student s1:h1)
		{
			System.out.println(s1.name+ "  age is  " + s1.age);
		}
		
		
	}

}
