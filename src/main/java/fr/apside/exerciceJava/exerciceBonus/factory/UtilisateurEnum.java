package fr.apside.exerciceJava.exerciceBonus.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.EnumSet;

@AllArgsConstructor
public enum UtilisateurEnum {
	NOM("codeNom"),
	PRENOM("codePrenom");

	@Getter
	String code;

	// Méthode pour obtenir une instance de l'énumération en fonction du code fourni
	public UtilisateurEnum getEnum(String code) {
		// Parcourt toutes les instances de l'énumération UtilisateurEnum
		// pour créer un ensemble de toutes les instances de l'énumération pour les parcourir
		return EnumSet.allOf(UtilisateurEnum.class)
				.stream()
				// Filtre les instances en fonction du code, en vérifiant si le code de l'instance correspond à celui fourni
				// pour trouver l'instance de l'énumération dont le code correspond au code fourni en paramètre
				.filter(
					utilisateurEnum -> StringUtils.equals(utilisateurEnum.getCode(), code))
				// Renvoie la première instance qui correspond, ou NOM par défaut si aucune ne correspond
				// pour s'assurer qu'une instance valide de l'énumération est toujours retournée, même si le code fourni ne correspond à aucune instance
				.findAny().orElse(NOM);
	}
}
