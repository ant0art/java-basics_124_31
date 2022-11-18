package itmo.java.basics.lesson1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int b;

        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("Четное");
        } else System.out.println("Нечетное");
    }
}
