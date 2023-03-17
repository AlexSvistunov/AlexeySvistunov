package javatraining;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Seventh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        range(n);

    }

    public static void range(int n) {
        int intMX = Integer.MAX_VALUE;
        int num = 0;
        for (int i = 0; i <= n; i++) {
            int diff = Math.abs((i * i) - n);
            if (diff < intMX) {
                intMX = diff;
                num = i;
            }

        }

        System.out.println("Ближайшее число: " + num);


    }
}