package fr.apside.exerciceJava.e9DesignPattern.singleton;

/**
 * Patthern Singleton
 * Crée une classe Cashier (Caissier) qui suit le pattern Singleton.
 * Ce gestionnaire sera responsable d'encaisser les paiements des clients via une méthode processPayment.
 */
public class Cashier {
	// Déclaration de l'instance unique
	private static Cashier instance;

	// Constructeur privé pour empêcher la création directe d'instances
	private Cashier() {

	}

	// Méthode publique statique pour obtenir l'instance unique
	public static Cashier getInstance() {
		if(instance == null) {
			instance = new Cashier();
		}
		return instance;
	}

	// Méthode pour traiter le paiement
	public void processPayment (double amount) {
		System.out.println("- Paiement de " + amount + " € effectué.");
	}

}
