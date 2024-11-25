package fr.apside.exerciceJava.exercice12Bis;

public class NombrePremier {

	/**
	 * Vérifie si un nombre est un nombre premier.
	 *
	 * @param n Le nombre à tester.
	 * @return true si le nombre est premier, sinon false.
	 */
	private static boolean estUnNombrePremier(int n) {
		// Les nombres 0 et 1 ne sont pas des nombres premiers.
		if (n <= 1) {
			return false;
		}

		// Vérifie la divisibilité par tous les nombres de 2 à la racine carrée du nombre.
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				// Si 'n' est divisible par 'i', ce n'est pas un nombre premier.
				return false;
			}
		}
		// Si aucun diviseur n'a été trouvé, le nombre est premier.
		return true;
	}

	/**
	 * Compte les nombres premiers de 0 à n (exclus).
	 *
	 * @param n Limite supérieure (exclus) pour le comptage des nombres premiers.
	 * @return Le nombre de nombres premiers de 0 à n.
	 */
	public static int countPrimes(int n) {
		if (n <= 1) {
			throw new IllegalArgumentException("Le nombre doit être un entier positif");
		}

		// Initialisation du compteur de nombres premiers.
		int count = 0;

		// Parcours chaque nombre de 0 à n-1.
		for (int i = 0; i < n; i++) {

			// Vérifie si 'i' est un nombre premier.
			if (estUnNombrePremier(i)) {
				// Incrémente le compteur si 'i' est premier.
				count++;
			}
		}
		return count;
	}
}
