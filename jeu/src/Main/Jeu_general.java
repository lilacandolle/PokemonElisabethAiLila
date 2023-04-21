package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.MouseInfo;

import gestionDesPokemons.Coordinate;
import gestionDesPokemons.Pokemon;
import gestionDesPokemons.PokemonDuJeu;

public class Jeu_general {
	
	public static void debutduJeu() {
		List<Pokemon> Pokemons = ChargerPoke.loadPokemon();
		ArrayList<PokemonDuJeu> listePokemonDuJeu = new ArrayList<PokemonDuJeu>();
		for (int i=0; i<=7; i++) {
			for (int j=1; i<=Pokemons.size(); j++){
				Pokemon pokemon = Pokemons.get(j);
				PokemonDuJeu pok = new PokemonDuJeu(pokemon, true);
				listePokemonDuJeu.add(pok);
			}
		}
		creerMDJ(listePokemonDuJeu, 5);
	}
	
	public static void creerMDJ(ArrayList<PokemonDuJeu> listePokemon, int nbPok) {
		// crée la main du joueur avec un nombre de pokemons
		Random r = new Random();
		for (int i=0; i<=nbPok; i++ ){
			int indPok = r.nextInt(listePokemon.size());
			listePokemon.get(indPok).setCoord(null);
			listePokemon.get(indPok).setisSauvage(false);
		}
	}
	
	public ArrayList<PokemonDuJeu> cliquerSurCarte() {
		// L'utilisateur clique sur la carte et on lui affiche les pokémons
		// présents à moins de 5 unités de lui
		ArrayList<PokemonDuJeu> PokProches = new ArrayList<PokemonDuJeu>();
		while (PokProches.size() == 0) {
			Coordinate coord = new Coordinate(MouseInfo.getPointerInfo().getLocation().getX(),MouseInfo.getPointerInfo().getLocation().getY()) ;
			for (int i=0; i<=listePokemon.size(); i++) {
				if (coord.distance(listePokemon.get(i).getCoord()) <= 5) {
					PokProches.add(listePokemon.get(i));
				}
			}
			System.out.println("Il n'y a pas de Pokémons dans ce secteur!");
			}
		return PokProches;
		
	}
	
	public String lancerLeCombat() {
		// demande au joueur de choisir le pokémon à attaquer
		// et le pokémon défenseur et renvoie le résultat du combat
		System.out.println("Quel Pokémon voulez-vous attaquer?");
		Pokemon PokS = choisirPokemonS();
		String resultat = new String ();
		if (Combat(PokS) = true) { 
			resultat += "Vous avez gagné! Le pokémon a été capturé";
		}
		else {
			resultat += "Oups, vous avez perdu le combat!";
		}
		return resultat;
	}
	
	public Pokemon choisirPokemonS() {
		//Permet à l'utilisateur de choisir le pokémon qu'il veut combattre 
		// dans la liste des pokémons proches de lui
		ArrayList<PokemonDuJeu> PokProches = cliquerSurCarte();
		System.out.println("Proche de vous il y a: " + PokProches);
		Pokemon PokS = ActionListener(PokProches);
		return PokS;
	}

}