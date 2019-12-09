
public class Person1 {
	String name;

	public Person1(String name) {
		super();
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("kja");
	}

}
