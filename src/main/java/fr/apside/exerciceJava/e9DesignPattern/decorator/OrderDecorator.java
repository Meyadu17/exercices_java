package fr.apside.exerciceJava.e9DesignPattern.decorator;

import fr.apside.exerciceJava.e9DesignPattern.factory.OrderInterface;

/**
 * Cette classe doit implémenter OrderInterface.
 * Elle doit contenir une instance de OrderInterface pour permettre la composition.
 */
public abstract class OrderDecorator implements OrderInterface {
	protected OrderInterface order;

	public OrderDecorator(OrderInterface order) {
		this.order = order;
	}

	@Override
	public String getOrder() {
		return order.getOrder();
	}

	@Override
	public double getPrice() {
		return order.getPrice();
	}
}
