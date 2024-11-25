package fr.apside.exerciceJava.exercice12Bis;

import fr.apside.exerciceJava.exercice12Bis.NombrePremier;

/**
 * Exercice
 * Temps passé : (début : 10:00)
 * Problèmes rencontrés :
 */
public class Exercice12Bis {
	public static void main(String[] args) {
		/**
		 * Compter les nombres premiers positifs inférieurs à n
		 * Contrainte de temps d'exécution inférieur à 10 secondes pour n=1 000 000.
		 */
		// Déclaration et initialisation de n avec la valeur 1000000
		int n = 3;

		// Appel de la méthode countPrimes de la classe PrimeNumber pour compter les nombres premiers
		int primeCount = NombrePremier.countPrimes(n);

		// Impression du résultat
		System.out.println("Nombre de nombres premiers inférieurs à " + n + " : " + primeCount);
	}
}