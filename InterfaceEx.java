interface Hello
{
	void add(int a, String name);
	void sub();
	void mul();
	void div();
	void me();

}
interface Hello1 implements Hello
{
	void add(int a, String name);
	void sub();
	void mul();
	void div();

}

// class HelloEx implements Hello
// {
// 	public void add(int a, String name){
//           System.out.println("addition");
// 	}
// 	public void sub()
// 	{
//           System.out.println("subtraction");

// 	}
// 	public void mul()
// 	{
//           System.out.println("multiplication");

// 	}
// 	public void div()
// 	{
//           System.out.println("division");

// 	}	

// }

class InterfaceEx implements Hello1
{
	public void add(int a, String name){
          System.out.println("addition");
	}
	public void sub()
	{
          System.out.println("subtraction");

	}
	public void mul()
	{
          System.out.println("multiplication");

	}
	public void div()
	{
          System.out.println("division");

	}
	public void me()
	{
		
	}


	public static void main(String args[])
	{
		InterfaceEx interfaceEx = new InterfaceEx();
		interfaceEx.add(10,"Hello");
	}

}


