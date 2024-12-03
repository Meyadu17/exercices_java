package fr.apside.exerciceJava.exerciceBonus.factory;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Nom implements IUtilisateur {
	@Override
	public String codeQuestion() {
		return "Q_GEN_NOM_NAISS_CLIENT";
		//return QuestionEnum.Q_GEN_NOM_NAISS_CLIENT.getCode();
	}

	@Override
	public UtilisateurEnum getInfoUtilisateurEnum() {
		return UtilisateurEnum.NOM;
	}
}
