package NewInstance;

//import Getclass.Dog;

public class TestDog {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException
	{
		Dog d1=new Dog("Pinky");
		Class c1=d1.getClass();
		Dog d2=(Dog) c1.newInstance();
		System.out.println(c1);
		System.out.println(d2.name);// In output i get package name900
	}

	

}
