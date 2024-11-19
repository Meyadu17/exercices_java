package fr.apside.exerciceJava.exercice9.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe concrète qui implémente OrderObservable et maintient une collection d'observateurs.
 */
public class OrderNotifier implements OrderObservable{
	private List<OrderObserver> observers = new ArrayList<OrderObserver>();

	@Override
	public void attach(OrderObserver observer) {
		observers.add(observer);
	}

	@Override
	public void detach(OrderObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(String order) {
		for(OrderObserver observer : observers){
			observer.update(order);
		}
	}
}
