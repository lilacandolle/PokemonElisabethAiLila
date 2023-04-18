package gestionDesPokemons;

public enum Famille {
    //créer énumération des familles de pokémons
    ACIER(0.5, 1, 1, 0.5, 0.5, 0.5, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1),
    COMBAT(2, 1, 1, 1, 1, 1, 0.5, 2, 0.5, 2, 1, 0.5, 0.5, 2, 1, 0, 2, 0.5),
    DRAGON(0.5, 1, 2, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
    EAU(1, 1, 0.5, 0.5, 2, 1, 1, 1, 1, 1, 0.5, 1, 1, 2, 2, 1, 1, 1),
    FEU(2, 1, 0.5, 0.5, 0.5, 1, 1, 2, 2, 1, 2, 1, 1, 0.5, 1, 1, 1, 1),
    ELECTRIK(1, 1, 0.5, 2, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 1, 1, 0, 1, 1, 2),
    FEE(0.5, 2, 2, 1, 0.5, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 2, 1),
    GLACE(0.5, 0.5, 1, 1, 0.5, 1, 0.5, 1, 1, 1, 2, 0.5, 2, 1, 1, 0.5, 2, 0.5),
    INSECTE(0.5, 0.5, 1, 1, 0.5, 1, 0.5, 1, 1, 1, 2, 0.5, 2, 1, 1, 0.5, 2, 0.5),
    NORMAL(0.5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 0, 1, 1),
    PLANTE(0.5, 1, 0.5, 2, 0.5, 1, 1, 1, 0.5, 1, 0.5, 0.5, 1, 2, 2, 1, 1, 0.5),
    POISSON(0, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 0.5, 1, 0.5, 0.5, 0.5, 1, 1),
    PSY(0.5, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 0, 1),
    ROCHE(0.5, 0.5, 1, 1, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0.5, 1, 1, 2),
    SOL(2, 1, 1, 1, 2, 2, 1, 1, 0.5, 1, 0.5, 2, 1, 2, 1, 1, 1, 0),
    SPECTRE(1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 2, 1, 1, 2, 0.5, 1),
    TENEBRES(1, 0.5, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 2, 1, 1, 2, 0.5, 1),
    VOL(0.5, 2, 1, 1, 1, 0.5, 1, 1, 2, 1, 2, 1, 1, 0.5, 1, 1, 1, 1);

    //créer variables avec les noms de famille
    private double acier;
    private double combat;
    private double dragon;
    private double eau;
    private double feu;
    private double electrik;
    private double fee;
    private double glace;
    private double insecte;
    private double normal;
    private double plante;
    private double poisson;
    private double psy;
    private double roche;
    private double sol;
    private double spectre;
    private double tenebres;
    private double vol;

    //créer constructeur
    Famille(double acier, double combat, double dragon, double eau, double feu, double electrik, double fee, double glace, double insecte, double normal, double plante, double poisson, double psy, double roche, double sol, double spectre, double tenebres, double vol) {
        this.acier = acier;
        this.combat = combat;
        this.dragon = dragon;
        this.eau = eau;
        this.feu = feu;
        this.electrik = electrik;
        this.fee = fee;
        this.glace = glace;
        this.insecte = insecte;
        this.normal = normal;
        this.plante = plante;
        this.poisson = poisson;
        this.psy = psy;
        this.roche = roche;
        this.sol = sol;
        this.spectre = spectre;
        this.tenebres = tenebres;
        this.vol = vol;
    }

}
