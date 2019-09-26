package example;

import java.util.Random;
import java.util.Scanner;

public class randomGuess {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int choice=0;
        int rand1 = rand.nextInt(100)+1;
        System.out.println("please pick a number between 1 and 100 >>>>>");

        int counter=0;
        while (choice!=rand1) {
            counter++;

            choice = input.nextInt();

            if (choice == rand1) {
                System.out.println("you got it,a winner is you");
            } else if (choice > rand1) {
                System.out.println("too high ");


            } else if (choice < rand1) {
                System.out.println("too low ");
            }

        }
        System.out.println("it took you"+counter+"guesses to get it.");
    }
}
