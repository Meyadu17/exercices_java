package fr.apside.exerciceJava.exerciceBonus.exemple;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExempleController {

	private final ExempleService exempleService;

	@GetMapping(value = "/toto")
	public String getToto() {
		return exempleService.getToto();
	}

	@GetMapping(value = "/tata")
	public String getTata() {
		return exempleService.getTata();
	}
}
