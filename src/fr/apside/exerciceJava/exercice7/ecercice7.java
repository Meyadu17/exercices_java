package fr.apside.exerciceJava.exercice7;

/**
 * Exercice 7 - Les tests
 * Temps passé : (16:10)
 * Problèmes rencontrés :
 */
public class ecercice7 {
	public static void main(String[] args) {
		int a = 5;
		int b = 23;
		int c = 0;
		int d = 125;


		Calculator calc = new Calculator();
		try {
			calc.add(a,b);
			calc.subtrat(d,a);
			calc.multiply(a,b);
			calc.divide(b,a);
			calc.divide(b,c);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("On a essayé de diviser par 0.");
		}
	}
}