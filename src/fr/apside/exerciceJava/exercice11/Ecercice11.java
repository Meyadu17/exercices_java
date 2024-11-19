package fr.apside.exerciceJava.exercice11;

import static fr.apside.exerciceJava.exercice11.NombreRomain.convertToRoman;

/**
 *  * Exercice 11 - Les chiffres romains
 *  * Temps passé : 16:00
 *  * Problèmes rencontrés :
 *  */
public class Ecercice11 {
	public static void main(String[] args) {
		/**
		 * Convertir n'importe quel nombre entier compris entre 1 et 3000 inclus en écriture romaine
		 * sachant que Les chiffres romains modernes sont écrits en exprimant chaque chiffre séparément
		 * en commençant par le chiffre le plus à gauche et en sautant tout chiffre ayant une valeur de zéro.
		 * Dans la pratique, avec l'exemple de 1990.
		 * En chiffres romains 1990 s'écrit MCMXC : 1000=M 900=CM 90=XC 2008 s'écrit MMVIII : 2000=MM 8=VIII.
		 */
		try {
			int[] exemples = {6, 12, 1991, 80, 13};

			for (int nombre : exemples) {
				System.out.printf("Le nombre %d en chiffres romains est %s%n", nombre, convertToRoman(nombre));
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}


	}
}