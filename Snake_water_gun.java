import java.util.Random;
import java.util.Scanner;
class algo{
    public int userChoice(){
        Scanner scb = new Scanner(System.in);
        System.out.print("Enter:\n\t1 for Snake\n\t2 for Water\n\t3 for Gun\n\t0 for Exit\n\t:");
        int user = scb.nextInt(); // Taking in

        if(user == 0 || user == 1 || user == 2 || user == 3){
            return user;
        }
        else {
            System.out.println("The entered input is invalid");
        }
        return 0;
    }

    public void decide(int c , int u) {
        switch (u) {
            case 1:
                System.out.println("You chose Snake");
                break;
            case 2:
                System.out.println("You chose Water");
                break;
            case 3:
                System.out.println("You chose Gun");
                break;
            case 0:
                System.out.println("You chose to exit the game");
                break;
        }

            switch (c) {
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

        if (c == u) {
            System.out.println("\tIt's a Tie");
        } else if (c == 1) {
            if (u == 2) {
                System.out.println("\tYou Loose");
            } else if (u == 3) {
                System.out.println("\tYou win");
            }
        } else if (c == 2) {
            if (u == 1) {
                System.out.println("\tYou win");
            } else if (u == 3) {
                System.out.println("\tYou win");
            }
        } else if (c == 3) {
            if (u == 1) {
                System.out.println("\tYou Loose");
            } else if (u == 2) {
                System.out.println("\tYou win");
            }
        }
    }

    public int compChoice(){
        Random rand = new Random();
        int comp = rand.nextInt(/*Min value*/ 1,/*Max Value*/ 3); // Setting the parameter for comp's random number selection
        return comp;
    }
}


public class snake_water_gun {
    public static void main(String[] args) {

        algo a = new algo();

        System.out.println("**************************************");
        System.out.println(" Welcome to the Snake-Ladder-Gun Game");
        System.out.println("**************************************");

        while (true) {
            int user = a.userChoice();
            int comp = a.compChoice();

            if(user == 0) {
                break;
             }
            a.decide(comp,user);
        }
    }

}
