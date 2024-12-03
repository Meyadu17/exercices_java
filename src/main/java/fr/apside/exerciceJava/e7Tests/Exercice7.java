package fr.apside.exerciceJava.e7Tests;

/**
 * Exercice 7 - Les tests
 * Temps passé : 3h
 * Problèmes rencontrés : tellement habituée à utiliser Mockito avec Spring que j'ai eu un peu de mal au début.
 */
public class Exercice7 {
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