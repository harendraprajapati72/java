class MeExcep
{
	
    int a = 10;
    int b = 2;

    // array indes out of bounds
    int d[]=new int[5]; 
    String s = null; 


    void calculate(){

try{

	 d[6] = 9;
	int c  = a%b;
       System.out.println(c);
    
       	  System.out.println(s.length());
     

	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}

	catch(ArithmeticException e)
	{
		System.out.println("please enter a 0");
	}

	catch(Exception e)
	{
        System.out.println(e);
	}
       
    }
	}
	
	




public class ExceptionEx{
	

	public static void main(String args[])
	{
	   MeExcep me = new MeExcep();
	   	me.calculate();
	}
}