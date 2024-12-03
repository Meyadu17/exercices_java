package fr.apside.exerciceJava.exercice11bis;

public class NombreRomainBis {
	/**
	 * Convertir n'importe quel nombre entier compris entre 1 et 3000 inclus en écriture romaine
	 * sachant que Les chiffres romains modernes sont écrits en exprimant chaque chiffre séparément
	 * en commençant par le chiffre le plus à gauche et en sautant tout chiffre ayant une valeur de zéro.
	 * Dans la pratique, avec l'exemple de 1990.
	 * En chiffres romains 1990 s'écrit M CM XC : 1000=M 900=CM 90=XC 2008 s'écrit MM VIII : 2000=MM 8=VIII.
	 */

	private static final int[] CHIFFRES_ARABE = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	private static final String[] CHIFFRES_ROMAIN = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	public static String convertToRoman(int number) {
		// Cas ou le nombre saisis n'est pas compris entre 1 et 3000 :
		if (number < 1 || number > 3000) {
			throw new IllegalArgumentException ("Le nombre doit être compris entre 1 et 3000");
		}

		// Utilisation d'un StringBuilder pour créer le nombre au fur et à mesure.
		StringBuilder chiffreRomain = new StringBuilder();

		// On parcourt la liste des chiffres arabes
		for (int i = 0; i < CHIFFRES_ROMAIN.length; i++) {
			// Tant que le nombre saisi est >= CHIFFRES_ARABE :
			while (number >= CHIFFRES_ARABE[i]) {
				// On ajoute la valeur du chiffre Romain dans le StringBuilder
				chiffreRomain.append(CHIFFRES_ROMAIN[i]);
				// On déduit la valeur du chiffre Arabe
				number -= CHIFFRES_ARABE[i];
			}

		}
		 return chiffreRomain.toString();
	}

}
