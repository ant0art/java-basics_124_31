package itmo.java.basics.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        int[] array = new int[setArraySize()];
        setArrayNumbers(array);
        System.out.println("Result: " + Arrays.toString(array));
    }

    /**
     * @return size of the array
     */
    public static int setArraySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Введите число: ");
        }
        int size = scanner.nextInt();
        return size;
    }

    /**
     * Fill the current array with entered numbers
     *
     * @param array array to fill with numbers
     */
    public static void setArrayNumbers(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers of array:");
        for (int i = 0; i < array.length; i++) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Введите число: ");
            }
            array[i] = scanner.nextInt();
        }
    }
}
