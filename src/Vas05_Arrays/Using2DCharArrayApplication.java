package Vas05_Arrays;

import javax.swing.*;
import java.awt.*;

public class Using2DCharArrayApplication {
    static ImageIcon img;
    public static void main(String[] args) {
        int[] size = {3,12,4,7};
        char[][] symbs = new char[size.length][];
        char s = 'A';
        String txt = "";
        for (int i = 0; i < symbs.length; i++) {
            symbs[i] = new char[size[i]];
            for (int j = 0; j < symbs[i].length; j++) {
                symbs[i][j] = s;
                s++;
                txt += "| " + symbs[i][j] + " ";
            }
            txt += "|\n";
        }
        JOptionPane.showMessageDialog(null,
                txt, "Array with rows diff length",
                JOptionPane.PLAIN_MESSAGE,
                img = resizeImage("/Users/ulianytskyi/Programming/IdeaProjects/VasLearning/src/Vas03/even_pupp.jpg",
                        86,86));
    }
    public static ImageIcon resizeImage(String imgPath, int imgWidth, int imgHeight) {
        ImageIcon img = new ImageIcon(imgPath);
        Image image = img.getImage();
        Image resizedImage = image.getScaledInstance(imgWidth, imgHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
