package javatraining;


import java.util.Scanner;

public class Forth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.next();
        System.out.println("Введите символ: ");
        String sym = scanner.next();
        char symbol = sym.charAt(0);

        System.out.println("Количество вхождений: " + str_count(string, symbol));


    }

    public static int str_count(String str, char chars) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==chars) {
                count++;

            }
        }
        return count;

    }
}