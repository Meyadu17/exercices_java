package fr.apside.exerciceJava;

/**
 * FlightNotFoundException : Si le vol demandé n'existe pas
 */
public class FlightNotFoundException extends Exception{
	// Constructeur pour personnaliser le message d'erreur via un parametre String
	public FlightNotFoundException(String message) {
		super(message);
	}
}
