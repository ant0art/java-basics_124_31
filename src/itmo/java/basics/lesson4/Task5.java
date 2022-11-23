package itmo.java.basics.lesson4;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[]{3, -3, 7, 4, 5, 4, 3};
        StringBuilder stringBuilder = new StringBuilder("array = ").append(array[0]);
        for (int i = 1; i < array.length; i++) {
            stringBuilder.append(", ").append(array[i]);
        }
        System.out.println(stringBuilder.toString());
        if (array.length < 2)
            System.out.println("Добавьте в массив больше чисел");
        else
            System.out.println((array[0] == 3) && (array[array.length - 1] == 3));
    }
}
