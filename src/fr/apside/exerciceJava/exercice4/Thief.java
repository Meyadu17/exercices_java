package fr.apside.exerciceJava.exercice4;

public class Thief extends Fighter implements Theft {
    @Override
    public String getType() {
        return "Voleur";
    }

    @Override
    public boolean isVulnerable() {
        System.out.println("Le voleur est vulnérable aux coups");
        return false;
    }

    @Override
    public int damagePoints(Fighter opponent) {
        System.out.println("Voleur ne provoque 0 point de dégâts au " + opponent.getType());
        return 0;
    }
}
