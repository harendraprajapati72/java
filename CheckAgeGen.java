import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harendraprajapati
 */
public class CheckAgeGen {
    public static void main (String args [])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t  WELCOME\n\n\n");
         System.out.println("\t\t\t\t\t\t\t IF YOU WANT TO GET LICENSE PLESE FILL THE BELOW DETAILS:\n");
        System.out.println("\t\t\t\t\t\t\t PRESS m FOR MALE AND f FOR FEMALE");
        char ch = sc.next().charAt(0);
     
       switch(ch)
          {
              case 'm':
                  System.out.println("\t\t\t\t\t\t\t PLEASE ENTER THE AGE");
                  int i = sc.nextInt();
                  if(i>=18) 
                  {
                    System.out.println("\t\t\t\t\t\t\tHURRY YOU ARE ELIGIBLE FOR LICENSE");
                    System.out.println("\t\t\t\t\t\t\tYOUR AGE IS: "+i);
                }
                else
                {
                System.out.println("\t\t\t\t\t\t\t SORRY YOU ARE NOT ELIGIBLE FOR LICENSE ONLY ABOVE 18 ARE ALLOWED LICENSE");
                System.out.println("\t\t\t\t\t\t\tYOUR AGE IS: "+i);
                }
                 break;
                                  case 'f':
                                     System.out.println(" \t\t\t\t\t\t\t PLEASE ENTER THE AGE");
                                      int j = sc.nextInt();
                                      if(j>=20) 
                                      {
                                        System.out.println("\t\t\t\t\t\t\t HURRY YOU ARE ELIGIBLE FOR LICENSE");
                                        System.out.println("\t\t\t\t\t\t\t YOUR AGE IS: "+j);
                                    }
                                    else
                                    {
                                      System.out.println("\t\t\t\t\t\t\t SORRY YOU ARE NOT ELIGIBLE FOR LICENSE ONLY ABOVE 20 ARE ALLOWED LICENSE");
                                       System.out.println("\t\t\t\t\t\t\t YOUR AGE IS: "+j);

                                    }
                                      break;
                
              default:
                  System.out.println(" PLEASE ENTER m or f \t(ONLY  SMALL LETTER'S ARE ALLOWED PLEASE TRY AGAIN )");
          
          
          } 

     }


   }


     
    
    
    