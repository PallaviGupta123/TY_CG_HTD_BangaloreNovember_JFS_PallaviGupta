
public class TestBottle {
	public static void main(String args[])
	{
		Pepsi p=new Pepsi();
		p.open();
		p.close();
		p.drink();
		
		System.out.println("---------------");
		Fanta f=new Fanta();
		f.open();
		f.close();
		Bottle.juice();//Excess the static method with interface name/class name
		
	}

}
