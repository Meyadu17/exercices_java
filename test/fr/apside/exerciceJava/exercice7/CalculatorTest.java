package fr.apside.exerciceJava.exercice7;


public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// Test pour la méthode add
		assert calc.add(2, 3) == 5 : "Test add(2, 3) échoué!";
		assert calc.add(-1, 5) == 4 : "Test add(-1, 5) échoué!";
		assert calc.add(0, 0) == 0 : "Test add(0, 0) échoué!";

		// Test pour la méthode subtrat
		assert calc.subtrat(5, 3) == 2 : "Test subtrat(5, 3) échoué!";
		assert calc.subtrat(0, 0) == 0 : "Test subtrat(0, 0) échoué!";
		assert calc.subtrat(-5, -3) == -2 : "Test subtrat(-5, -3) échoué!";

		// Test pour la méthode multiply
		assert calc.multiply(4, 5) == 20 : "Test multiply(4, 5) échoué!";
		assert calc.multiply(-4, -5) == 20 : "Test multiply(-4, -5) échoué!";
		assert calc.multiply(0, 5) == 0 : "Test multiply(0, 5) échoué!";

		// Test pour la méthode divide
		assert calc.divide(10, 2) == 5 : "Test divide(10, 2) échoué!";
		assert calc.divide(-10, -2) == 5 : "Test divide(-10, -2) échoué!";

		// Test pour la méthode divide par zéro
		try {
			calc.divide(1, 0);
			assert false : "Test divide(1, 0) (division par zéro) échoué!";
		} catch (IllegalArgumentException e) {
			assert e.getMessage().equals("Division par 0 impossible.") : "Message de l'exception incorrect!";
		}

		System.out.println("Tous les tests sont réussis!");
	}
}
