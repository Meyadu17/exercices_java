package fr.apside.exerciceJava.exerciceBonus.factory_avec_api;
/*
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor*/
public class ReponseDecouverte implements IReponseDecouverte {

	// urilisation de Objects.equals pour la gestion de la nullité
	// Vérifie automatiquement si l'un des objets passé en paramètre est null avant de faire la comparaison.
	// Empêche l'apparition d'une NullPointerException qui se produirait autrement lors d'un appel à equals sur un objet qui peut être null.
	/*@Override
	public List<Reponse> getFiltreRecher(List<Reponse> reponses, List<QuestionDecouverte> questionsDecouverte) {
		return reponses.stream()
				.filter(reponse -> questionsDecouverte.stream()
						.anyMatch(question -> Objects.equals(question.getCodeQuestion(), reponse.getCodeQuestion()) &&
											  Objects.equals(question.getCodeEtape(), "MGEN-FBSNTCOL-CRITCOUV")))
				.toList();
	}

	@Override
	public EtapeReponsesEnum codeEtapeEnum() {
		return EtapeReponsesEnum.REPONSES;
	}*/
}
