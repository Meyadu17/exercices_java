package fr.apside.exerciceJava.exercice8;

/**
 * Ajouter des restrictions de types sur les génériques :
 * Pour illustrer cela, créons une autre classe NumberBox pour restreindre le type à Number:
 * @param <T>
 */
public class NumberBox<T extends Number & Comparable<T>> extends Box<T> {
	public NumberBox(T content) {
		super(content);
	}
}
