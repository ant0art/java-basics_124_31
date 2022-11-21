package itmo.java.basics.lesson3;

import java.awt.*;

public class JavaProgram {
    public static void main(String[] args) {
        /*FIRST TASK */
        System.out.println("====== FIRST TASK ======");
        System.out.println("#1 Вывод через экземпляр класса. Метод возвращает строку");
        Study first = new Study("Изучение Java - это просто!");
        System.out.println(first.printCourse());

        /*Alternative*/
        System.out.println("#2 Вывод через экземпляр класса");
        System.out.println(new Study("Изучение Java - это просто!").printCourse());
        /*Alternative2*/
        System.out.println("#3 Метод сразу выводит ответ в консоль");
        first.printCourse2();

        /*SECOND TASK*/
        System.out.println("");
        System.out.println("====== SECOND TASK ======");
        Simple firstSimple = new Simple();
        Simple secondSimple = new Simple(Color.BLUE, 20.5);

        firstSimple.printSimple();
        secondSimple.printSimple();

        /*THIRD TASK*/
        System.out.println("");
        System.out.println("====== THIRD TASK ======");
        House firstHouse = new House();
        House secondHouse = new House();
        firstHouse.setHouseAttributes(3, 1703, "Петропавловская крепость");
        secondHouse.setHouseAttributes(87, 2018, "Лахта");
        firstHouse.getHouseAttributes();
        secondHouse.getHouseAttributes();
        System.out.println(firstHouse.getHouseAge());
        System.out.println(secondHouse.getHouseAge());

        /*FOURTH TASK*/
        System.out.println("");
        System.out.println("====== FOURTH TASK ======");

//        pine, aspen, oak
        Tree pine = new Tree();
        Tree aspen = new Tree(10, "Осина");
        Tree oak = new Tree(15, true, "Дуб");

        System.out.println(pine);
        System.out.println(aspen);
        System.out.println(oak);
    }
}
