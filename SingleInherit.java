class Car
{

	String color(String colName)
	{
		if("col" == colName || "col1" == colName || "col2"==colName)
        {
			System.out.println(colName);
		}
	  return colName;
	}

	void engine()
	{
	  System.out.println("400km/h");
	}
}

class Bmw extends Car
{
     void friz()
     {
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



public class SingleInherit
{
	public static void main(String []args)
	{
       Car c = new Car();
       String col1 = c.color("Balck");
      System.out.println(col1);

	    Bmw bmw = new Bmw();
	    String col = bmw.color("Orange");
	    bmw.color(col);
	    bmw.engine();
	    bmw.friz();


		Lamborgini   lambo =new Lamborgini();
		lambo.luxury();
		String col2 = lambo.color("red");
		System.out.println(col2);
		lambo.friz();

	}


}