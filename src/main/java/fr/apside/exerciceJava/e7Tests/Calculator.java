package fr.apside.exerciceJava.e7Tests;

public class Calculator {

	public int add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b) );
		return a + b;
	}

	public int subtrat(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a-b) );
		return a - b;
	}

	public int multiply(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a*b) );
		return a * b;
	}

	public int divide(int a, int b) throws IllegalArgumentException {
		if(b == 0) {
			throw new IllegalArgumentException("Division par 0 impossible.");
		}
		System.out.println(a + " / " + b + " = " + (a/b) );
		return a / b;
	}
}
