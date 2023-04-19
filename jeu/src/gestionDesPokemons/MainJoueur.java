package gestionDesPokemons;

import java.util.ArrayList;
import java.util.List;

public class MainJoueur {
    private List<PokemonDuJeu> listeDeCaptures;

    public MainJoueur() {
        this.listeDeCaptures = new ArrayList<PokemonDuJeu>();
    }

    public List<PokemonDuJeu> getListeDeCaptures() {
        return listeDeCaptures;
    }

    public void addPokemon(PokemonDuJeu p) {
        this.listeDeCaptures.add(p);
    }

    @Override
    public String toString() {
        return "Le joueur possède les pokémons suivants : " + listeDeCaptures;
    }
}
