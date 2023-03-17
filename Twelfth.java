package javatraining;

import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNum = scanner.nextInt();
        squaredNumbers(firstNum,secondNum);

    }

    public static void squaredNumbers(int x, int y) {
        int smallNum = 0;
        int bigNum = 0;

        if (x < y) {
            smallNum = x;
            bigNum = y;
        }
        else if(x > y) {
            smallNum = y;
            bigNum = x;

        }

        for(int i = smallNum; i <= bigNum; i+=smallNum) {
            int square = i * i;
            System.out.println(square);

        }
    }
}
