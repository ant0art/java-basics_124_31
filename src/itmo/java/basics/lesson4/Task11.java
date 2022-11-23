package itmo.java.basics.lesson4;

import java.util.Arrays;
import java.util.Date;

public class Task11 {
    public static void main(String[] args) {
        int[] array = new int[]{234, 234, 5478, 6478, 3, 3245, 1, 234, 57, 456, 34, 34, 23, 234, 5, 6, 457, 35, 7, 31, 7, 89, 78};
        System.out.println("Array before sort: " + Arrays.toString(array));
        Date dateStart = new Date();
        array = sortArray(array);
        System.out.println("Array after sort: " + Arrays.toString(array));
        Task6.getSearchTime(dateStart, new Date());
    }

    public static int[] sortArray(int[] array) {

        if (array == null) {
            return null;
        }

        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;

        int[] left = new int[mid];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[mid + j];
        }
        left = sortArray(left);
        right = sortArray(right);

        return mergeSort(left, right);
    }

    public static int[] mergeSort(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];
        int leftPoint = 0;
        int rightPoint = 0;

        for (int i = 0; i < array.length; i++) {
            if (leftPoint == left.length) {
                array[i] = right[rightPoint];
                rightPoint++;
            } else if (rightPoint == right.length) {
                array[i] = left[leftPoint];
                leftPoint++;
            } else if (left[leftPoint] < right[rightPoint]) {
                array[i] = left[leftPoint];
                leftPoint++;
            } else {
                array[i] = right[rightPoint];
                rightPoint++;
            }
        }
        return array;
    }
}
