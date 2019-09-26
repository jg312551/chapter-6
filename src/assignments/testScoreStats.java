package assignments;

import java.util.Scanner;

public class testScoreStats {
    public static void main(String[] args) {

        Scanner device = new Scanner(System.in);

        int score = 0;
        int high=0;
        int low=100;
        int average;
        int numScores=0;
       int  totalscore=0;


        while (score != 999) {
            System.out.println("enter any amount of tests score enter 999 to stop entering scores>>>>>");
            score = device.nextInt();
            ++numScores;
            if(score<=0 || score>100)
                System.out.println("enter a valid score");
            else if(score>high)
                high=score;
            else if(score< low)
                low = score;
           totalscore = totalscore+score;
        }
        average=totalscore/numScores;
        System.out.println("the average score is :"+average+" the number of scores entered is "+numScores+" the highest score is "+high+ " ");


    }
}
