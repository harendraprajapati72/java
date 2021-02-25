import java.util.*;
class Varriable
{
	Scanner sc=new Scanner(System.in);
	int ch, ch1,ch2;
	
}

class WorkAllForMall extends Varriable
{
	void inputdata()
	{
		System.out.println("PRESS 1 FOR SHOOSE");
		System.out.println("PRESS 2 FOR CLOTHS");
		System.out.println("PRESS 3 FOR BEAUTY PRODUCTS");
		System.out.println("PRESS 4 HEALTH PRODUCTS");
		System.out.println("PRESS 5 FOR MOVIE");
		System.out.println("PRESS 6 FOR LOG OUT");
		 
		 do{
		 	ch=sc.nextInt();
		 	switch(ch)
		 	{
		 		
		 		case 1:
		 		System.out.println("THEIR ARE 200 OFF ON THE 2000 OR ITS ABOVE SHOOSE PURCHASING \n");
		 		System.out.println("PRESS 1 TO PURCHASE PUMA");
		 		System.out.println("PRESS 2 TO PURCHASE ADDIDAS");
                System.out.println("PRESS 3 TO PURCHASE NIKE ");
		 		System.out.println("PRESS 10 TO GO BACK");
		 		

		 		
		 	    System.out.println("PLEASE CHOOSE YOUR CHOICE");
		 	    
		 	    do{
		 	    	ch1=sc.nextInt();
		 	    	switch(ch1)
		 	    	{
		 	    		case 1:
		 	    		System.out.println("YOU ARE PURCHASING PUMA");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>=2000)
		 	    		 {
		 	    		 	double payamount=ch2-200;
		 	    		  System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	    		else{
		 	    			System.out.println("NO OFFER'S ARE AVAILABLE");
		 	    			double payamount=ch2;
		 	    		  System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}

		 	    		break;

		 	    		case 2:
		 	    		System.out.println("YOU ARE PURCHASING ADDIDAS");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>=2000)
		 	    		 {
		 	    		 	double payamount=ch2-200;
		 	    		    System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	    		else{
		 	    			System.out.println("NO OFFER'S ARE AVAILABLE");
		 	    			double payamount=ch2;
		 	    		    System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}
		 	    		break;
		 	    		case 3:
		 	    		System.out.println("YOU ARE PURCHASING NIKE");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>=2000)
		 	    		 {
		 	    		 	double payamount=ch2-200;
		 	    		    System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	    		else{
		 	    			System.out.println("NO OFFER'S ARE AVAILABLE");
		 	    			double payamount=ch2;
		 	    		    System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}
		 	    		break;
		 	    		

		 	    	}

		 	    }while(ch1==10);
		 		break;
		 		



		 		case 2:
		 		System.out.println("THEIR ARE 50% OFF ON THE WINTER'S CLOTHS ABOVE 3000 PURCHASING ");
		 		System.out.println("PRESS 1 TO PURCHASE WINTER CLOTHS ");
		 		System.out.println("PRESS 2 TO PURCHASE SUMMER CLOTHS ");

		 		do
		 		{
		 			ch1=sc.nextInt();
		 		switch (ch1) {
		 			case 1:
		 			    System.out.println("YOU ARE PURCHASING WINTER CLOTHS");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>=3000)
		 	    		 {
		 	    		 	double payamount=(ch2-(ch2/2));
		 	    		  System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	    		else{
		 	    			System.out.println("NO OFFER'S ARE AVAILABLE");

		 	    		 	double payamount=ch2;
		 	    		  System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}

		 	    		break;
		 			
		 			case 2:
		 			System.out.println("YOU ARE PURCHASING SUMMER CLOTHS");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    	
		 	    		 {
		 	    		 	double payamount=ch2;
		 	    		 	System.out.println("NO OFFER'S ARE AVAILABLE ON SUMMER CLOTHS");
		 	    		  System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	 

		 	    		break;
		 			
		 		}

		 	} while(ch1==10);
		 		break;
		 		
		 		case 3:
		 		System.out.println("YOU PURCHASING BEAUTY PRODUCTS");
		 		System.out.println("PLEASE ENTER YOUR AMMOUNT");
		 		ch2=sc.nextInt();
		 		{
		 			int payamount=ch2;
		 			System.out.println("NO OFFER'S ARE AVAILABLE ON BEAUTY PRODUCTS");
		 	    	System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 		}
		 		break;
		 		case 4:
		 		System.out.println("YOU PURCHASING HEALTH PRODUCTS");
		 		System.out.println("PLEASE ENTER YOUR AMMOUNT");
		 		ch2=sc.nextInt();
		 		{
		 			int payamount=ch2;
		 			System.out.println("NO OFFER'S ARE AVAILABLE ON HEALTH PRODUCTS");
		 	    	System.out.println("YOUR PAYABLE AMMOUNT IS:"+" "+payamount);	
		 		}
		 		break;
		 		case 5:
		 		System.out.println("THEIR ARE SOME CINEMA'S OF LUCKNOW ");
		 		System.out.println("PRESS 1 TO BOOK TICKET ON FUN CINEMA");
		 		System.out.println("PRESS 2 TO BOOK TICKET ON WAVE CINEMA");
		 		System.out.println("PRESS 3 TO BOOK TICKET ON SAHARA CINEMA \n");

		 		
		 	    System.out.println("PLEASE CHOOSE YOUR CHOICE");
		 	    
		 	    do{
		 	    	ch1=sc.nextInt();
		 	    	switch(ch1)
		 	    	{
		 	    		case 1:
		 	    		System.out.println("YOU ARE BOOKING TICKET ON FUN CINEMA");
		 	    		System.out.println("NORMAL PRICE ARE 149 OR ITS BELOW ");
		 	    		System.out.println("VIP PRICE ARE 150 OR ITS ABOVE ");
		 	    		System.out.println("YOU ARE BOOKING TICKET ON FUN CINEMA");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>149)
		 	    		 {
		 	    		 	double payamount=ch2;
		 	    		  System.out.println("HURRY YOUR VIP TICKET IS BOOKED, PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	    		else{
		 	    			double payamount=ch2;
		 	    		  System.out.println("YOUR TICKET IS BOOKED, PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}

		 	    		break;

		 	    		case 2:
		 	    		System.out.println("YOU ARE BOOKING TICKET ON WAVE CINEMA");
		 	    		System.out.println("NORMAL PRICE ARE 199 OR ITS BELOW ");
		 	    		System.out.println("VIP PRICE ARE 200 OR ITS ABOVE ");
		 	    		System.out.println("YOU ARE BOOKING TICKET ON WAVE CINEMA");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>199)
		 	    		 {
		 	    		 	double payamount=ch2;
		 	    		  System.out.println("HURRY YOUR VIP TICKET IS BOOKED, PAYABLE AMMOUNT IS:"+" "+payamount);	
		 	    		}
		 	    		else{
		 	    			double payamount=ch2;
		 	    		  System.out.println("YOUR TICKET IS BOOKED, PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}
		 	    		break;
		 	    		case 3:
		 	    		System.out.println("YOU ARE BOOKING TICKET ON SAHARA CINEMA");
		 	    		System.out.println("NORMAL PRICE ARE 249 OR ITS BELOW ");
		 	    		System.out.println("VIP PRICE ARE 250 OR ITS ABOVE ");
		 	    		System.out.println("YOU ARE BOOKING TICKET ON SAHARA CINEMA");
		 	    		System.out.println("PLEASE ENTER YOUR AMMOUNT TO PAY");
		 	    		ch2=sc.nextInt();
		 	    		if (ch2>249)
		 	    		 {
		 	    		 	double payamount=ch2;
		 	    		  System.out.println("HURRY YOUR VIP TICKET IS BOOKED, PAYABLE AMMOUNT IS:"+" "+payamount);		
		 	    		}
		 	    		else{
		 	    			double payamount=ch2;
		 	    		  System.out.println("YOUR TICKET IS BOOKED, PAYABLE AMMOUNT IS:"+" "+payamount);
		 	    		}
		 	    		break;
		 	    		

		 	    	}

		 	    }while(ch1==10);
		 		break;
		 		
		 		
		 		
		 	}
		 }while(ch==6);

	}

}

public class MallManagement
{
public static void main(String[] args) 
{
	WorkAllForMall w=new WorkAllForMall();
	w.inputdata();
}
} 