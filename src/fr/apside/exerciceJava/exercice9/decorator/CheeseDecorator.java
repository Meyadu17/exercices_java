package fr.apside.exerciceJava.exercice9.decorator;

import fr.apside.exerciceJava.exercice9.factory.OrderInterface;

/**
 * Classe concrète
 */
public class CheeseDecorator extends OrderDecorator{
	private double supplement = 1.5;

	public CheeseDecorator(OrderInterface order) {
		super(order);
	}
	@Override
	public String getOrder() {
		return order.getOrder() + " avec le fromage";
	}
	@Override
	public double getPrice() {
		return order.getPrice() + supplement;
	}
}
