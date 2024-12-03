package fr.apside.exerciceJava.exerciceBonus.factory;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UtilisateurService {

	private final UtilisateurFactory utilisateurFactory;
//	private final DemarchesCommercialesAPIService demarchesCommercialesAPIService;
//	private final ContexteMarqueBlanche contexteMarqueBlanche;
//	private  final ContexteMarqueBlancheMapper contexteMarqueBlancheMapper;

	private String getReponseParCodeQuestion(String idDemarcheCommerciale, String refOpportuniteBesoin, String refDecouverte, UtilisateurEnum utilisateurEnum){
		String codeQuestion = utilisateurFactory.getServiceUtilisateurEnum(utilisateurEnum).codeQuestion();

		// Liste des réponses aux questions
		// contexteMarqueBlanche déclaré en début de méthode n'est pas le même que celui qui doit être mis en parametre de
		// getReponsesDecouverteOpportuniteBesoin(). On utilise donc la classe ContexteMarqueBlancheMapper qui permet de "convertir" contexteMarqueBlanche de
		// jams.models.marqueblanche.ContexteMarqueBlanche en contexteMarqueBlanche de demarches_commerciales_front.v2.client.dto

		return "Ma réponse";
		/*return demarchesCommercialesAPIService.getReponsesDecouverteOpportuniteBesoin(idDemarcheCommerciale, refOpportuniteBesoin,
						refDecouverte, contexteMarqueBlancheMapper.contexteMarqueBlancheOrchToContexteMarqueBlancheDemarcheCommerciale(contexteMarqueBlanche), null)
				.stream()// récupération de la liste des réponses
				.filter(reponse -> StringUtils.equals(codeQuestion, reponse.getCodeQuestion()))// StringUtils.equals à privilégier
				//.filter(reponse -> codeQuestion.equals(reponse.getCodeQuestion()))// .equals à éviter
				.map(Reponse::getValeur)//mapping du la valeur de la réponse
				.findAny()//récupère le premier élément de la liste qu'il trouve
				.orElse(StringUtils.EMPTY);// met à null si l'élément est vide

		 */
	}

	public String getNom(String idDemarcheCommerciale, String refOpportuniteBesoin, String refDecouverte) {

		return getReponseParCodeQuestion(idDemarcheCommerciale, refOpportuniteBesoin, refDecouverte, UtilisateurEnum.NOM);
	}

	public String getPrenom(String idDemarcheCommerciale, String refOpportuniteBesoin, String refDecouverte) {

		return getReponseParCodeQuestion(idDemarcheCommerciale, refOpportuniteBesoin, refDecouverte, UtilisateurEnum.PRENOM);
	}
}
