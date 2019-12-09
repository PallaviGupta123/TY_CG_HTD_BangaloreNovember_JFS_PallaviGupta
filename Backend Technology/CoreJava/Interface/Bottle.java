
public interface Bottle {
	void open();
	void close();
	
	static void juice() {
		System.out.println("Juice");
		
	}
	default void drink() {
		System.out.println("drinking=}");
		
		
	}


}
