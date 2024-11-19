package fr.apside.exerciceJava.exercice9.command;

/**
 * Le pattern Command permet d'encapsuler une demande (ou "commande") en tant qu'objet, permettant ainsi de paramétrer les clients avec des demandes
 * différentes, de mettre en file d'attente des commandes, et de supporter des opérations annulables.
 */
public interface CommandInterface {
	public void execute();
}
