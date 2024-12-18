package fr.apside.exerciceJava.e9DesignPattern.observer;

/**
 * Classe concrète représentant le cuisinier qui s'occupe des Pizzas
 */
public class PizzaCook implements OrderObserver{

	private String name;

	public PizzaCook(String name) {
		this.name = name;
	}

	@Override
	public void update(String order) {
		if (order.contains("Pizza")) {
			System.out.println("- " + name + " prépare la commande : " + order);
		}
	}
}
