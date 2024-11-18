package fr.apside.exerciceJava.exercice5;

import java.util.Objects;

public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "- " + name;
	}

	// Attention ! Penser à insérer les méthodes equals & hasCode.
	// Ces méthodes sont utilisées par les collections telles que HashSet pour déterminer l'égalité des objets.
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(name, user.name);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}
}
