package fr.apside.exerciceJava.e4HeritageInterface;

public class Warrior extends Fighter {

    @Override
    public String getType() {
        return "Guerrier";
    }

    @Override
    public boolean isVulnerable() {
        System.out.println("Le gerrier est vulnérable au coups : " + false);
        return false;
    }

    @Override
    public int damagePoints(Fighter opponent) {
        int damagePoints = opponent.isVulnerable() ? 10 : 6;
        System.out.println("Le gerrier provoque " + damagePoints + " points de dégâts au " + opponent.getType());
        return damagePoints;
    }
}
