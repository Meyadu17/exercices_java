package fr.apside.exerciceJava.exerciceBonus.factory_avec_api;
/*
import fr.mtech.api.demarches_commerciales_front.v2.client.dto.Reponse;
import fr.mtech.api.jams.models.marqueblanche.ContexteMarqueBlanche;
import fr.mtech.api.referentiel_offres_distribution.v1.client.dto.ConfigurationDecouverte;
import fr.mtech.api.referentiel_offres_distribution.v1.client.dto.FamilleBesoin;
import fr.mtech.api.referentiel_offres_distribution.v1.client.dto.PhaseDecouverte;
import fr.mtech.api.referentiel_offres_distribution.v1.client.dto.QuestionDecouverte;
import fr.mtech.jams.gdco.commun.mapper.ContexteMarqueBlancheMapper;
import fr.mtech.jams.gdco.ext.demarches_commerciales.DemarchesCommercialesAPIService;
import fr.mtech.jams.gdco.ext.referentiel_offres_distribution.ReferentielOffresDistributionAPIService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor*/
public class ReponseDecouverteService {
/*
	private final ReponseDecouverteFactory reponseDecouverteFactory;
	private final DemarchesCommercialesAPIService demarchesCommercialesAPIService;
	private final ContexteMarqueBlanche contexteMarqueBlanche;
	private  final ContexteMarqueBlancheMapper contexteMarqueBlancheMapper;

	private final ReferentielOffresDistributionAPIService referentielOffresDistributionAPIService;
	// trouver un autre moyen d'avoir ces deux constantes
	// les passer en parametre du controller ? - a voir

	private List<Reponse> getReponses(String idDemarcheCommerciale, String refOpportuniteBesoin, String refDecouverte, EtapeReponsesEnum etapeReponsesEnum) {

		FamilleBesoin familleBesoin = referentielOffresDistributionAPIService
				.getFamillesBesoin("010", "FB-MGEN-SNT-COLL-SALA", null, null, null)
				.stream().findFirst().orElse(null);

		// je recupere la liste des question depuis EBX
		List<QuestionDecouverte> questionDecouverteList = Optional.ofNullable(familleBesoin)
				.map(FamilleBesoin::getConfigurationDecouverte)
				.map(ConfigurationDecouverte::getPhaseDecouverte)
				.map(PhaseDecouverte::getQuestionsDecouverte)
				.orElse(Collections.emptyList());

		// je recuperer les réponse qui existe dans ma decouverte de mon opportunite  de besoin de ma demarche
		List<Reponse> reponseList = demarchesCommercialesAPIService.getReponsesDecouverteOpportuniteBesoin(
				idDemarcheCommerciale, refOpportuniteBesoin, refDecouverte,
				contexteMarqueBlancheMapper.contexteMarqueBlancheOrchToContexteMarqueBlancheDemarcheCommerciale(contexteMarqueBlanche), null);

		//Récupérer une implémentation spécifique de l'interface IReponseDecouverte à partir de la factory ReponseDecouverteFactory,
		// en fonction de l'énumération EtapeReponsesEnum fournie.
		IReponseDecouverte reponseDecouverteService = reponseDecouverteFactory.getServiceUtilisateurEnum(etapeReponsesEnum);

		return reponseDecouverteService.getFiltreRecher(reponseList, questionDecouverteList);
	}

	public List<Reponse> getListeReponsePageEnCours(String idDemarcheCommerciale, String refOpportuniteBesoin, String refDecouverte) {

		return getReponses(idDemarcheCommerciale, refOpportuniteBesoin, refDecouverte, EtapeReponsesEnum.REPONSES_PAGE_EN_COURS);
	}

	public List<Reponse> getListeDesReponses(String idDemarcheCommerciale, String refOpportuniteBesoin, String refDecouverte) {

		return getReponses(idDemarcheCommerciale, refOpportuniteBesoin, refDecouverte, EtapeReponsesEnum.REPONSES);
	}*/
}
