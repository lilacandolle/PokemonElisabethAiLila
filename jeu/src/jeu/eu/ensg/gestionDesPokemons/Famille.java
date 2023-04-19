package gestionDesPokemons;

public enum Famille {
    //créer énumération des familles de pokémons
    ACIER, COMBAT, DRAGON, EAU, FEU, ELECTRIK, FEE, GLACE, INSECTE, NORMAL, PLANTE, POISON, PSY, ROCHE, SPECTRE, SOL, TENEBRES, VOL;

    //constructeur à partir de string
    public static Famille fromString(String text) {
        if (text != null) {
            for (Famille b : Famille.values()) {
                if (text.equalsIgnoreCase(b.name())) {
                    return b;
                }
            }
        }
        return null;
    }
}
