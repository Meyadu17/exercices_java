package fr.apside.exerciceJava.e6Exception;

import java.util.HashMap;
import java.util.Map;

/**
 * Stocke les vols avec le nombre de sièges disponibles (méthode addFlight) et
 * gère les réservations (méthode bookFlight)
 */
public class FlightManager {
	private Map<String, Integer> flightsList;

	public FlightManager() {
		flightsList = new HashMap<>();
	}

	/**
	 * Méthode qui permet de stocker la liste de vols avec le nombre de sièges disponibles pour chaque vol
	 * @param flightNumber
	 * @param seats
	 */
	public void addFlight(String flightNumber, int seats) {
		System.out.println("Ajout du vol " + flightNumber + " avec " + seats + " places.");
		this.flightsList.put(flightNumber, seats);
	}

	/**
	 * Méthode qui permet de gérer les réservations
	 * @param flightNumber
	 * @param seats
	 * @throws InsufficientSeatsException
	 * @throws FlightNotFoundException
	 */
	public void bookFlight(String flightNumber, int seats) throws InsufficientSeatsException, FlightNotFoundException {
		// Je vérifie que le vol éxiste
		if (!this.flightsList.containsKey(flightNumber)) {
			throw new FlightNotFoundException("Le vol " + flightNumber + " n'existe pas.");
		}
		// Je vérifie que le nombre de siège demander est encore disponibles
		if (this.flightsList.get(flightNumber) < seats) {
			throw new InsufficientSeatsException("Le nombre de sièges restant est inssufisant pour le vol " + flightNumber + ".");
		}
		// réduire le nomvre de sièges disponibles après la réservation
		flightsList.put(flightNumber, this.flightsList.get(flightNumber) - seats);
		System.out.println("La reservation pour " + seats + " place(s) pour le vol " + flightNumber +" à bien été effectué.");
		System.out.println("Il reste " + this.flightsList.get(flightNumber) + " place(s).");
	}

	@Override
	public String toString() {
		return "Liste des vols : " + flightsList;
	}
}
