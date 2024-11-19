package fr.apside.exerciceJava.exercice8;

import java.util.Arrays;

/**
 * Exercice 7 - Boîte à objets générique
 * Temps passé : 1:30
 * Problèmes rencontrés :
 * passer du temps sur Comparable, à essayer de comprendre son fonctionnement
 * Notions pas bien assimilé, à revoir
 */
public class Exercice8 {
	public static void main(String[] args) {
		Box<Integer> integerBox1 = new Box<>(123);
		Box<Integer> integerBox2 = new Box<>(250);
		Box<String> stringBox1 = new Box<>("une box de type String");
		Box<String> stringBox2 = new Box<>("une box autre de type String");
		NumberBox<Double> doubleBox1 = new NumberBox<>(3.14);
		NumberBox<Double> doubleBox2 = new NumberBox<>(6.66);

		BoxUtil.afficherContenuBox(integerBox1);
		BoxUtil.afficherContenuBox(integerBox2);
		BoxUtil.afficherContenuBox(stringBox1);
		BoxUtil.afficherContenuBox(stringBox2);
		BoxUtil.afficherContenuBox(doubleBox1);
		BoxUtil.afficherContenuBox(doubleBox2);

		System.out.println("");

		int comparisonResultInteger = integerBox1.compareTo(integerBox2);
		System.out.println("Comparaison de deux Integer : " + comparisonResultInteger);
		int comparisonResultString = stringBox1.compareTo(stringBox2);
		System.out.println("Comparaison de deux String : " + comparisonResultString);
		int comparisonResultDouble = doubleBox1.compareTo(doubleBox2);
		System.out.println("Comparaison de deux String : " + comparisonResultDouble);

		System.out.println("");

		integerBox1.setContentsList(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("Contenu de la liste dans la boîte : " + integerBox1.getContentsList());
	}
}