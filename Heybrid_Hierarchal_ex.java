import java.util.Scanner;
class Car
{


	String color = "Hacker";

	String color(String colName)
	{
		if("col" == colName || "col1" == colName || "col2"==colName)
        {
			System.out.println(colName);
		}
	  return colName;
	}

	void engine(double salary)
	{
	  System.out.println(salary);
	}
}

class Bmw extends Car
{
					Scanner sc = new Scanner(System.in);

	String color = "White hat Hacker";
     void friz()
     {
         double a = sc.nextDouble();
     	super.engine(a);
     	System.out.println(color);
     	System.out.println(super.color);
     	System.out.println("friz");
     }

}

class Lamborgini extends Bmw
{
     void luxury()
     {
     	System.out.println("luxury");
     }

}


class Jeep extends Lamborgini
{

}

public class Heybrid_Hierarchal_ex
{
	public static void main(String []args)
	{

       Car c = new Car();
       String col1 = c.color("Balck");
      System.out.println(col1);

	    Bmw bmw = new Bmw();
	    String col = bmw.color("Orange");
	    bmw.color(col);
	    bmw.engine(10);
	    bmw.friz();


		Lamborgini   lambo =new Lamborgini();
		lambo.luxury();
		String col2 = lambo.color("red");
		System.out.println(col2);
		lambo.friz();

	}


}