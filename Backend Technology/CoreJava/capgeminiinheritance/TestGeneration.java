
public class TestGeneration {
	public static void main(String args[])
	{
		FirstGeneration fg=new FirstGeneration();
		fg.call();
		 
		SecondGeneration sg=new SecondGeneration();
		sg.radio();
		sg.call();
		
		
		ThirdGeneration tg= new ThirdGeneration();
		tg.call();
		tg.radio();
		tg.camera();
		
		
		FirstGeneration fg1 =new SecondGeneration();
	}

}
