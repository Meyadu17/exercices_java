package fr.apside.exerciceJava.exerciceBonus.factory_avec_api;
/*
import jams.exception.technical.JamsTechnicalException;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service*/
public class ReponseDecouverteFactory {
/*	private final List<IReponseDecouverte> listeReponses;
	private final Map<EtapeReponsesEnum, IReponseDecouverte> mapReponses = new EnumMap<>(EtapeReponsesEnum.class);

	private void mapingDesElements() {
		 mapReponses.putAll(listeReponses.stream().filter(iDecouverte -> null != iDecouverte.codeEtapeEnum())
		 .collect(Collectors
		 .toMap(IReponseDecouverte::codeEtapeEnum, Function.identity())));

	}

	//Constructeur
	public ReponseDecouverteFactory(List<IReponseDecouverte> listeDecouvertes) {
		this.listeReponses = listeDecouvertes;
		mapingDesElements();
	}

	//récupération des services adéquats
	public IReponseDecouverte getServiceUtilisateurEnum(EtapeReponsesEnum etapeReponsesEnum) {
		if (!mapReponses.containsKey(etapeReponsesEnum)) {
			throw new JamsTechnicalException("Service non trouvé.");
		}
		return mapReponses.get(etapeReponsesEnum);
	}*/
}
