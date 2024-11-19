package fr.apside.exerciceJava.exercice11;

public class NombreRomain {
	private static final int[] VALEURS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private static final String[]SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	public static String convertToRoman(int number) {
		// Vérifier que le nombre saisi est compris entre 1 et 3000 inclus
		if(number < 1 || number > 3000) {
			throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 3000 inclus");
		}

		StringBuilder result = new StringBuilder();

		for(int i = 0; i < VALEURS.length; i++) {
			while(number >= VALEURS[i]) {
				result.append(SYMBOLS[i]);
				number -= VALEURS[i];
			}
			// Explication en exemple :
			// number = 1990
			// Première itération de la boucle for (i = 0)
			// VALEURS[i] = 1000
			// SYMBOLS[i] = "M"
			// number (1990) >= 1000 (condition de la boucle while est vraie)
			// Ajoute "M" à result
			// Soustrait 1000 de number -> number devient 990
			// La boucle while s'exécute de nouveau :
			// number (990) < 1000 (condition de la boucle while est fausse)
			// Sortie de la boucle while
			// Et ainsi de suite
		}

		return result.toString();
	}
}
