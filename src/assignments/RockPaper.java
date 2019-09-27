package assignments;

import java.util.Random;
import java.util.Scanner;

public class RockPaper {

    public static void main(String[] args){

        String result;
        int user;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        result = "Welcome to Rock Paper Scissors";
        displayPrint(result);

        result = "Choose the following \n1: Rock \n2: Paper \n3: Scissors";
        displayPrint(result);

        int r = rand.nextInt(3)+1;
        user = input.nextInt();
        if(user == 1){
            if(r == 1){
                result = "Tie";
            }
            else if(r == 2){
                result = "Lose";
            }
            else{
                result = "Win";
            }
            displayPrint(result);
        }
    }

    public static void displayPrint(String result){
        System.out.println(result);
    }

}
