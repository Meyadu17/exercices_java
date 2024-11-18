package fr.apside.exerciceJava.exercice5;

/**
 * Exercice 4 - Les collections
 * Temps passé : 2h10
 * Problèmes rencontré :
 * - galères sur loanBook(), j'ai passé beaucoup de temps sur Queu (1:30 - loanBook)
 * - difficultés sur showBooks(), oublis d'ajouter equals() et hashCode() adans les classes
 */
public class Exercice5 {
	public static void main(String[] args) {
		/**
		 * Tu dois concevoir un petit système qui permet de :
		 * - Ajouter des livres à la bibliothèque.
		 * - Suivre les utilisateurs inscrits.
		 * - Gérer les emprunts de livres en respectant certaines règles (un livre ne peut être emprunté qu’une fois à la fois).
		 * - Afficher les informations avec tri et suppression des doublons.
		 * Tu vas utiliser les différentes collections Java :
		 * - List : Gérer une liste de livres.
		 * - Set : Gérer des utilisateurs uniques.
		 * - Map : Suivre les emprunts entre utilisateurs et livres.
		 * - Queue : Gérer une liste d'attente si un livre est déjà emprunté.
		 */

		Library library = new Library();

		System.out.println("A - Livres");
		Book book1 = new Book("Le seigneur des anneaux - la communauté de l'anneau", "J.R.R. Tolkien");
		Book book2 = new Book("Le seigneur des anneaux - les deux tours", "J.R.R. Tolkien");
		Book book3 = new Book("Le seigneur des anneaux - les deux tours", "J.R.R. Tolkien");
		Book livreQuiExistePas = new Book("Le seigneur des anneaux - le retour du roi", "J.R.R. Tolkien");

		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);

		System.out.println("B - Utilisateurs");
		User user1 = new User("John Doe");
		User user2 = new User("Henri Pottier");

		library.addUser(user1);
		library.addUser(user2);

		System.out.println("C - Prêt du livre");
		library.loanBook(livreQuiExistePas, user1);
		library.loanBook(book1, user1);
		library.loanBook(book1, user2);
		library.loanBook(book1, user2);

		System.out.println("C - Retour du livre");
		library.returnBook(book2);
		library.returnBook(book1);
		library.returnBook(book1);

		System.out.println("D - Lister les livres");
		library.showBooks();

		System.out.println("E - Lister le emprunts");
		library.showLoans();
		library.loanBook(book3, user1);
		library.loanBook(book1,user2);
		library.showLoans();
	}
}