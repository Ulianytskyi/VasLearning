package Vas2;

import javax.swing.JOptionPane;
public class BinaryToIntApplication {
    static int decoder(String code) {
        int n = code.length();
        int s = 0, k = 1, q = 1, a;

        while (k <= n) {
            if (code.charAt(n-k)=='1') {
                a = 1;
            } else {
                a = 0;
            }
            s += q*a;
            q *= 2;
            k++;
        }

        return s;
    }

    public static void main(String[] args) {
        String input;
        while (true) {
            String title = "Розшифровування бінарного коду";
            input = JOptionPane.showInputDialog(null,
                    "Уведіть бінарний код", title,
                    JOptionPane.QUESTION_MESSAGE);
            if (input == null) {
                System.exit(0);
            }

            int num = decoder(input);
            String text = "Ви ввели бінарний код: " + input;
            text += "\nКод відповідає числу: " + num;

            JOptionPane.showMessageDialog(null, text, title,
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
