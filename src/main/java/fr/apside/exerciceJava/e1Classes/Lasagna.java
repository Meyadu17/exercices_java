package fr.apside.exerciceJava.e1Classes;

public class Lasagna {

	private int tempsDeCuisson =40;

	public int expectedMinutesInOven() {
		System.out.println("Le temps de cuisson des lasagnes est de " + tempsDeCuisson + " minutes.");
		return tempsDeCuisson;
	}

	public int remainingMinutesInOven(int minutesRestantes) {
		this.tempsDeCuisson -= minutesRestantes;
		System.out.println("Il reste " + this.tempsDeCuisson + " minutes de cuisson pour les lasagnes.");
		return this.tempsDeCuisson;

	}

	public int preparationTimeInMinutes(int nombreDecouches) {
		int tempsPasse =  nombreDecouches * 2;
		System.out.println("Vous avez passé " + tempsPasse + " minutes de préparation des lasagnes.");
		return tempsPasse;
	}

	public int totalTimeInMinutes(int nombreDecouches, int tempsDeCuissonFait) {
		preparationTimeInMinutes(nombreDecouches);
		int tempsDeTravail = tempsDeCuissonFait + preparationTimeInMinutes(nombreDecouches);
		System.out.println("Le temps de travail total est de " + tempsDeTravail + " minutes.");
		return tempsDeTravail;

	}
}
