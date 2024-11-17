package fr.apside.exerciceJava.exercice4;

public interface Theft {

    default boolean isTheft(){
        System.out.println("Peux voler");
        return true;
    }

}
