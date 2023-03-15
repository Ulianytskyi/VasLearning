package Vas03;

/*
 * This program is used to check if a number entered by the user is even or odd.
 * It takes a number from the user input and using an if statement
 * to determine if the number is even or odd.
 * It then displays an appropriate message and image to the user.
 */

import javax.swing.*;
import java.awt.*;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        String input, txt, title;
        int number;
        ImageIcon img;
        while (true) {
            input = JOptionPane.showInputDialog(null,
                    "Уведіть число", "Перевірка числа",
                    JOptionPane.QUESTION_MESSAGE);

            if (input == null) {

                JOptionPane.showMessageDialog(null,
                        "До побачення!", "Завершення програми",
                        JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            try {
                number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    img = resizeImage("/Users/ulianytskyi/Programming/IdeaProjects/VasLearning/src/Vas03/even_pupp.jpg", 64, 64);
                    txt = "Число " + number + " - парне!";
                    title = "Парне число";
                } else {
                    img = resizeImage("/Users/ulianytskyi/Programming/IdeaProjects/VasLearning/src/Vas03/odd_pupp.jpg", 64, 64);
                    txt = "Число " + number + " - непарне!";
                    title = "Непарне число";
                }
                JOptionPane.showMessageDialog(null,
                        txt, title, JOptionPane.PLAIN_MESSAGE, img);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "Невірне введення. Спробуйте ще раз увести число", "Помилка",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static ImageIcon resizeImage(String imgPath, int imgWidth, int imgHeight) {
        ImageIcon img = new ImageIcon(imgPath);
        Image image = img.getImage();
        Image resizedImage = image.getScaledInstance(imgWidth, imgHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
