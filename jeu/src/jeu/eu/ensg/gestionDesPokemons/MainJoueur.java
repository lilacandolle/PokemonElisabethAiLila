package gestionDesPokemons;

import java.util.ArrayList;
import java.util.List;

public class MainJoueur {
    private List<PokemonDuJeu> ListeDeCaptures;

    public MainJoueur() {
        this.ListeDeCaptures = new ArrayList<PokemonDuJeu>();
    }

    public List<PokemonDuJeu> getListeDeCaptures() {
        return ListeDeCaptures;
    }

    public void addPokemon(Pokemon p) {
        this.ListeDeCaptures.add(p);
    }

    @Override
    public String toString() {
        return "Le joueur possède les pokémons suivants : " + ListeDeCaptures;
    }
}
