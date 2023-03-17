package javatraining;

import java.util.Scanner;

public class Ninth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String firstString = scanner.next();

        System.out.println("Введите вторую строку: ");
        String secondString = scanner.next();


        System.out.println(coincidenceAtTheEnd(firstString, secondString));

    }

    public static boolean coincidenceAtTheEnd(String firstOne, String secondOne) {
        boolean bool;

        if (firstOne.endsWith(secondOne)) {
            bool = true;
        } else {
            bool = false;

        }
        return bool;

    }
}