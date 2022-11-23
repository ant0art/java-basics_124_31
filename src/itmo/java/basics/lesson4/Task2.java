package itmo.java.basics.lesson4;

public class Task2 {
    public static void main(String[] args) {
        /* Вариант 1 */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) System.out.println("Делится на 3 и на 5: " + i);
                System.out.println("Делится на 3: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }

        }

        /* Вариант 2 */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i % 5 == 0) System.out.println("Делится на 5: " + i);
        }

    }
}
