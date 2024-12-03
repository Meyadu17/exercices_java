package fr.apside.exerciceJava.e8BoiteGenerique;

import java.util.List;

/**
 * Créer une classe Box générique qui peut contenir n'importe quel type d'objet, ici un type T.
 * C'est une classe utilitaire
 * @param <T>
 */
public class Box<T extends Comparable<T>> {
	private T content;
	private List<T> contentsList;

	public Box(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	// Une classe qui implémente Comparable doit redéfinir la méthode compareTo(Object o).
	// Cette méthode prend en paramètre un autre objet de la même classe et renvoie un entier :
	//
	// - Retour négatif : Si l'objet courant est "inférieur" à l'objet en paramètre.
	// - Retour nul : Si les deux objets sont égaux.
	// - Retour positif : Si l'objet courant est "supérieur" à l'objet en paramètre.
	//
	// Le sens de "inférieur", "égal" et "supérieur" dépend de la logique de comparaison que vous définissez dans votre classe.
	// Par exemple, pour comparer des nombres, "inférieur" signifie "plus petit".
	// Pour comparer des chaînes de caractères, "inférieur" signifie "antérieur dans l'ordre lexicographique".
	public int compareTo(Box<T> otherBox) {
		return this.content.compareTo(otherBox.getContent());
	}

	public List<T> getContentsList() {
		return contentsList;
	}

	public void setContentsList(List<T> contentsList) {
		this.contentsList = contentsList;
	}

}
