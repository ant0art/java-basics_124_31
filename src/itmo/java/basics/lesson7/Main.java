package itmo.java.basics.lesson7;

public class Main {
	public static void main(String[] args) {
		Plane first = new Plane(new Plane.Wing(500));
		first.getWing().showWeight();
		Plane sec = new Plane(new Plane.Wing(600));
		sec.getWing().showWeight();
		first.getWing().setWeight(200);
		first.getWing().showWeight();
	}
}
