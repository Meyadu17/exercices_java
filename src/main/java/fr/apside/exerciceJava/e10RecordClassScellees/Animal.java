package fr.apside.exerciceJava.e10RecordClassScellees;

public sealed class Animal permits Mammal, Bird, Reptile {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + " - nom : " + name + ", age : " + age;
	}
}
