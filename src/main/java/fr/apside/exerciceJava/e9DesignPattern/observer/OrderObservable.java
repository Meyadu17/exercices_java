package fr.apside.exerciceJava.e9DesignPattern.observer;

/**
 * Cette interface définira les méthodes pour attacher, détacher et notifier les observateurs.
 */
public interface OrderObservable {
	void attach(OrderObserver observer);
	void detach(OrderObserver observer);
	void notifyObservers(String order);
}
