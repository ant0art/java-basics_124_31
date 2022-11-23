package itmo.java.basics.lesson4;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2, 3, 3, 4};
        getFirstUniqVal(array);
    }

    /**
     * Shows first unique value in array
     *
     * @param array must be NotNull to show relevant answer
     */
    public static void getFirstUniqVal(int[] array) {
        if (array.length == 0) {
            System.out.println("Передан пустой массив");
        } else {
            int[] temp = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                for (int k : array) {
                    if (array[i] == k) temp[i]++;
                }
            }
            for (int i = 0; i < temp.length; i++) {
                if (i != temp.length - 1) {
                    if (temp[i] >= 2) {
                        continue;
                    } else {
                        System.out.println("Первое уникальное число в массиве: " + array[i]);
                        break;
                    }
                } else if (temp[i] < 2) {
                    System.out.println("Первое уникальное число в массиве: " + array[i]);
                    break;
                } else {
                    System.out.println("нет уникальных значений");
                }
            }
        }
    }
}
