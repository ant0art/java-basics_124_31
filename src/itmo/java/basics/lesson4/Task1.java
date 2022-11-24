package itmo.java.basics.lesson4;

public class Task1 {
    public static void main(String[] args) {
        getNumbers();
    }

    /**
     * Shows every odd number from 1 to 99
     */
    public static void getNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }
}
