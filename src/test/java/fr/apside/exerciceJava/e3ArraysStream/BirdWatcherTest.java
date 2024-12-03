package fr.apside.exerciceJava.e3ArraysStream;

import fr.apside.exerciceJava.e3ArraysStream.BirdWatcher;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BirdWatcherTest {
	public static void main(String[] args) {
		int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
		BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);

		// Test pour getLastWeek (affichage des valeurs par défaut de la semaine précédente)
		BirdWatcher.getLastWeek(); // Note : Cette méthode ne peut pas être testée de manière significative car elle ne retourne pas de valeur

		// Test pour getToday
		assert birdWatcher.getToday() == 1 : "Test getToday() échoué!";

		// Test pour incrementTodaysCount
		birdWatcher.incrementTodaysCount();
		assert birdWatcher.getToday() == 2 : "Test incrementTodaysCount() échoué!";

		// Test pour hasDayWithoutBirds
		assert birdWatcher.hasDayWithoutBirds() == true : "Test hasDayWithoutBirds() échoué!";

		// Test pour getCountForFirstDays
		assert birdWatcher.getCountForFirstDays(3) == 7 : "Test getCountForFirstDays(3) échoué!";

		// Test pour getBusyDays
		assert birdWatcher.getBusyDays() == 2 : "Test getBusyDays() échoué!";

		System.out.println("Tous les tests sont réussis!");
	}
}
