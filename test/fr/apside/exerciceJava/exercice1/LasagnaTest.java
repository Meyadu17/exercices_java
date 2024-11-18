package fr.apside.exerciceJava.exercice1;

public class LasagnaTest {
	public static void main(String[] args) {
		Lasagna lasagna = new Lasagna();

		// Test pour expectedMinutesInOven
		assert lasagna.expectedMinutesInOven() == 40 : "Test expectedMinutesInOven échoué!";

		// Test pour remainingMinutesInOven
		lasagna = new Lasagna();
		assert lasagna.remainingMinutesInOven(10) == 30 : "Test remainingMinutesInOven échoué!";

		// Test pour preparationTimeInMinutes
		assert lasagna.preparationTimeInMinutes(5) == 10 : "Test preparationTimeInMinutes échoué!";

		// Test pour totalTimeInMinutes
		assert lasagna.totalTimeInMinutes(5, 20) == 30 : "Test totalTimeInMinutes échoué!";

		System.out.println("Tous les tests sont réussis!");
	}
}
