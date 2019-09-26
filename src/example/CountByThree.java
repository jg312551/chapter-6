package example;

import javax.swing.*;

public class CountByThree {
    public static void main(String[] args) {
        int max = 0;
        while (max<=300) {
            message(max);
            max+=3;
        }

    }

    public static void message(int x) {
        JOptionPane.showMessageDialog(null, x);
    }
}