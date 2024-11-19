package fr.apside.exerciceJava.exercice9.factory;

/**
 * CommandeInconnuException : si la commande n'existe pas
 */
public class CommandeInconnuException extends Exception {
	public CommandeInconnuException(String message) {
		super(message);
	}
}
