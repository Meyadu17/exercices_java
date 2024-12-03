package fr.apside.exerciceJava.exercice11bis;

import static fr.apside.exerciceJava.exercice11bis.NombreRomainBis.convertToRoman;

/**
 * Exercice 11 - Les chiffres romains
 * Temps passé : 1:30
 * Problèmes rencontrés : R.A.S.
 */
public class Ecercice11bis {
	public static void main(String[] args) {
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