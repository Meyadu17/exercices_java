package fr.apside.exerciceJava.exerciceBonus.factory_avec_api;
/*
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor*/
public class ReponseDecouvertePageEnCours /*implements IReponseDecouverte*/ {
/*
	@Override
	public List<Reponse> getFiltreRecher(List<Reponse> reponses, List<QuestionDecouverte> questionsDecouverte) {
		return reponses.stream()
				.filter(reponse -> questionsDecouverte.stream()
						.anyMatch(question -> Objects.equals(question.getCodeQuestion(), reponse.getCodeQuestion()) &&
											  Objects.equals(question.getCodeEtape(), "MGEN-FBSNTCOL-CRITCOUV") &&
											  Boolean.TRUE.equals(question.getVisible())))
				.toList();
	}

	@Override
	public EtapeReponsesEnum codeEtapeEnum() {
		return EtapeReponsesEnum.REPONSES_PAGE_EN_COURS;
	}*/
}