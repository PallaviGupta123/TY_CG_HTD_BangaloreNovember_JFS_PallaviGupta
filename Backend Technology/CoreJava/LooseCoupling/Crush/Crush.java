package Crush;

public class Crush 
{
	void recieve(Phone p)
	{
	if (p instanceof BasicSet)
	{
		System.out.println("Thank you");
	}
	else if (p instanceof Oppo)
	{
		System.out.println("Thank you so much dear");
	}
	else if (p instanceof Apple)
	{
		System.out.println("i Love you");
	}
	else if (p instanceof BasicSet)
	{
		System.out.println("Thanks ");
	}
	else
	{
		System.out.println("GO TO HEll");
	}
	}

}
