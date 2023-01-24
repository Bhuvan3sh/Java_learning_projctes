/*

Author - Bhuvanesh
Contact - abhuvanesh501@gmail.com
GitHub profile link - https://github.com/Bhuvan3sh

This is a program written in Java to create a random number by the computer, and user also enters a random number(guess). If the nnumbere entered by the user is correct then he has higest score.
Try is your self ;)

 */

package com.practise9;       //pakage name
import java.util.Random;    // importing Random Lib
import java.util.Scanner;   //importing Scanner Lib

class randGuess{                    // creating a cleass
    public int guess = 1, r,input;
    Scanner sc = new Scanner(System.in); // initilising vavriable for Scanner



    public void random(){   // Method for initilising the variable for Random function
        Random rand = new Random();
        r = rand.nextInt(1,10);     // Computer generating a value
    }

    public void takeInput(){        //Taking input from the user by Scanner function
        System.out.print("Enter your num ");
        input = sc.nextInt();
    }

    public void isCorrect(){        //Matching the user input and computer generated value
        if (input == r) {
            System.out.println("You have entered the correct number");
        }
    }
    public void makeScore(){        // method for generating and assigning the score
        guess++;            
    }
    public void getScore(){
        System.out.println("Your Score is "+guess);     //Showing the score
    }
}


public class Random_Number_guess_ch9{
    public static void main(String[] args) {        // main function
        randGuess ran = new randGuess();
        ran.takeInput();
        ran.random();
        int i = 1;
        while(ran.r!=ran.input){            // loop is up to ask the question again and again until correct answer is correct
            if(ran.input>ran.r){
                System.out.println("Input is bigger");
            }
            else if(ran.input<ran.r){
                System.out.println("The input is smaller");
            }
            System.out.println("Try Again");
            ran.makeScore();                // measuring the score
            ran.takeInput();                // taking the input again from the user
        }
        ran.isCorrect();                    // if(user== comp) showing that the input is correct
        ran.getScore();                     // showing the user's score
    }
}
//      ***************************End of Programme****************************