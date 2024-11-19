package fr.apside.exerciceJava.exercice9.factory;

public class Drink implements OrderInterface{

	public Drink() {}
	private double price = 3.50;

	@Override
	public String getOrder() {
		return TypeEnum.DRINK.getCode();
	}

	@Override
	public double getPrice() {
		return price;
	}
}
