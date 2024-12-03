package fr.apside.exerciceJava.e8BoiteGenerique;

/**
 * Dans une classe utilitaire, BoxUtil, créer une méthode générique qui prend une Box de n'importe quel type et affiche son contenu.
 */
public class BoxUtil {
	public static <T extends Comparable<T>> void afficherContenuBox(Box<T> box) {
		System.out.println("Contenu de la boîte : " + box.getContent());
	}
}