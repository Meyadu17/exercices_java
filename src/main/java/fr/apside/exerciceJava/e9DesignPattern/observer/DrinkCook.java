package fr.apside.exerciceJava.e9DesignPattern.observer;

/**
 * Classe concrète représentant le cuisinier qui s'occupe des Boissons
 */
public class DrinkCook implements OrderObserver{

	private String name;

	public DrinkCook(String name) {
		this.name = name;
	}

	@Override
	public void update(String order) {
		if (order.contains("Drink")) {
			System.out.println("- " + name + " prépare la commande : " + order);
		}
	}
}
