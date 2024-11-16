package fr.apside.exerciceJava.exercice2;

public class ElonsToyCar {


	private int distanceParcouru;
	private int pourcentageBatterie;

	// Initialisation des variables dans le constructeur
	public ElonsToyCar() {
		this.distanceParcouru = 0;
		this.pourcentageBatterie = 100;
	}

	// 1. Méthode statique pour acheter une nouvelle voiture télécommandée
	public static ElonsToyCar buy() {
		return new ElonsToyCar();
	}

	// 2. Méthode pour afficher la distance parcourue
	public String distanceDisplay() {
		return this.distanceParcouru + " mètres parcourus.";
	}

	// 3. Méthode pour afficher le pourcentage de charge restante de la batterie
	public String batteryDisplay() {
		if (pourcentageBatterie == 0) {
			return "Batterie vide.";
		}
		return "Baterrie à " + pourcentageBatterie + "%.";
	}

	// 4. Mettre à jour le nombre de mètres parcourus en roulant
	// 5. Mettre à jour le pourcentage de batterie lors de la conduite
	public void drive() {
		if (pourcentageBatterie > 0) {
			distanceParcouru += 20;
			pourcentageBatterie -= 1;
		}

	}
}
