package fr.apside.exerciceJava.e3ArraysStream;

/**
 * Exercice 3 - Arrays et Streams
 * Temps passé : 60 minutes
 * Problèmes rencontré :
 */
public class Exercice3 {
	public static void main(String[] args) {

		/**
		 * Vous êtes un ornithologue passionné qui garde une trace du nombre d'oiseaux qui ont visité votre jardin au cours des
		 * sept derniers jours.
		 * Vous avez six tâches à réaliser, toutes traitant du nombre d'oiseaux qui sont venus dans votre jardin.
		 */

		// 1. Vérifiez quels étaient les comptes la semaine dernière
		System.out.println("1. Vérifiez quels étaient les comptes la semaine dernière :");
		BirdWatcher.getLastWeek();

		// 2. Vérifiez combien d'oiseaux sont venus aujourd'hui
		System.out.println("2. Vérifiez combien d'oiseaux sont venus aujourd'hui :");
			int[] birdsPerDay = {2,5,0,7,4,1};
			BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
			birdCount.getToday();

		// 3. Incrémenter le décompte d'aujourd'hui
		System.out.println("3. Incrémenter le décompte d'aujourd'hui");
			birdCount.incrementTodaysCount();
			birdCount.getToday();

		// 4. Vérifiez s'il y a eu une journée sans visite d'oiseaux
		System.out.println("4. Vérifiez s'il y a eu une journée sans visite d'oiseaux");
			birdCount.hasDayWithoutBirds();

		// 5. Calculer le nombre d'oiseaux visiteurs pour les n premiers jours de la semaine
		System.out.println("5. Calculer le nombre d'oiseaux visiteurs pour les n premiers jours de la semaine");
			birdCount.getCountForFirstDays(4);

		// 6. Calculer le nombre de jours chargés
		System.out.println("6. Calculer le nombre de jours chargés");
			birdCount.getBusyDays();
	}
}