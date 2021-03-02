
abstract class Calculator{


   abstract void add();
   abstract void sub();
   abstract void mul();
   abstract void divide();


   void end(){

   	System.out.println("End");
   }
   

}


class Calc extends Calculator{



	void add()
	{
        System.out.println("Addition");
	}
	void sub()
	{
	System.out.println("Subtraction");
	}
	void mul()
	{
		System.out.println("Multplication");
	}
	void divide()
	{
		System.out.println("Division");
	}

}

class ScentificCal extends Calculator{



	void add()
	{
        System.out.println(" S Addition");
	}
	void sub()
	{
	System.out.println("S Subtraction");
	}
	void mul()
	{
		System.out.println("S Multplication");
	}
	void divide()
	{
		System.out.println("S Division");
	}

}







public class Abstract_Ex
{
	public static void main(String args[])
	{
         ScentificCal sci = new ScentificCal()
         sci.add();
         sci.end();
	}
}