package itmo.java.basics.lesson7;

public class Plane {
	private Wing wing;

	public Plane(Wing wing) {
		this.wing = wing;
	}

	public Wing getWing() {
		return wing;
	}

	public static class Wing {
		private int weight;

		public Wing(int weight) {
			this.weight = weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public int getWeight() {
			return weight;
		}

		public void showWeight() {
			System.out.println("Вес крыла: " + getWeight());
		}
	}
}
