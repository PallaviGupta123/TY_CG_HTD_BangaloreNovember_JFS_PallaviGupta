
public class Testperson1 extends Person1 {
	public Testperson1(String name)
	{
		super(name);
	}
	public static void main(String[] args) throws Throwable {
		System.out.println("Main started");
		
		Person1 p1=new Person1("John");
		Testperson1 p2=new Testperson1("Mikel");
		p2.finalize();
		p1.finalize();
		p1=null;
		// System.out.println(p2.name);
		//System.gc();
		System.out.println("Main ended");
		
	}
	

}
