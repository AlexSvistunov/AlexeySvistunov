package javatraining;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();
        int[][] array = new int[columns][rows];
        int[][] tArray = new int[rows][columns];

        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < columns; j ++) {
                tArray[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = tArray[j][i];
            }

        }
        System.out.println("Ваша транспонированная матрица: ");
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}