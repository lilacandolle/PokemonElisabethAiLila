package gestiondespokemons;

import java.util.ArrayList;
import java.util.List;

public class MainJoueur {
    private List<Pokemon> ListeDeCaptures;

    public MainJoueur() {
        this.ListeDeCaptures = new ArrayList<Pokemon>();
    }

    public List<Pokemon> getListeDeCaptures() {
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
