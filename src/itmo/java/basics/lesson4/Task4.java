package itmo.java.basics.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите третье число: ");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Результат: " + ((a < b) && (b < c)));
    }
}
