package fr.apside.exerciceJava.exercice12;

/**
 *  * Exercice
 *  * Temps passé :
 *  * Problèmes rencontrés :
 *  */
public class Exercice12 {
	public static void main(String[] args) {
		/**
		 * Compter les nombres premiers positifs inférieur à n
		 * Contrainte de temps d'exécution inférieur à 10 secondes pour n=1 000 000.
		 */

		// Déclaration et initialisation de n avec la valeur 1000000
		int n = 1000000;

		// Appel de la méthode countPrimes de la classe PrimeNumber pour compter les nombres premiers
		int primeCount = PrimeNumber.countPrimes(n);

		// Impression du résultat
		System.out.println("Nombre de nombres premiers inférieurs à " + n + " : " + primeCount);
	}
}