import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введи будь-який текст: ");
        String text = scanner.nextLine();

        System.out.println("Ти надрукував: " + text);
        text = scanner.nextLine();


        System.out.println(text);
    }
}