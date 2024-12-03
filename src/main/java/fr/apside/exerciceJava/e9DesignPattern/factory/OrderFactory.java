package fr.apside.exerciceJava.e9DesignPattern.factory;

import java.util.EnumMap;
import java.util.Map;

public class OrderFactory {

	private Map<TypeEnum, OrderInterface> map = new EnumMap<>(TypeEnum.class);

	public OrderFactory() {
		map.put(TypeEnum.PIZZA, new Pizza());
		map.put(TypeEnum.BURGER, new Burger());
		map.put(TypeEnum.DRINK, new Drink());
	}

	public OrderInterface createOrder(TypeEnum typeEnum) throws CommandeInconnuException{
		if (!map.containsKey(typeEnum)) throw new CommandeInconnuException("Commande inconnue");
		System.out.println("- La commande de " + typeEnum.getCode() + " a bien été prise.");
		return map.get(typeEnum);
	}

}
