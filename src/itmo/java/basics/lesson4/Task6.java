package itmo.java.basics.lesson4;

import java.util.Arrays;
import java.util.Date;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[]{3, -3, 7, 4, 5, 4, 3};
        Date dateStart = new Date();
        System.out.println("Через цикл while: " + findByWhile(array));
        getSearchTime(dateStart, new Date());

        dateStart = new Date();
        System.out.println("Через цикл for: " + findByFor(array));
        getSearchTime(dateStart, new Date());
    }

    /**
     * Search numbers 1 and 3 in array by cycle while and return boolean-result
     *
     * @param array int array
     */
    public static boolean findByWhile(int[] array) {
        int i = 0;
        boolean isOk = false;
        while (i <= array.length - 1) {
            if (array[i] == 3 || array[i] == 1) {
                isOk = true;
                break;
            }
            i++;
        }
        return isOk;
    }

    /**
     * Search numbers 1 and 3 in array by cycle for and return boolean-result
     *
     * @param array int array
     */
    public static boolean findByFor(int[] array) {
        boolean hasNumber = false;
        for (int j = 0; j <= array.length - 1; j++) {
            if (array[j] == 3 || array[j] == 1) {
                hasNumber = true;
                break;
            }
        }
        return hasNumber;
    }

    /**
     * Show time of method-work in ms
     *
     * @param dateStart Time when method starts
     * @param dateEnd   Time when method ends
     */
    public static void getSearchTime(Date dateStart, Date dateEnd) {
        System.out.println("Время выполнения = " + (dateEnd.getTime() - dateStart.getTime()) + "мс");
    }
}
