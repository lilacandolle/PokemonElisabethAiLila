package gestionDesPokemons ;

//importer random de math
import java.util.Random ;
import java.awt.event.* ;

public class Combat {
    private PokemonDuJeu pokemonS;
    private PokemonDuJeu pokemonD;//pokemondujoueur
    private int hpS = pokemonS.getPokemon().getHP();
    private int hpD = pokemonD.getPokemon().getHP();
    

    public Combat(PokemonDuJeu pokemonS, PokemonDuJeu pokemonD) {
        this.pokemonS = pokemonS;
        this.pokemonD = pokemonD;
    }

    public void changerPok(PokemonDuJeu nouveaupokemon) {
        pokemonS = nouveaupokemon;
    }

    public void attaque (boolean isElement, PokemonDuJeu attaquant, PokemonDuJeu defenseur) {
        Famille famA = attaquant.getPokemon().getFamille() ;
        Famille famD = defenseur.getPokemon().getFamille();
        double coef;
        switch (famA) {
            case ACIER:
                coef = switch (famD) {
                    case ACIER, EAU, FEU, ELECTRIK -> 0.5;
                    case GLACE, FEE, ROCHE -> 2;
                    default -> 1;
                };
                break ;

            case COMBAT:
                coef = switch (famD) {
                    case FEE, INSECTE, POISON, PSY, VOL -> 0.5;
                    case ACIER, GLACE, NORMAL, ROCHE, TENEBRES-> 2;
                    default -> 1;
                };
                break ;
            case DRAGON:
                coef = switch (famD) {
                    case DRAGON -> 2;
                    case ACIER -> 0.5;
                    case FEE -> 0;
                    default -> 1;
                };
                break ;
            case EAU:
                coef = switch (famD) {
                    case DRAGON, EAU, PLANTE -> 0.5;
                    case FEU, ROCHE, SOL -> 2;
                    default -> 1;
                };
                break ;
            case ELECTRIK:
                coef = switch (famD) {
                    case DRAGON, ELECTRIK, PLANTE -> 0.5;
                    case EAU, VOL -> 2;
                    case SOL -> 0;
                    default -> 1;
                };
                break ;
            case FEU:
                coef = switch (famD) {
                    case DRAGON, FEU, EAU, ROCHE -> 0.5;
                    case ACIER, GLACE, INSECTE, PLANTE -> 2;
                    default -> 1;
                };
                break ;
            case FEE:
                coef = switch (famD) {
                    case POISON, FEU, ACIER -> 0.5;
                    case COMBAT, DRAGON, TENEBRES -> 2;
                    default -> 1;
                };
                break ;
            case GLACE:
                coef = switch (famD) {
                    case ACIER, EAU, FEU, GLACE -> 0.5;
                    case DRAGON, PLANTE, SOL, VOL -> 2;
                    default -> 1;
                };
                break ;
            case INSECTE:
                coef = switch (famD) {
                    case ACIER, COMBAT, FEU, FEE -> 0.5;
                    case POISON, SPECTRE, VOL -> 2;
                    default -> 1;
                };
                break ;
            case NORMAL:
                coef = switch (famD) {
                    case ROCHE, ACIER -> 0.5;
                    case SPECTRE -> 0;
                    default -> 1;
                };
                break ;
            case PLANTE:
                coef = switch (famD) {
                    case ACIER, DRAGON, FEU, INSECTE, PLANTE, POISON, VOL -> 0.5;
                    case EAU, ROCHE, SOL -> 2;
                    default -> 1;
                };
                break ;
            case POISON:
                coef = switch (famD) {
                    case ROCHE, SPECTRE, POISON, SOL -> 0.5;
                    case PLANTE, FEE -> 2;
                    case ACIER -> 0;
                    default -> 1;
                };
                break ;
            case PSY:
                coef = switch (famD) {
                    case COMBAT, POISON -> 2;
                    case ACIER, PSY -> 0.5;
                    case TENEBRES -> 0;
                    default -> 1;
                };
                break ;
            case ROCHE:
                coef = switch (famD) {
                    case COMBAT, SOL, ACIER -> 0.5;
                    case FEU, GLACE, INSECTE, VOL -> 2;
                    default -> 1;
                };
                break ;
            case SPECTRE:
                coef = switch (famD) {
                    case TENEBRES -> 0.5;
                    case SPECTRE, PSY -> 2;
                    case NORMAL -> 0;
                    default -> 1;
                };
                break ;
            case SOL:
                coef = switch (famD) {
                    case PLANTE, INSECTE -> 0.5;
                    case ACIER, FEU, ELECTRIK, POISON, ROCHE -> 2;
                    case VOL -> 0;
                    default -> 1;
                };
                break ;
            case TENEBRES:
                coef = switch (famD) {
                    case COMBAT, FEE, TENEBRES -> 0.5;
                    case PSY, SPECTRE -> 2;
                    default -> 1;
                };
                break ;
            case VOL:
                coef = switch (famD) {
                    case ELECTRIK, ROCHE, ACIER -> 0.5;
                    case COMBAT, INSECTE, PLANTE -> 2;
                    default -> 1;
                };
                break ;
            default:
                coef = 1;
                break ;
        }

        int degats;
        if (!isElement) {
            degats = 20 ; }
        else {
            degats = (int) coef * 20 ; }
        
        if (defenseur==pokemonD){
            hpD -= degats  ;
        }
        else {
            hpS -= degats  ;
        }
        
    } 

    /*public boolean derouleDuCombat () {
        boolean victoire = false ;
        while (hpS > 0 && hpD > 0) {
            attaque (true, pokemonD, pokemonS);
            if (Math.random() > 0.5) {
                    attaque(false, pokemonS, pokemonD) ; }

                else {
                    attaque(true, pokemonS, pokemonD) ; }
        }
        if (hpS > 0) {
            victoire = true ;
            pokemonS.setisSauvage(false);
            MainJoueur.addPokemon(pokemonS);
        }
        return victoire ;
    }*/
}