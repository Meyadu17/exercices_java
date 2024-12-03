package fr.apside.exerciceJava.exerciceBonus.exemple;

import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class ExempleFactory {

	//Avec cette liste un recupère tout les implementations de l'interfaces IFamille (ici la classe toto et la classe tata).
	private final List<IFamille> familles;
	private Map<FamilleEnum, IFamille> mapage = new EnumMap<>(FamilleEnum.class);

	//Construction du mapping des éléments
	private void mapingDesElements() {
		//Ceci est un prédicat : utile pour exprimer des conditions de manière concise et réutilisable
		Predicate<IFamille> iFamillePredicate = iFamille -> null != iFamille.getFamilleEnum();

		mapage.putAll( // permet d'ajouter ce qu'il y a entre () dans un objet map
			familles.stream() //récupère la liste famille
					.filter(iFamillePredicate) //explique ce que je veux garder ici on verifie la nullité ou .filter(iFamille -> null == iFamille.getCode())
					.collect( // permet d'expliquer comment construire l'objet map
					Collectors.toMap( // transformation du stream en map
						IFamille::getFamilleEnum, Function.identity() //clé:IFamille::getCode, valeur: Function.identity() signifie lui-même
					)
				)
		);
	}

	//Injection par constructeur (Attention l'anotation @AllArgumentConstructeur ne fonctionne pas !!!)
	public ExempleFactory(List<IFamille> familles) {
		this.familles = familles;
		//prenser a jouter mapingDesElements dans le contructeur
		mapingDesElements();
	}

	//récupération du service correspondant à l'énumération choisie (ex TATA ou TOTO)
	public IFamille getServiceFamilleEnum(FamilleEnum familleEnum){
		if (!mapage.containsKey(familleEnum)) {
			System.out.println("Pas de service trouvé.");
			//throw new JamsTechnicalException("Pas de service trouvé.");
		}
		return mapage.get(familleEnum);
	}

}
