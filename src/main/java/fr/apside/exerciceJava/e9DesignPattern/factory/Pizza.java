package fr.apside.exerciceJava.e9DesignPattern.factory;

public class Pizza implements OrderInterface{

	public Pizza() {}

	private double price = 12.00;
	@Override
	public String getOrder() {
		return TypeEnum.PIZZA.getCode();
	}

	@Override
	public double getPrice() {
		return price;
	}
}
