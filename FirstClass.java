/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

import java.util.Scanner;

/**
 *
 * @author harendraprajapati
 */
public class FirstClass {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a charcter");
       
        char c = sc.next().charAt(0);
   
          if(c == 9)
          {
             System.out.println(c);
          }
          else if(c == 10)
          {
            System.out.println(c);
          }
          else
          {
          System.out.println("not in caharacter");
          }
          
          
          switch(c)
          {
              case 'm':
                  System.out.println("Male");
                  break;
              case 'f':
                  System.out.println("female");
                  
              default:
                  System.out.println("enter only m or f");
          
          
          }
        
            
        
        
    }
    
    
    
}

