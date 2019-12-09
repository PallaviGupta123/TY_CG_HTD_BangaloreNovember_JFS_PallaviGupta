
public class TestVehicle {
	public static void main(String args[]) throws CloneNotSupportedException {
		Vehicle v1=new Vehicle("Benz");
		Object obj=v1.clone();// 
		
		Vehicle v2=(Vehicle) obj;
		System.out.println(v2.name);

	}

}
