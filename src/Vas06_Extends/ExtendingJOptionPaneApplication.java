package Vas06_Extends;

import javax.swing.*;
import java.awt.*;

class MyPane extends JOptionPane {
    static ImageIcon img;
    static void showMessage (String txt, String title) {
        showMessageDialog(null, txt, title, PLAIN_MESSAGE,
                img = resizeImage("/Users/ulianytskyi/Pictures/PicsForLearning/transparency.png",
                        64, 64));
    }
    static void showMessage (String txt) {
        showMessage(txt, "Message");
    }
    static int getInteger(String txt) {
        String res;
        res = showInputDialog(null, txt, "Number (default 10)",
                QUESTION_MESSAGE);
        if (res == null) {

            return 10;
        } else {
            return Integer.parseInt(res);
        }
    }

    public static ImageIcon resizeImage(String imgPath, int imgWidth, int imgHeight) {
        ImageIcon img = new ImageIcon(imgPath);
        Image image = img.getImage();
        Image resizedImage = image.getScaledInstance(imgWidth, imgHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
public class ExtendingJOptionPaneApplication {
    public static void main(String[] args) {
        MyPane.showMessage("Hello!");
        int number;
        number = MyPane.getInteger("Enter integer number");
        String txt = "Numbers from 1 to " + number + ": \n";
        for (int i = 1; i <= number; i++) {
            txt += i + " ";
        }

        MyPane.showMessage(txt, "Integer numbers");
    }

}
