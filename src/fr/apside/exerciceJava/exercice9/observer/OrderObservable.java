package fr.apside.exerciceJava.exercice9.observer;

/**
 * Cette interface définira les méthodes pour attacher, détacher et notifier les observateurs.
 */
public interface OrderObservable {
	void attach(OrderObserver observer);
	void detach(OrderObserver observer);
	void notifyObservers(String order);
}
