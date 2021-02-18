public class ForEx
{
   public static void main(String args[])
   {
   	int a = 2;
   	int i;


         for(i=1; i<11; i++)
         {

         	System.out.println(i*a);

         }
         i=1;

         while(i<=10)
         {
         	System.out.println(i*a);
         	i++;
         }

         do
         {
         	System.out.println("hello");
         	i++;
         	System.out.println(i);
         }while(i<15);

   }
}