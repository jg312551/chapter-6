package assignments;

import javax.swing.*;
import java.util.Scanner;

public class evenEntryLoop {
    public static void main(String[] args){

        Scanner device = new Scanner(System.in);

        int input=0;


    while ( input!=999){
        System.out.println("enter an even number or enter 999 to end code");
        input=device.nextInt();
        if(input%2==0) {
            System.out.println("good job");
        }

        else
            System.out.println("404 ERROR");
}

}
}