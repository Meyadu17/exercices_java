package fr.apside.exerciceJava.e6Exception;

/**
 * InsufficientSeatsException : Si le nombre de sièges demandés dépasse les sièges disponibles.
 */
public class InsufficientSeatsException extends Exception{
	// Constructeur pour personnaliser le message d'erreur via un parametre String
	public InsufficientSeatsException(String message) {
		super(message);
	}
}
