package fr.apside.exerciceJava.exerciceBonus.exemple;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Toto implements IFamille{

	@Override
	public String qui() {
		return "toto";
	}

	@Override
	public FamilleEnum getFamilleEnum() {
		return FamilleEnum.TOTO;
	}
}
