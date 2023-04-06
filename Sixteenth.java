
import java.util.Scanner;


public class Sixteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        int amountOfUppers = 0;
        int amountOfLowers = 0;
        for (int i = 0; i < str.length(); i++) {
            char chaR = str.charAt(i);
            if (Character.isUpperCase(chaR)) {
                amountOfUppers++;
            } else if (Character.isLowerCase(chaR)) {
                amountOfLowers++;
            }
        }

        if (amountOfUppers > amountOfLowers) {
            str = str.toUpperCase();
        } else if (amountOfLowers > amountOfUppers) {
            str = str.toLowerCase();
        } else {
            str = str.toLowerCase();
        }

        System.out.println(str);
    }
}