package fr.apside.exerciceJava.exerciceBonus.factory;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UtilisateurController {

	private final UtilisateurService utilisateurService;
//	private final MarqueBlancheService marqueBlancheService;

	@GetMapping(value = "/melodynom")
	public String getNom (@RequestParam String idDemarche, @RequestParam String idOpportunite, @RequestParam String ctxRefPersonne,
												  @RequestParam String ctxSi, @RequestParam String ctxSocieteAppartenance, @RequestParam String idDemarcheCommerciale) {
		//Pour appeler le @Bean de marqueBlanche
		//marqueBlancheService.setMarqueBlanche(null, null, ctxRefPersonne, ctxSi, ctxSocieteAppartenance, null, null, null);

		return utilisateurService.getNom(idDemarcheCommerciale, idOpportunite, idDemarche);
	}

	@GetMapping(value = "/melodyprenom")
	public String getPrenom (@RequestParam String idDemarche, @RequestParam String idOpportunite, @RequestParam String ctxRefPersonne,
										  @RequestParam String ctxSi, @RequestParam String ctxSocieteAppartenance, @RequestParam String idDemarcheCommerciale) {
		//Pour appeler le @Bean de marqueBlanche
//		marqueBlancheService.setMarqueBlanche(null, null, ctxRefPersonne, ctxSi, ctxSocieteAppartenance, null, null, null);

		return utilisateurService.getPrenom(idDemarcheCommerciale, idOpportunite, idDemarche);
	}
}
