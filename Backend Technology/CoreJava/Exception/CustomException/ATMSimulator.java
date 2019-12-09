package CustomException;

public class ATMSimulator 
{
	void withDraw(double i) {
		if(i>4000)
		{
			throw new DayLimitException();
		}
	}

}
