package itmo.java.basics.lesson3;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    /**
     * Make new tree with params:
     *
     * @param age     возраст
     * @param isAlive живое ли дерево
     * @param name    название дерева
     */
    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    /**
     * Make new tree with params:
     *
     * @param age  возраст
     * @param name название дерева
     */
    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }
}
