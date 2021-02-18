//variable intialization


//int a = 10
// using reference variable
	// using reference UsingMethod
	// using reference UsingConstructor





 class Main
{
	// using reference variable

 int id;
 String name;
 String address;
}


 class UsingMethod
{
	// using reference UsingMethod

 double salary;
 int phone;

void getData(double sal, int pho)
{
   salary = sal;
   phone = pho;
}


}


 class UsingConst
{
	// using reference Constructor
	int id;
	String name;
UsingConst(int i, String n)
{
   id = i;
   name = n;
}



}




public class VarEx
{
	public static void main(String []args)
	{
		Main varex = new Main();
		varex.id = 10;
		varex.name = "Harendra";
		varex.address = "BBD";
		System.out.println(varex.id);
		System.out.println(varex.name);
		System.out.println(varex.address);


		UsingMethod usingMethod = new UsingMethod();
		usingMethod.getData(70000.78,876568776);
		System.out.println(usingMethod.salary);
		System.out.println(usingMethod.phone);


		// using constructor

		UsingConst usingConst = new UsingConst(1, "hello");
		System.out.println(usingConst.id+ " " + usingConst.name);


	}
  
}



