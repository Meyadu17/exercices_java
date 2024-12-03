package fr.apside.exerciceJava.e9DesignPattern.command;

import fr.apside.exerciceJava.e9DesignPattern.factory.OrderInterface;

/**
 * Cette classe contient la logique pour exécuter la préparation des commandes (cuisiniers).
 */
public class Kitchen {
	public void prepareOrder(OrderInterface order) {
		System.out.println("- Préparation de la commande : " + order.getOrder());
	}

	public void takeOrder(CommandInterface command) {
		command.execute();
	}

}
