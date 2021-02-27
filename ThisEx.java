/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstjavaprg;

import java.util.Scanner;

/**
 *
 * @author my
 */

class CarEx
{
    CarEx(int id, String name, String address){
        
        this(id, name);
       System.out.println(address);
    }
    
    
    CarEx(int id, String name)
    {
        this();
    System.out.println(id);
    System.out.println(name);
    
    }
      CarEx( )
    {
        
    System.out.println("hello");
    
    }
      
      void m(CarEx obj)
      {
          
        System.out.println(obj.add());
      }
      
      void n(){
         m(this);
      }
      int add(){
            return 10;
      }
      
   
      
    
}



public class ThisEx {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a id");
        int i = sc.nextInt();
        System.out.println("Enter a name");
        String n = sc.next();
        System.out.println("Enter a id");
        String add = sc.next();
        CarEx ex = new CarEx(i,n,add);
        ex.n();
    }
    
}
