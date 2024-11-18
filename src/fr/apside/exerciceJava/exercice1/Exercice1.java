package fr.apside.exerciceJava.exercice1;

/**
 * Exercice 1 - Classe
 * Temps passé : 30 minutes
 * Problèmes rencontré : RAS
 */
public class Exercice1 {
	public static void main(String[] args) {
		/**
		 * Dans cet exercice, vous allez écrire du code pour vous aider à cuisiner de délicieuses lasagnes à partir de votre livre de
		 * cuisine préféré.Vous avez quatre tâches, toutes liées au temps passé à cuire les lasagnes.
		 */

		// 1.Définissez la méthode expectedMinutesInOven() qui ne prend aucun paramètre et renvoie combien de minutes les
		Lasagna lasagna = new Lasagna();
		lasagna.expectedMinutesInOven();

		// 2. Calculer le temps de four restant en minutes
		lasagna.remainingMinutesInOven(30);

		// 3.Calculer le temps de préparation en minutes
		lasagna.preparationTimeInMinutes(2);

		// 4. Calculer le temps de travail total en minutes
		lasagna.totalTimeInMinutes(3,20);
	}

}