package javatraining;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Ваше число простое : " + isthisnumsimple(number));


    }

    public static boolean isthisnumsimple(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;

        }
        return true;

    }
}
