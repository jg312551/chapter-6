package assignments;

import javax.swing.*;

public class countByAnything {
    public static void main(String[] args){

        String temp=JOptionPane.showInputDialog(null,"enter number you want to count by");
        int input=Integer.parseInt(temp);

        int m=0;


            for(int x=0;x<=300;x+=input){
                System.out.print(x + " ");

                m += 1;
                if(m == 10){
                System.out.println("\n");
                m=0;
                }

    }
}
    }





