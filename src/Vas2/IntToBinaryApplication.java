package Vas2;

import javax.swing.JOptionPane;
public class IntToBinaryApplication {
    static String coder(int number) {
        String s ="";
        int n = number;

        do {
            s = (n % 2) + s;
            n /= 2;
        } while (n != 0);

        return s;
    }

    public static void main(String[] args) {
        String input;
        while (true) {
            String title = "Розрахунок бінарного коду";
            input = JOptionPane.showInputDialog(null,
                    "Уведіть ціле число", title,
                    JOptionPane.QUESTION_MESSAGE);
            if (input == null) {
                System.exit(0);
            }

            int num = Integer.parseInt(input);
            String code = coder(num);
            String text = "Ви ввели число: " + num;
            text += "\nБінарний код числа: " + code;

            JOptionPane.showMessageDialog(null, text, title,
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
