package itmo.java.basics.lesson3;

import java.awt.*;

/* Создайте простой класс,который будет иметь поля:цвет,название,вес.Создайте метод
		в классе через который можно будет вывести все эти данные.
		Добавьте два объекта,установите для них значения и выведите все при помощи ранее созданного метода.
		Также добавьте несколько конструкторов,которые будут устанавливать:
		●    только цвет машины;
		●    цвет и вес машины;
		●    и пустой конструктор.*/

public class Simple {
    private final String name = "Simple object without name";
    private Color color = Color.BLACK;
    private double weight = 0;

    public Simple() {
    }

    public Simple(Color color) {
        this.color = color;
    }

    public Simple(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Simple{" + "color=" + color + ", name='" + name + '\'' + ", weight=" + weight + '}';
    }

    public void printSimple() {
        System.out.printf("This \"%s\" has color - %s, name - %s, weight - %f\n", this.getClass()
                .getSimpleName(), this.getColor(), this.getName(), this.getWeight());
    }
}
