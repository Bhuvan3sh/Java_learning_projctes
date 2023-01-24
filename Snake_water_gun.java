package com.exercise; 

import java.util.Random; 
import java.util.Scanner; 


public class Snake_water_gun { 
    public static void main(String[] args) {
        Random rand = new Random(); 
        Scanner scb = new Scanner(System.in); 
        
        int comp = rand.nextInt(/*Min value*/ 1,/*Max Value*/ 3); // Setting the parameter for comp's random number selection 

        System.out.print("Enter:\n\t1 for Snake\n\t2 for Water\n\t3 for Gun\n\t:");
        int user = scb.nextInt(); // Taking in


        switch (comp){
            case 1:
                System.out.println("Computer chose Snake");
                break;
            case 2:
                System.out.println("Computer chose Water");
                break;
            case 3:
                System.out.println("Computer chose Gun");
                break;
        }
        switch (user){
            case 1:
                System.out.println("You chose Snake");
                break;
            case 2:
                System.out.println("You chose Water");
                break;
            case 3:
                System.out.println("You chose Gun");
                break;
        }


        if(comp == user){
            System.out.println("\tIt's a Tie");
        } else if (comp==1) {
            if (user == 2){
                System.out.println("\tYou Loose");
            } else if (user ==3) {
                System.out.println("\tYou win");
            }
        }
        else if (comp == 2){
            if (user == 1){
                System.out.println("\tYou win");
            }
            else if(user==3){
                System.out.println("\tYou win");
            }
        }
        else if(comp == 3){
            if (user == 1){
                System.out.println("\tYou Loose");
            }
            else if(user == 2){
                System.out.println("\tYou win");
            }
        }


    }

}
