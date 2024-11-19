package fr.apside.exerciceJava.exercice10;

public final class Reptile extends Animal {
	private final boolean isVenomous;

	public Reptile(String name, int age, boolean isVenomous) {
		super(name, age);
		this.isVenomous = isVenomous;
	}

	@Override
	public String toString() {
		return super.toString() + ", venimeux : " + isVenomous;
	}
}