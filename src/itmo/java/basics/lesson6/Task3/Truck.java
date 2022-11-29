package itmo.java.basics.lesson6.Task3;

public class Truck extends Car {
	public int wc;
	public int mw;

	/**
	 * Constructor of class Truck
	 *
	 * @param w  weight
	 * @param m  model
	 * @param c  color
	 * @param s  speed
	 * @param wc wheelsCount
	 * @param mw maxWeight
	 */
	public Truck(int w, String m, char c, float s, int wc, int mw) {
		super(w, m, c, s);
		this.wc = wc;
		this.mw = mw;
	}

	@Override
	public void outPut() {
		super.outPut();
	}

	/**
	 * Set new wheels count of the Truck
	 *
	 * @param wc wheels count
	 */
	public void newWheels(int wc) {
		this.wc = wc;
		System.out.printf("Количество колес у грузовика: %d", wc);
	}
}
