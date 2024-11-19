package fr.apside.exerciceJava.exercice9.observer;

/**
 * Classe concrète représentant le cuisinier qui s'occupe des Burgers
 */
public class BurgerCook implements OrderObserver{
	private String name;

	public BurgerCook(String name) {
		this.name = name;
	}

	@Override
	public void update(String order) {
		if (order.contains("Burger")) {
			System.out.println("- " + name + " prépare la commande : " + order);
		}
	}
}
