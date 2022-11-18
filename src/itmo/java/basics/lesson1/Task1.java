package itmo.java.basics.lesson1;

public class Task1 {
    public static void main(String[] args) {
        String s = "Я хорошо знаю Java.";
        String[] answer = s.split(" ");
        for (String string : answer) {
            System.out.println(string);
        }
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }
}
