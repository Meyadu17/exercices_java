package fr.apside.exerciceJava.exercice9.decorator;

import fr.apside.exerciceJava.exercice9.factory.OrderInterface;

/**
 * Classe concrète
 */
public class FriesDecorator extends OrderDecorator{
	private double supplement = 2.0;
	public FriesDecorator(OrderInterface order) {
		super(order);
	}

	@Override
	public String getOrder() {
		return order.getOrder() + " avec des frites";
	}

	@Override
	public double getPrice() {
		return order.getPrice() + supplement;
	}
}
