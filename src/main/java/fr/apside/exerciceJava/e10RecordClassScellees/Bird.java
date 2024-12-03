package fr.apside.exerciceJava.e10RecordClassScellees;

public final class Bird extends Animal {
	private final double wingspan;

	public Bird(String name, int age, double wingspan) {
		super(name, age);
		this.wingspan = wingspan;
	}

	public double getWingspan() {
		return wingspan;
	}

	@Override
	public String toString() {
		return super.toString() + ", envergure : " + wingspan;
	}
}
