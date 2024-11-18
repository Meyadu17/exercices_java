package fr.apside.exerciceJava.exercice5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Library {
	// Il peut y avoir des lires en boublons donc List<>
	private List<Book> bookList = new ArrayList<>();
	// Un utilisateur est unique dans la bibliothèque donc Set<>
	private Set<User> userList = new HashSet<>();
	// UN livre est emprunté pas UN user donc Map<>
	private Map<Book, User> loanList = new HashMap<>();
	// Liste d'attente
	private Map<Book, Queue<User>> waitingLists = new HashMap<>();

	// ajouter un livre à la bibliothèque. Il peut y avoir plusieurs exemplaires d'un même livre
	public void addBook(Book book) {
		bookList.add(book);
		System.out.println("Liste des livres :");
		for (Book b : bookList) {
			System.out.println(b);
		}
	}

	// inscrire un utilisateur (un utilisateur est unique dans la bibliothèque)
	public void addUser( User user) {
		userList.add(user);
		System.out.println("Liste des utilisateurs : ");
		for (User u : userList) {
			System.out.println(u);
		}
	}

	// emprunter un livre, gérer la file d'attente (Queu) d'utilisteur pour chaque livre.
	public void loanBook(Book book, User user) {
		// Vérifier si le livre est dans la bibliothèque
		if (!bookList.contains(book)) {
			System.out.println("Livre inconnu: " + book.getTitle());
			return; // Sortir de la méthode si le livre n'est pas dans la bibliothèque
		}

		// Vérifier si le livre est déjà emprunté
		if (loanList.containsKey(book)) {
			Queue<User> queue = waitingLists.get(book);

			//Si la liste d'attente est vide, on l'initialise.
			if (queue == null) {
				queue = new LinkedList<>();
				waitingLists.put(book, queue);
			}

			// Ajouter l'utilisateur à la file d'attente s'il n'y est pas déjà
			if (!queue.contains(user)) {
				queue.add(user);
				System.out.println(user.getName() + " est ajouté à la file d'attente pour le livre " + book.getTitle());
			} else {
				System.out.println(user.getName() + " est déjà dans la file d'attente pour le livre " + book.getTitle());
			}
		} else {
			// Emprunter le livre si celui-ci n'est pas encore emprunté
			loanList.put(book, user);
			System.out.println(user.getName() + " a emprunté " + book.getTitle());
		}

	}

	public void returnBook(Book book) {
		//Vérifie que le livre est en cous d'umprunt
		if (loanList.containsKey(book)) {
			//je suprime le livre de la listre de prêt
			User currentUser = loanList.remove(book);
			//je gère la liste  d'attente
			Queue<User> queue = waitingLists.get(book);
			//Si la liste n'est pas vide
			if (!queue.isEmpty()) {
				//j'attribut le livre à l'utilisateur suivant
				User nextUser = queue.poll();
				//j'ajoute à la liste de prêt le nouvel utilisateur
				loanList.put(book, nextUser);
				System.out.println(nextUser.getName() + " a emprunté le livre " + book.getTitle() + " après le retour de " + currentUser.getName());
			} else {
				System.out.println(currentUser.getName() + " a retourné le lire " + book.getTitle());
			}
		} else {
			System.out.println("le livre n'est pas en cours d'emprunt");
		}
	}

	// lister les livres de manière unique (attention aux multiples exemplaires d'un même livre).
	public void showBooks() {
		Set<Book> uniqueBooks = new HashSet<>(bookList);
		System.out.println("Liste des livres uniques :");
		for (Book book : uniqueBooks) {
			System.out.println(book);
		}
	}

	public void showLoans() {
		System.out.println("Liste des emprunts :");
		if (loanList.isEmpty()) {
			System.out.println("Il n'y a actuellement aucun emprunt.");
			return;
		}
		for (Map.Entry<Book, User> entry : loanList.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}}
}
