package javatraining;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");

        int arrayNum = scanner.nextInt();
        int[] array = new int[arrayNum];

        System.out.println("Сумма квадратов чисел массива равна: " + squaredSum(array));


        }

    public static  int squaredSum(int[] ar) {
        int sum = 0;
        Scanner scanner  = new Scanner(System.in);

        for(int i = 0; i < ar.length; i++) {
            System.out.println("Введите " + (i + 1) + " число массива");
            int a = scanner.nextInt();
            ar[i] = a;

            int square = ar[i] * ar[i];
            sum+=square;


        }
        return sum;

        }


}
