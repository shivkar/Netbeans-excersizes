/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class Sc {
    public static void main(String[] args){
        int userchoice =0;
        Scanner sk = new Scanner(System.in);
        simplecalculator calc = new simplecalculator();
                
        int a = 0;
        int b =0;
        
        while( userchoice != 5){ 
             System.out.println("Please enter your choice");
             System.out.println("1.Add");
             System.out.println("2. Substract");
             System.out.println("3. Multiply");
             System.out.println("4. Divide");
             System.out.println("5. Exit ");
             userchoice = sk.nextInt();
             sk.nextLine();
             if( userchoice > 0  && userchoice < 5 )
                 System.out.println("Please enter first number :");
                 a = sk.nextInt();
                 sk.nextLine();
                 System.out.println("Please enter second number :");
                 b = sk.nextInt();
                 sk.nextLine();
                  
        switch(userchoice){case  1:
        System.out.println(a + "+" + b + "=" + calc.Add( a,b));
        break;
        
        case 2 : 
                System.out.println(a + "-" + b + "=" + calc.Substract(a,b));
                break;
                
        case 3 : 
                System.out.println(a + "*" + b + "=" + calc.Multiply(a,b));
                break;
                
        case 4 :
            System.out.println(a + "/" + b + "=" + calc.Divide(a,b));
            break;
            
        case 5 : 
            
             System.out.println("Thanks for playing ! ");   
             
             break;
             
        default : 
            
            System.out.println("Invalid number. Select 1 to 5 .");       
        
        break;
        
        }
    }
    
    }}
