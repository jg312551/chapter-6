package assignments;


import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors2 {
    public static void main(String[] args) {

        Scanner teeth = new Scanner(System.in);

        Random rand = new Random();


        int win=0;
        int lose=0;
        int tie=0;
        int input=0;
        System.out.println("\n1 rock"+" \n2 paper "+" \n3 scissors \n"+"enter 4 to stop playing>>>>>>>");

        while (input != 4) {
            int rps = rand.nextInt(3) + 1;
            input= teeth.nextInt();

            if (input == 1) {
                    if (rps == 1){
                        System.out.println(" a tie");
                    ++tie;}
                    if (rps == 2){
                        System.out.println( "you lost");
                    ++lose;}
                    if (rps == 3){
                        System.out.println(" A WINNER IS YOU");

                    ++win;}
                }
                if (input==2) {
                    if (rps == 1){
                        System.out.println("A WINNER IS YOU");
                    ++win;}
                    if (rps == 2){
                        System.out.println("a tie");
                    ++tie;}
                    if (rps == 3){
                        System.out.println( "you lost");
                    ++lose;}
                }
                if(input==3) {
                    if (rps == 1){
                        System.out.println("you lost");
                    ++lose;}
                    if (rps == 2){
                        System.out.println("A WINNER IS YOU");
                    ++win;}
                    if (rps == 3){
                        System.out.println("a tie");
                    ++tie;}


            }
           System.out.print("");
        }
        System.out.println("you won "+win+" times ,lost "+lose+" times and tied " +tie+ "times");

    }
}


