package fr.apside.exerciceJava.exercice10;

import java.util.Optional;

/**
 * Exercice - Records et classes scellées
 * Temps passé : 0:45
 * Problèmes rencontrés :
 * Exercice intérésant car notions de java 14 ou plus pas vu en cours (Java 8 vu en cours)
 */
public class Exercice10 {
	public static void main(String[] args) {
		/**
		 * L'objectif est de pratiquer les records et les sealed classes en modélisant un système de gestion d'un zoo.
		 * Chaque animal aura des propriétés uniques, et nous utiliserons des sealed classes pour restreindre les types d'animaux possibles.
		 * - Utiliser des records pour représenter les animaux et leurs caractéristiques immuables.
		 * - Créer des sealed classes pour définir une hiérarchie fermée entre différents types d'animaux.
		 */
		// Créer une instance de Zoo
		Zoo zootycoon = new Zoo();

		// Ajouter au zoo un lion, un aigle et un cobra.
		zootycoon.addAnimal(new Mammal("Lion", 10, true));
		zootycoon.addAnimal(new Bird("Eagle", 3, 2.0));
		zootycoon.addAnimal(new Reptile("Cobra", 2, true));

		// Lister les animaux présents dans le zoo.
		System.out.println("Animaux présents dans le zoo :");
		zootycoon.getAnimalList().forEach(System.out::println);

		// Rechercher l'aigle dans le zoo.
		String animalATrouver = "Eagle";
		Optional<Animal> result = zootycoon.findAnimalByName(animalATrouver);
		System.out.println("\nRecherche de l'animal '" + animalATrouver + "' dans le zoo :");
		result.ifPresentOrElse(
				System.out::println,
				() -> System.out.println("Animal '" + animalATrouver + "' non trouvé.")
		);
	}
}