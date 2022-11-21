package itmo.java.basics.lesson3;

public class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
    public void printCourse2() {
        System.out.println(this.course);
    }
}
