package fr.apside.exerciceJava.e4HeritageInterface;

public interface Theft {

    // mettre default devant la méthode permet de l'utiliser tel quel dans les classe qui implémente cette interface dans avoir à la redéfinir.
    default boolean isTheft(){
        System.out.println("Peux voler");
        return true;
    }

}
