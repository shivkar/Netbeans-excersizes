/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SHIVALI
 */
public class Rockpaperscissor {
    public static void main(String[] args) {
             Scanner sk = new Scanner(System.in);
             System.out.println("Welcome to game");
               while(true){System.out.println("Enter Rock,Scissors,Paper : ");
                String round = sk.nextLine();
                if (round.equals("quit")){break;}
                else{int rand =(int)(Math.random()* 3+1);if(!round.equals("Rock") && !round.equals("Paper") && !round.equals("Scissors"))
            {System.out.println("Your round is invalid");
            String newRound = "";
            if(rand ==1){newRound = "Rock";} else if(rand == 2){newRound = "Paper";}else{newRound = "Scissors";}
            System.out.println( " result : " + newRound);
            if(round.equals(newRound)){System.out.println("It is a tie!");}
                    else if((round.equals("Rock")&& newRound.equals("Scissors"))||
                            (round.equals("Scissors")&& newRound.equals("Paper")) ||
                            (round.equals("Paper") && newRound.equals("Rock")))
                             {System.out.println("You win");}
                            else{System.out.println("You lost");}}}
                   System.out.println("Thanks for playing Rock, Paper, Scissors!");}}}
            

            
            
            
             
               
            
 
