package javatraining;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        String currentName = scanner.next();
        System.out.println("Привет, " + editedname(currentName) + "!");

    }

    public static String editedname(String name) {
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }
}
