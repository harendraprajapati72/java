



class Addition
{
  int add(int a, int b)
  {
  	int c = a + b;
  	return  c;
  }

  int add(int a, int b, int d)
  {
  	int c = a + b + d;
  	return c;
  }


  void add(String me)
  {
  	System.out.println(me);
  }

  void add(float a, float b)
  {
  	float c = a + b;
  	System.out.println(c);
  }

}




public class Poly_Loading_Ex
{
	
public static void main(String []args)
{
	   Addition addition = new Addition();
	   addition.add("hello");

}

}