package fr.apside.exerciceJava.exercice9;

import fr.apside.exerciceJava.exercice9.command.Kitchen;
import fr.apside.exerciceJava.exercice9.command.PrepareOrderCommand;
import fr.apside.exerciceJava.exercice9.decorator.CheeseDecorator;
import fr.apside.exerciceJava.exercice9.decorator.FriesDecorator;
import fr.apside.exerciceJava.exercice9.factory.CommandeInconnuException;
import fr.apside.exerciceJava.exercice9.factory.OrderFactory;
import fr.apside.exerciceJava.exercice9.factory.OrderInterface;
import fr.apside.exerciceJava.exercice9.factory.TypeEnum;
import fr.apside.exerciceJava.exercice9.observer.BurgerCook;
import fr.apside.exerciceJava.exercice9.observer.DrinkCook;
import fr.apside.exerciceJava.exercice9.observer.OrderNotifier;
import fr.apside.exerciceJava.exercice9.observer.PizzaCook;
import fr.apside.exerciceJava.exercice9.singleton.Cashier;

import java.util.Arrays;
import java.util.List;

/**
 * Exercice - Design Pattern
 * Temps passé : Total : 3:00
 * Première utilisation du pattern Decorateur - à revoir pour être sûr de bien le maitriser
 * Première utilisation du pattern Observer   - à revoir pour être sûr de bien le maitriser
 * Première utilisation du pattern Command    - à revoir pour être sûr de bien le maitriser
 */
public class Exercice9 {
	public static void main(String[] args) {

		/**
		 * Tu dois concevoir un système pour un restaurant rapide où un client peut passer des commandes, les cuisiniers préparent les plats, et le système de caisse gère les paiements.
		 * Le système doit utiliser plusieurs design patterns pour être modulable et extensible.
		 */
		try {
			// **1. Créer les commandes via l'OrderFactory (Factory : Crée des commandes de repas)**
			System.out.println("\nCréer les commandes (Factory) :");
			OrderFactory orderFactory = new OrderFactory();
			OrderInterface pizzaOrder = orderFactory.createOrder(TypeEnum.PIZZA);
			OrderInterface burgerOrder = orderFactory.createOrder(TypeEnum.BURGER);
			OrderInterface drinkOrder = orderFactory.createOrder(TypeEnum.DRINK);

			// **2. Ajouter des options via les décorateurs (Decorator : Ajoute des options aux commandes)**
			System.out.println("\nAjouter des options (Decorator) :");
			pizzaOrder = new CheeseDecorator(pizzaOrder);
			burgerOrder = new FriesDecorator(burgerOrder);

			// **3. Notifier les cuisiniers (Observer : Notifie les cuisiniers quand une nouvelle commande est passée)**
			System.out.println("\nNotifier les cuiciniers (Observer) :");
			OrderNotifier orderNotifier = new OrderNotifier();
			PizzaCook pizzaCook = new PizzaCook("Fred");
			BurgerCook burgerCook = new BurgerCook("Romain");
			DrinkCook drinkCook = new DrinkCook("Cédric");

			orderNotifier.attach(pizzaCook);
			orderNotifier.attach(burgerCook);
			orderNotifier.attach(drinkCook);

			orderNotifier.notifyObservers(pizzaOrder.getOrder());
			orderNotifier.notifyObservers(burgerOrder.getOrder());
			orderNotifier.notifyObservers(drinkOrder.getOrder());

			// **4. Gérer les préparations dans la cuisine via le PrepareOrderCommand (Command : Encapsule les actions des cuisiniers lors de la préparation des repas)**
			System.out.println("\nGérer les préparations (Command) :");
			Kitchen kitchen = new Kitchen();
			List<OrderInterface> orders = Arrays.asList(pizzaOrder, burgerOrder, drinkOrder);
			PrepareOrderCommand prepareOrders = new PrepareOrderCommand(kitchen, orders);

			kitchen.takeOrder(prepareOrders);

			// **5. Payer les commandes (Singleton : Gère la caisse avec une seule instance)**
			System.out.println("\nPayer les commandes (Singleton) :");
			Cashier cashier = Cashier.getInstance();
			cashier.processPayment(pizzaOrder.getPrice());
			cashier.processPayment(burgerOrder.getPrice());
			cashier.processPayment(drinkOrder.getPrice());

		} catch (CommandeInconnuException e) {
			System.err.println("Erreur : " + e.getMessage());
		}
	}
}