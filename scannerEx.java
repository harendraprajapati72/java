

import java.util.Scanner;

public class scannerEx {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\uD83D\uDE4F WELCOME TO MARRIGE SESSION CHECK TOU ARE ABLE TO MARRIGE OR NOT \uD83D\uDE4F ");
        System.out.println("PLEASE ENTER YOUR GENDER MALE OR FEMALE ONLY");
        String mygender=sc.nextLine();
        if(mygender.equals("male"))
        {
            System.out.println("you are "+mygender);
            System.out.println("\uD83E\uDD70Please enter the age in years only\uD83E\uDD70");
            int age=sc.nextInt();
            if (age>=20)
            {
                System.out.println(" \uD83D\uDE0D ENJOY ou are able to marrige\uD83D\uDC69\u200D❤️\u200D\uD83D\uDC69  your  age is: "+age+"years");

            }
            else
            {
                System.out.println(" \uD83D\uDE07SORRY you are not able to marrige\uD83D\uDC69\u200D❤️\u200D\uD83D\uDC69  your age is: "+age+"years");
            }

    }
        else if (mygender.equals("female"))
        {
            System.out.println("you are "+mygender);
            System.out.println("\uD83E\uDD70Please enter the age in years only\uD83E\uDD70");
            int age=sc.nextInt();
            if (age>=18)
            {
                System.out.println(" \uD83D\uDE0D ENJOY ou are able to marrige\uD83D\uDC69\u200D❤️\u200D\uD83D\uDC69  your  age is: "+age);

            }
            else
            {
                System.out.println(" \uD83D\uDE07SORRY you are not able to marrige\uD83D\uDC69\u200D❤️\u200D\uD83D\uDC69  your age is: "+age);
            }
        }
        }
}
