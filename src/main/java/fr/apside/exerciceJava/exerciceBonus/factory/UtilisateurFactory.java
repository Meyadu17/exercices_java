package fr.apside.exerciceJava.exerciceBonus.factory;

import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class UtilisateurFactory {
	//récupération des implémentations de l'interface :
	private final List<IUtilisateur> listUtilisateurs;
	private final Map<UtilisateurEnum, IUtilisateur> mapUtilisateurs = new EnumMap<>(UtilisateurEnum.class);

	//maping des éléments
	private void mapingDesElements() {
		mapUtilisateurs.putAll(listUtilisateurs.stream()
				.filter(iUtilisateur -> null != iUtilisateur.getInfoUtilisateurEnum())
				.collect(Collectors.toMap(IUtilisateur::getInfoUtilisateurEnum, Function.identity())));
	}

	//Constructeur
	public UtilisateurFactory(List<IUtilisateur> listUtilisateurs) {
		this.listUtilisateurs = listUtilisateurs;
		mapingDesElements();
	}

	//récupération des services adéquats
	public IUtilisateur getServiceUtilisateurEnum(UtilisateurEnum utilisateurEnum) {
		if (!mapUtilisateurs.containsKey(utilisateurEnum)) {
			System.out.println("Service non trouvé.");
			//throw new JamsTechnicalException("Service non trouvé.");
		}
		return mapUtilisateurs.get(utilisateurEnum);
	}
}
