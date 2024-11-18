package fr.apside.exerciceJava.exercice6;

import fr.apside.exerciceJava.FlightNotFoundException;

/**
 * Exercice 6 - Les exceptions
 * Temps passé : 30 minutres
 * Problèmes rencontrés : R.A.S.
 */
public class Exercice6 {
	public static void main(String[] args) throws FlightNotFoundException, InsufficientSeatsException {
		/**
		 * Tu développes un gestionnaire de réservation de vol. Le système doit :
		 *  - Vérifier que le vol existe.
		 *  - Vérifier que le nombre de sièges demandés est disponible.
		 *  - Traiter les erreurs de manière appropriée en lançant et capturant des exceptions personnalisées.
		 */
		System.out.println("Gestion des vols");
		FlightManager flightManager = new FlightManager();
		// Ajours de vols dans la liste
		flightManager.addFlight("AB123", 100);
		flightManager.addFlight("XY789", 50);

		System.out.println();

		try {
			// Essayer de réserver des sièges sur un vol existant
			flightManager.bookFlight("AB123", 30);
			flightManager.bookFlight("XY789", 50);

			// Réserver plus de sièges que disponibles pour montrer exception
			flightManager.bookFlight("XY789", 1);  // Cela devrait lancer une InsufficientSeatsException

		} catch (FlightNotFoundException | InsufficientSeatsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Bloc finally - on a essayé de réserver plus de places que ceux disponibles.");
		}

		try {
			// Essayer de réserver des sièges sur un vol inconnu
			flightManager.bookFlight("ZZ999", 10);  // Cela devrait lancer une FlightNotFoundException

		} catch (FlightNotFoundException | InsufficientSeatsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Bloc finally - on a essayé de réserver un vol inconnu.");
		}


	}
}