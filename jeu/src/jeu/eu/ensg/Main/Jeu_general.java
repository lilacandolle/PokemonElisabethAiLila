import java.util.ArrayList;
import java.util.Random;
import gestionDesPokemons.*;
import gui.*;

import gestionDesPokemons.PokemonDuJeu;

public class Jeu_general {
	
	private ArrayList<PokemonDuJeu> listePokemon;
	
	public Jeu_general() {
		this.listePokemon = listePokemon;
	}
	
	public ArrayList<PokemonDuJeu> creerMDJ() {
		// crée la main du joueur avec un pokémon quelconque de la liste
		Random r = new Random();
		int indPok = r.nextInt(listePokemon.size());
		ArrayList<PokemonDuJeu> MDJ = new ArrayList<PokemonDuJeu>();
		MDJ.add(listePokemon.get(indPok));
		return MDJ;
	}
	
	public ArrayList<PokemonDuJeu> cliquerSurCarte() {
		// L'utilisateur clique sur la carte et on lui affiche les pokémons
		// présents à moins de 5 unités de lui
		ArrayList<PokemonDuJeu> PokProches = new ArrayList<PokemonDuJeu>();
		while (PokProches.size() == 0) {
			Coordinate coord = ActionListener() ;
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