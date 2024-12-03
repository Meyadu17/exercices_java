package fr.apside.exerciceJava.e3ArraysStream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BirdWatcher {

	private int[] birdsPerDay;

	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay;
	}

	// 1. Vérifiez quels étaient les comptes la semaine dernière
	public static void getLastWeek() {
		int [] birdsPerDay = {2,5,0,7,4,1};
		System.out.println(java.util.Arrays.toString(birdsPerDay));
	}

	// 2. Vérifiez combien d'oiseaux sont venus aujourd'hui
	public int getToday() {
		if (birdsPerDay != null && birdsPerDay.length > 0) {
			System.out.println("Nombre d'oiseaux vu aujourd'hui : "+ birdsPerDay[birdsPerDay.length - 1]);
			return birdsPerDay[birdsPerDay.length - 1];
		} else {
			System.out.println(0);
			return 0;
		}
	}

	// 3. Incrémenter le décompte d'aujourd'hui
	public void incrementTodaysCount() {
		birdsPerDay[birdsPerDay.length - 1]++;
	}

	// 4. Vérifiez s'il y a eu une journée sans visite d'oiseaux
	public boolean hasDayWithoutBirds() {
		System.out.println("Oiseaux vu ? : " + (birdsPerDay[birdsPerDay.length - 1] >0) );
		return birdsPerDay[birdsPerDay.length - 1] > 0;
	}

	// 5. Calculer le nombre d'oiseaux visiteurs pour les n premiers jours de la semaine
	public int getCountForFirstDays(int nbJour) {
		int nbOiseauxVu = 0;
		for (int i = 0; i < nbJour; i++) {
			nbOiseauxVu += birdsPerDay[i];
		}
		System.out.println("Nombre total d'oiseaux : " + nbOiseauxVu + " depuis " + nbJour + " jours." );
		return IntStream.range(0, Math.min(nbJour, birdsPerDay.length)).sum();
	}

	// 6. Calculer le nombre de jours chargés
	public int getBusyDays() {
		System.out.println("Nombre de jours chargés : " + Arrays.stream(birdsPerDay).filter(count -> count > 4).count());
		return (int) Arrays.stream(birdsPerDay).filter(count -> count > 4).count();
	}
}
