package fr.apside.exerciceJava.e4HeritageInterface;

public abstract class Fighter {

    @Override
    public String toString() {
        System.out.println("Le combattant est un " + this.getType());
        return "Le combattant est un " + this.getType();
    }

    public abstract String getType();

    public abstract boolean isVulnerable();

    public abstract int damagePoints(Fighter opponent);

}
