package javatraining;
import java.util.Scanner;
import java.util.Arrays;

public class Eighth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый отрезок: ");
        int first = scanner.nextInt();

        System.out.println("Введите второй отрезок: ");
        int second = scanner.nextInt();

        System.out.println("Введите третий отрезок: ");
        int third = scanner.nextInt();

        System.out.println(angle(first, second, third));

        }

    public static boolean test(int x, int y, int z) {
        return ((x + y) > z && (y + z) > x && (z + x) > y);

    }

    public static double angle(int a, int b, int c) {
        double[] array = new double[3];
        array[0] = Math.toDegrees(Math.cos(Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2) / (2 * a * c)));
        array[1] = Math.toDegrees(Math.cos(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2) / (2 * a * c)));
        array[0] = Math.toDegrees(Math.cos(Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2) / (2 * a * c)));
        return (180 - Arrays.stream(array).min().getAsDouble());
    }

}

