package fr.apside.exerciceJava.exercice12;

public class PrimeNumber {
	 // Pseudo-code :
	 // Crible d'Ératosthène
	 //     entrée : N > 1 entier
	 //     sortie : la liste de tous les nombres premiers <= N
	 //     L = tableau de booléens de taille N, initialisés à Vrai
	 //     L[1] = Faux
	 //     Pour i de 2 à N
	 //         Si L[i]
	 //             Pour j de i*i à N par pas de i
	 //             on peut commencer à i*i car tous les multiples de i inférieurs à i*i ont déjà été rayés
	 //                 L[j] = Faux
	 //             Fin pour
	 //         Fin si
	 //     Fin pour
	 //     Retourner La liste des i de 2 à N tels que L[i] est vrai
	 //Fin fonction

	/**
	 * Compte les nombres premiers positifs inférieurs à n.
	 *
	 * @param numbers La borne supérieure (exclusif)
	 * @return Le nombre de nombres premiers inférieurs à n
	 */
	public static int countPrimes(int numbers) {
		// Si n est inférieur ou égal à 2, il n'y a pas de nombres premiers inférieurs à n
		if (numbers <= 2) return 0;

		// Création d'un tableau de booléens pour marquer les nombres premiers
		boolean[] primeList = new boolean[numbers];

		// Initialisation du tableau : on considère que tous les nombres sont premiers
		for (int i = 2; i < numbers; i++) {
			primeList[i] = true;
		}

		// Application du crible d'Ératosthène
		for (int i = 2; i * i < numbers; i++ ) {
			// Si i est toujours considéré comme premier
			if (primeList[i]) {
				// Marquer tous les multiples de i comme non premiers
				for (int j = i * i; j < numbers; j += i) {
					primeList[j] = false;
				}
			}
		}

		// Compter les nombres premiers dans le tableau
		int count = 0;
		for (int i = 2; i < numbers; i++) {
			if (primeList[i]) count++;
		}

		return count;
	}
}
