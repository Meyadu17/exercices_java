package fr.apside.exerciceJava.e4HeritageInterface;

public class Wizard extends Fighter {
    private boolean spellPrepared;

    public Wizard() {
        this.spellPrepared = false;
    }

    @Override
    public String getType() {
        return "Sorcier";
    }

    public void prepareSpell() {
        this.spellPrepared = true;
        System.out.println("Le sorcier prépare un sort");
    }

    public boolean isSpellPrepared() {
        return spellPrepared;
    }

    @Override
    public boolean isVulnerable() {
        if (spellPrepared)
            System.out.println("Le sorcier est invulnérable aux coups.");
        if (!spellPrepared)
            System.out.println("Le sorcier est vulnérable aux coups.");

        return !spellPrepared;
    }

    @Override
    public int damagePoints(Fighter opponent) {
        int damagePoints = isSpellPrepared() ? 12 : 3;
        System.out.println("Le sorcier provoque " + damagePoints + " points de dégâts au " + opponent.getType());
        return damagePoints;
    }
}
