
public class TestPerson {
	public static void main(String[] args) throws Throwable {
		System.out.println("Main started");
		
		Person p1=new Person("Pallavi");
		p1.finalize(); //here, we call ourselves finalize method
		p1=null;
		//
		System.gc();//here,garbage collector call finalize method
		System.out.println("Main ended");
		
	}

}
