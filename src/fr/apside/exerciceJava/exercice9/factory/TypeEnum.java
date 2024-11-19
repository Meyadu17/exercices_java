package fr.apside.exerciceJava.exercice9.factory;

import java.util.EnumSet;

public enum TypeEnum {
	PIZZA("Pizza"),
	BURGER("Burger"),
	DRINK("Drink");

	String code;

	TypeEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public TypeEnum getEnum(String code) {
		return EnumSet.allOf(TypeEnum.class).stream()
				.filter(typeEnum -> typeEnum.getCode().equals(code))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException("Commande inconnue: " + code));
	}
}
