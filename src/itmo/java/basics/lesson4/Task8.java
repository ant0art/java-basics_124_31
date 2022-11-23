package itmo.java.basics.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Введите число: ");
        }
        size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Numbers of array:");
        for (int i = 0; i < array.length; i++) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Введите число: ");
            }
            array[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
        scanner.close();
    }
}
