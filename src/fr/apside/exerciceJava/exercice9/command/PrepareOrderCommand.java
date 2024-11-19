package fr.apside.exerciceJava.exercice9.command;

import fr.apside.exerciceJava.exercice9.factory.OrderInterface;

import java.util.List;

/**
 * Cette interface définira une méthode execute que toutes les commandes devront implémenter.
 */
public class PrepareOrderCommand  implements CommandInterface{

	private List<OrderInterface> orders;
	private Kitchen kitchen;

	public PrepareOrderCommand(Kitchen kitchen, List<OrderInterface> orders) {
		this.kitchen = kitchen;
		this.orders = orders;
	}

	@Override
	public void execute() {
		for (OrderInterface order : orders) {
			kitchen.prepareOrder(order);
		}
	}
}
