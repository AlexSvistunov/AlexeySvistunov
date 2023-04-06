package javatraining;
import java.util.Arrays;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш статус: ");
        String string = scanner.nextLine();
        String[] inputArr = string.split(",");
        boolean[] values = new boolean[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            values[i] = inputArr[i].equals("1");
        }
        int n = 0;
        for (boolean value : values) {
            if (value) {
                n++;
            }
        }
        System.out.println(Arrays.toString(values));
        System.out.println("Число работников: " + n);
    }
}