package itmo.java.basics.lesson4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 7, 2};
        checkSort(array);
        Arrays.sort(array);
        checkSort(array);
    }

    /**
     * Returns true if array is sorted
     *
     * @param array array to check
     */
    public static void checkSort(int[] array) {
        boolean isOk = true;
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                if (!checkNext(array[i - 1], array[i])) {
                    isOk = false;
                    break;
                }
            }
        }
        System.out.println(isOk ? "OK" : "Please, try again");
    }

    /**
     * Return true if first arg less than second
     *
     * @param a first arg
     * @param b second arg
     * @return true if a less than b
     */
    public static boolean checkNext(int a, int b) {
        return a < b;
    }
}
