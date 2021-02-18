class MyClass
{
	char gen; int age;
MyClass(char c,int a)
{
	gen=c;
	age=a;
}
MyClass(){

}
void printData()
{
	System.out.println("we are best");
	if(gen=='m')
	{
		System.out.println("correct");
	}
	else{
		System.out.println("not correct");
	}
}
}

public class Ssir
{
	public static void main(String []args) {
		//MyClass myclass1=new MyClass('m',20);
		//System.out.println(myclass1.gen+" "+myclass1.age);
		myclass1.printData();

				MyClass myclass=new MyClass();
				myclass.printData();


		
	}
}