import javax.swing.*;
import java.util.Random;

public class door {
    public static void main(String[] args) {

        Random rand = new Random();
        int rand1 = rand.nextInt(3) + 1;
        String temp;
        int input=4;
        String prize = null;
        int win = rand.nextInt(7) + 1;

        while (input > 3) {
            temp = JOptionPane.showInputDialog(null, "enter a door number between 1 and 3  ");
            input = Integer.parseInt(temp);

            if (win == 1)
                prize = "a brand new toaster";
            else if (win == 2)
                prize = "a brand new car";
            else if (win == 3)
                prize = "a new gallon of milk";
            else if (win == 4)
                prize = "an ipod nano";
            else if (win == 5)
                prize = "a box containing 50 pencil erasers, pencils not included";
            else if (win == 6)
                prize = "some gold encrusted toast";
            else if (win == 7)
                prize = "nothing";


            if (rand1 == 1 && input == 1){
                message("you win " + prize);

            }
            else if (rand1 == 2 && input == 2){
                message("you win " + prize);

            }
            else if (rand1 == 3 && input == 3){
                message("you win " + prize);

            }

            else
                message("you chose the wrong door," );


        }
    }
  public static void message(String x){
    JOptionPane.showMessageDialog(null,x);
  }
}
