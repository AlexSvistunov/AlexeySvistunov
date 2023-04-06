package javatraining;

import java.util.Scanner;

public class Thirteenth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNum = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int secondNum = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int thirdNum = scanner.nextInt();

        rowsofnums(firstNum,secondNum,thirdNum);


    }

    public static void rowsofnums(int x, int y, int z) {
        int zz = 0;
        for(int i = x; zz != z; i+=y) {
            zz++;
            System.out.println(i);
        }
    }
}
