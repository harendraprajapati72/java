

import  java.util.Scanner;

  class abc
{
    int a,b;
    void sum()
    {
        int  c=a+b;
        System.out.println("the sum is: "+c);
    }
    void minus()
    {
        int  c=a-b;
        System.out.println("the minus is:"+c);
    }
}

class userinput {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the Second number");
        int b=sc.nextInt();

        abc obj=new abc();
        obj.sum();
        obj.minus();
        sc.close();
    }
}
