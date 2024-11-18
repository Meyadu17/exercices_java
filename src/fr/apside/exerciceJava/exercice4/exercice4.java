package fr.apside.exerciceJava.exercice4;

/**
 * Exercice 4 - Héritage et Interface
 * Temps passé : -
 * Problèmes rencontré : galère avec l'utilisation de default
 */
public class exercice4 {
	public static void main(String[] args) {
		/**
		 * Dans cet exercice, vous jouez à un jeu de rôle nommé "Wizards and Warriors", qui vous permet d'incarner un sorcier ou un guerrier.
		 * Il existe différentes règles pour les guerriers et les sorciers afin de déterminer le nombre de points de dégâts qu'ils infligent.
		 * Pour un Warrior, voici les règles :
		 *     - Infligez 6 points de dégâts si le combattant attaqué n'est pas vulnérable
		 *     - Infligez 10 points de dégâts si le combattant attaqué est vulnérable
		 * Pour un Wizard, voici les règles :
		 *     - Infligez 12 points de dégâts si le Wizard a préparé un sort à l'avance
		 *     - Infligez 3 points de dégâts si le Wizard n'a pas préparé de sort à l'avance
		 * En général, les combattants ne sont jamais vulnérables. Cependant, les sorciers sont vulnérables s'ils n'ont pas préparé de sort.
		 * Vous avez six tâches qui fonctionnent avec les guerriers et les sorciers (et bonus une septième avec les voleurs).
		 */

		System.out.println("1. Décrire un combattant");
		Fighter warrior = new Warrior();
		warrior.toString();

		System.out.println("2. Rendre les combattants non vulnérables par défaut");
		warrior.isVulnerable();

		System.out.println("3. Autoriser les Sorciers à préparer un sort");
		Wizard wizard = new Wizard();
		wizard.prepareSpell();

		System.out.println("4. Rendre les Sorciers vulnérables lorsqu'ils n'ont pas préparé de sort");
		Fighter wizard1 = new Wizard();
		wizard1.isVulnerable();

		System.out.println("5. Calculer les points de dégâts d'un Sorcier");
		wizard.damagePoints(warrior);

		System.out.println("6. Calculer les points de dégâts pour un Guerrier");
		warrior.damagePoints(wizard1);

		System.out.println("7. Ajouter un Voleur qui ne provoque aucun point de dégâts et peut voler");
		Thief thief = new Thief();
		thief.toString();
		thief.damagePoints(warrior);
		thief.damagePoints(wizard1);
		thief.isVulnerable();
		thief.isTheft();
	}
}