package NestedTry;

public class ExceptionA
{
    void exception(int a,String b)
    {
    	try {
    		System.out.println(b.length());
    		try
    		{
    			System.out.println(500/a);
    		}catch(ArithmeticException a1)
    		{
    			System.out.println("Dont deal with zero");}
    		}catch(NullPointerException n) {
    		System.out.println("Dont deal with null");
    	}
    }

}
