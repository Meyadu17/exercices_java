package fr.apside.exerciceJava.e10RecordClassScellees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Zoo {
	private List<Animal> animalList;

	public Zoo() {
		this.animalList = new ArrayList<>();
	}

	// Ajouter un animal à la liste.
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}

	// Lister tous les animaux
	public List<Animal> getAnimalList() {
		return new ArrayList<>(animalList);
	}

	// Rechercher un animal par son nom.
	public Optional<Animal> findAnimalByName(String name) {
		return animalList.stream()
				.filter(animal -> animal.getName()
						.equals(name))
				.findFirst();
	}
}
