package fr.apside.exerciceJava.exercice2;

/**
 * Exercice 2 - les Classes
 * Temps passé : 50 minutes
 * Problèmes rencontré : je me suis parfois embrouillé entre les moments ou les méthodes etaient void ou retournais quelques-chose.
 */
public class Exercice2 {
	public static void main(String[] args) {
		/**
		 * Dans cet exercice, vous jouerez avec une voiture télécommandée, pour laquelle vous avez finalement économisé
		 * suffisamment d'argent pour l'acheter.
		 * Les voitures démarrent avec des batteries pleines (100%). Chaque fois que vous utilisez la voiture à l'aide de la
		 * télécommande, celle-ci parcourt 20 mètres et décharge 1 % de la batterie.
		 *
		 * La voiture télécommandée est dotée d'un écran LED sophistiqué qui affiche deux informations:
		 * - La distance totale qu'elle a parcourue, affichée sous la forme : « mètres parcourus ».
		 * - La charge restante de la batterie, affichée sous la forme : "Batterie à %".
		 * Si la batterie est à 0%, vous ne pouvez plus utiliser la voiture et l'écran de la batterie affichera "Batterie vide".
		 * Vous avez donc six tâches à réaliser, dont chacune fonctionnera avec des instances de voiture télécommandée.
		 */

		// 1. Acheter une nouvelle voiture télécommandée
		System.out.println("Question 1 : acheter une voiture");
		ElonsToyCar car = ElonsToyCar.buy();

		// 2. Afficher la distance parcourue
		car.distanceDisplay();
		System.out.println("Question 2 : Afficher la distance parcourue");
		System.out.println(car.distanceDisplay());

		// 3. Afficher le pourcentage de charge restante de la batterie
		System.out.println("Question 3 : Afficher le pourcentage de charge restante de la batterie");
		car.batteryDisplay();
		System.out.println(car.batteryDisplay());

		// 4. Mettre à jour le nombre de mètres parcourus en roulant
		// 5. Mettre à jour le pourcentage de batterie lors de la conduite
		System.out.println("Question 4 : Mettre à jour le nombre de mètres parcourus en roulant");
		car.drive();
		car.drive();
		car.distanceDisplay();
		System.out.println(car.distanceDisplay());

		System.out.println("Question 5 : Mettre à jour le pourcentage de batterie lors de la conduite");
		System.out.println(car.batteryDisplay());

		// 6. Empêcher de conduire lorsque la batterie est déchargée
		for (int i = 0; i < 98; i++) {
			car.drive();
		}
		System.out.println("Question 6 : Mettre à jour la méthode drive() de la classe ElonsToyCar pour");
		System.out.println(car.distanceDisplay());
		System.out.println(car.batteryDisplay());
		System.out.println("Vérification que la voiture ne peux plus avancer :");
		car.drive();
		System.out.println(car.distanceDisplay());
		System.out.println(car.batteryDisplay());

	}
}