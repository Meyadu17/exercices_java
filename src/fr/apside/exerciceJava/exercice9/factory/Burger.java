package fr.apside.exerciceJava.exercice9.factory;

public class Burger implements OrderInterface{

	public Burger() {}
	private double price = 10;

	@Override
	public String getOrder() {
		return TypeEnum.BURGER.getCode();
	}

	@Override
	public double getPrice() {
		return price;
	}
}
