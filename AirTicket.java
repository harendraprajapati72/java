
import java.util.Scanner;

class MyClass
{

	 Scanner sc=new Scanner(System.in);

	 char ch;
     char gen; 
    int age;
    int age1;
    String name,lname,passid,dob,nationality,state,dist;
    
    MyClass()
    {
    	System.out.println(" \t\t\t\t\t\t\t\t\t\t\t  WELCOME TO TICKET BOOKING \n\n");
    	System.out.println(" \t\t\t\t\t\t\t\t\t\t   PRESS m FOR MALE AND f FOR FEMALE");
	

     }
MyClass(char c,int a)
{
	
	gen=c;
	age=a;
}

// void hp()
// {
// 	System.out.println("  PRESS m FOR MALE AND f FOR FEMALE");
// }

boolean EnterData()
{
	ch = sc.next().charAt(0);
	
	if(ch == 'm')
	{  
		

		System.out.println("PLEASE ENTER YOUR AGE");
		age1=sc.nextInt();
		if (age1 >= 18) {

			

			System.out.println("PLEASE ENTER YOUR FIRST NAME");
		name=sc.next();
		
		System.out.println("PLEASE ENTER YOUR LAST NAME");
		lname=sc.next();

		System.out.println("PLEASE ENTER YOUR PASSPORT ID");
		passid=sc.next();

		System.out.println("PLEASE ENTER YOUR DOB");
		dob=sc.next();

		System.out.println("PLEASE ENTER YOUR NATIONALITY");
		nationality=sc.next();
		System.out.println("PLEASE ENTER YOUR STATE");
		state=sc.next();

		System.out.println("PLEASE ENTER YOUR DISTRICT");
		dist=sc.next();

		return true; 

		}
		else{
			System.out.println("\t\t ....................................................................................................................................................................... \n");
			System.out.println("\t\t\t\t\t\t\t\t\t error....!!! SORRY..... MAN YOU ARE NOT ABLE TO BOOK TICKET AGE LIMIT 20 YEARS");
         return false;
		}

		
	}

	else if (ch == 'f') {

		System.out.println("PLEASE ENTER YOUR AGE");
		age1=sc.nextInt();
		if (age1 >=20 ) {
			System.out.println("PLEASE ENTER YOUR FIRST NAME");
		name=sc.next();
		
		System.out.println("PLEASE ENTER YOUR LAST NAME");
		lname=sc.next();


		System.out.println("PLEASE ENTER YOUR PASSPORT ID");
		passid=sc.next();

		

		System.out.println("PLEASE ENTER YOUR DOB");
		dob=sc.next();

		System.out.println("PLEASE ENTER YOUR NATIONALITY");
		nationality=sc.next();
		System.out.println("PLEASE ENTER YOUR STATE");
		state=sc.next();

		System.out.println("PLEASE ENTER YOUR DISTRICT");
		dist=sc.next();
		return true;
			
		}
		else
		{
			System.out.println("\t\t ....................................................................................................................................................................... \n");
			System.out.println("\t\t\t\t\t\t\t\t\t error....!!! SORRY..... MAM YOU ARE NOT ABLE TO BOOK TICKET AGE LIMIT 18 YEARS");
 			return false;
		}
	}
	
	else if (ch !='m' && ch !='f') {
		System.out.println("\t\t\t\t PLEASE FILL PROPERLY:");
		
	}
	return false;
}
	
	//default:System.out.println(" PLEASE ENTER m or f \t(ONLY  SMALL LETTER'S ARE ALLOWED PLEASE TRY AGAIN )");


void PrintData(){

	System.out.println("\t\t ....................................................................................................................................................................... \n");

	System.out.println(" \t\t\t\t\t\t\t\t\t\t\t  WELCOME TO TICKET BOOKING \n");

	System.out.println("\t\t .......................................................................................................................................................................");
	System.out.println("\t\t\t YOU NAME IS        :"+name+" "+lname);
	System.out.println("\t\t\t YOU PASSPORT ID IS :"+passid);
	System.out.println("\t\t\t YOU AGE IS         :"+age1);
	System.out.println("\t\t\t YOU DOB IS         :"+dob);
	System.out.println("\t\t\t YOU NATIONALITY IS :"+nationality);
	System.out.println("\t\t\t YOU STATE  IS      :"+state);
	System.out.println("\t\t\t YOU DISTRICT  IS   :"+dist);
	System.out.println("\n\n");
	System.out.println("\t\t .......................................................................................................................................................................");
	System.out.println("\t\t\t\t\t\t\t\t\t   HURRY YOUR TICKET IS BOOKED NOW ...HAPPY JOURNEY");
	System.out.println("\t\t .......................................................................................................................................................................");
	System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t All @Copyright reserved by Harendra Prajapati");
	System.out.println("\t\t .......................................................................................................................................................................\n\n");

}

}

public class AirTicket
{
	public static void main(String []args) {
		

		//MyClass myclass=new MyClass();
		// myclass.hp();

			//	MyClass myclass1=new MyClass();
				//myclass.printData();
		MyClass myclass2=new MyClass();
		//System.out.println(myclass1.gen+" "+myclass1.age);
		boolean a = myclass2.EnterData();
		if(a)
		{
		myclass2.PrintData();

		}

				


		
	}
}
