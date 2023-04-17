package gestionpokemon

public class Pokedex {
    private type fichier ; 
    //charger données pokémons
    public charger(type fichier) {
        load fichier ;
        pokeList = []
        for (i : fichier.name) {
            pokeList += new Pokemon(fichier.name, fichier.type, fichier.hp)
        }
    }

    
}