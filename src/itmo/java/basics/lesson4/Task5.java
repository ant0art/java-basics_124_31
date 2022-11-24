package itmo.java.basics.lesson4;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[]{3, -3, 7, 4, 5, 4, 3};
        checkArrayStartEnd(array, 3);
    }

    /**
     * Check if array starts and ends with equal number
     *
     * @param array array to check
     * @param n     number to check in array
     */
    public static void checkArrayStartEnd(int[] array, int n) {
        String arrayString = "array = " + array[0];
        for (int i = 1; i < array.length; i++) {
            arrayString += ", " + array[i];
        }
        System.out.println(arrayString);
        if (array.length < 2)
            System.out.println("Добавьте в массив больше чисел");
        else
            System.out.println((array[0] == n) && (array[array.length - 1] == n));
    }
}
