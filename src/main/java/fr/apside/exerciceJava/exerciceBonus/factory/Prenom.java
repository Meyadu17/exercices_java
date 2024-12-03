package fr.apside.exerciceJava.exerciceBonus.factory;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Prenom implements IUtilisateur {

	@Override
	public String codeQuestion() {
		return "Q_GEN_PRENOM";
		//return QuestionEnum.Q_GEN_PRENOM.getCode();
	}

	@Override
	public UtilisateurEnum getInfoUtilisateurEnum() {
		return UtilisateurEnum.PRENOM;
	}
}
