package javatraining;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Fifteenth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        StringTokenizer string = new StringTokenizer(str, " ");
        List<String> list = new LinkedList<>();

        while (string.hasMoreTokens()) {
            String s = string.nextToken();
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        for (String word: list) {
            System.out.print(word + " ");
        }
    }
}

