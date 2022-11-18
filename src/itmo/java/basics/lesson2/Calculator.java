package itmo.java.basics.lesson2;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(sum(100, 100, 100.));
        System.out.println(sub(100, 50));
        System.out.println(div(100, 3));
        System.out.println(div(100L, 3));
        System.out.println(div(100., 3));
    }

    /**
     * Summarizes values initialized as int
     */
    public static long sum(int... values) {
        int sum = 0;
        for (int n : values) {
            sum += n;
        }
        return sum;
    }

    /**
     * Summarizes values initialized as long
     */
    public static long sum(long... values) {
        long sum = 0L;
        for (long n : values) {
            sum += n;
        }
        return sum;
    }

    /**
     * Summarizes values initialized as double
     */
    public static double sum(double... values) {
        double sum = 0.;
        for (double n : values) {
            sum += n;
        }
        return sum;
    }

    /**
     * Returns the result of subtracting
     *
     * @param a first value
     * @param b second value
     */
    public static int sub(int a, int b) {
        return a - b;
    }

    /**
     * Returns the result of subtracting
     *
     * @param a first value
     * @param b second value
     */
    public static long sub(long a, long b) {
        return a - b;
    }

    /**
     * Returns the result of subtracting
     *
     * @param a first value
     * @param b second value
     */
    public static double sub(double a, double b) {
        return a - b;
    }

    /**
     * Returns the result of division
     *
     * @param a first value (numerator)
     * @param b second value (denominator)
     */

    public static double div(int a, int b) {
        return (double) a / b;
    }

    /**
     * Returns the result of division
     *
     * @param a first value (numerator)
     * @param b second value (denominator)
     */

    public static double div(long a, long b) {
        return (double) a / b;
    }

    /**
     * Returns the result of division
     *
     * @param a first value (numerator)
     * @param b second value (denominator)
     */

    public static double div(double a, double b) {
        return a / b;
    }

    /**
     * Returns the result of multiply
     */
    public static long multiply(int... values) {
        long mult = 1;
        for (int n : values) {
            mult *= n;
        }
        return mult;
    }

    /**
     * Returns the result of multiply
     */
    public static long multiply(long... values) {
        long mult = 1;
        for (long n : values) {
            mult *= n;
        }
        return mult;
    }

    /**
     * Returns the result of multiply
     */
    public static double multiply(double... values) {
        long mult = 1;
        for (double n : values) {
            mult *= n;
        }
        return mult;
    }
}
