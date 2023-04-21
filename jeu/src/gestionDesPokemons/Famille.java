package gestionDesPokemons;

public enum Famille {
    // Énumération des différentes familles de pokémons
    ACIER, COMBAT, DRAGON, EAU, FEU, ELECTRIK, FEE, GLACE, INSECTE, NORMAL, PLANTE, POISON, PSY, ROCHE, SPECTRE, SOL, TENEBRES, VOL;

    // Constructeur des familles à partir de string pour l'importation des csv
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
