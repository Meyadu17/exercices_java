package fr.apside.exerciceJava.e10RecordClassScellees;

public final class Mammal extends Animal {
	private final boolean isEndangered;

	public Mammal(String name, int age, boolean isEndangered) {
		super(name, age);
		this.isEndangered = isEndangered;
	}

	/**
	 * Savoir si le mamifère est en danger
	 * @return boolan
	 */
	public boolean isEnDanger() {
		return isEndangered;
	}

	@Override
	public String toString() {
		return super.toString() + ", en danger : " + isEndangered;
	}
}
