package assignments;

import javax.swing.*;

public class countByThree2 {


    public static void main(String[] args) {

        for (int x = 0; x <= 300; ++x) {

            if (x % 3 == 0)
                System.out.print(x+" ");
            if (x % 30 == 0) {
                System.out.print(x+" ");
                System.out.println("\n");
            }

        }
    }
}

