package itmo.java.basics.lesson4;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(array));
        swapEdges(array);
        System.out.println("Array 2: " + Arrays.toString(array));
    }

    /**
     * Swaps element-places of array "first-last"
     *
     * @param array array to swap first and last element
     */
    public static void swapEdges(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }
}
