package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import gestionDesPokemons.*;

public class Jeu_general {
	
	/**
	 * Instancie les types de pokemons et les pokemons du jeu
	 */
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
	
	/**
	 * @param listePokemon
	 * @param nbPok
	 * crée la main du joueur avec un nombre de pokemons donné
	 */
	public static void creerMDJ(ArrayList<PokemonDuJeu> listePokemon, int nbPok) {
		Random r = new Random();
		for (int i=0; i<=nbPok; i++ ){
			int indPok = r.nextInt(listePokemon.size());
			listePokemon.get(indPok).setCoord(null);
			listePokemon.get(indPok).setisSauvage(false);
		}
	}
	
	/**
	 * L'utilisateur clique sur la carte et on lui affiche les pokémons présents à moins de 5 unités de lui
	 * @return List PokProches
	 */
	public ArrayList<PokemonDuJeu> cliquerSurCarte() {
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

	/**
	 * @param pokemonS
	 * La méthode derouleDuCombat prend en entrée le pokémon sauvage choisit par le joueur.
	 * Le combat est initialisé par le choix d'un pokemon du joueur.
	 * Ensuite, le combat se déroule au tour par tour (calculé grâce à l'incrément i).
	 * À son tour, le joueur choisit parmis ses actions possibles.
	 * Au tour de l'ordinateur, le pokemon sauvage attaque aléatoirement avec une probabilité de 0.5 par type d'attaque.
	 * La boucle while vérifie qu'il reste des vies aux deux pokémons
	 * à la fin de chaque nouveau tour. Si ce n'est pas le cas, il renvoie, selon le pokémon perdant :
	 * @return boolean victoire 
	 */
	public boolean derouleDuCombat (pokemonS) {
			boolean victoire = false ;
			int i = 0 ;
			Pokemon pokemonD = changerPok(nouveaupokemon) ; //le joueur choisit un de ses pokemons
			while (hpS > 0 && hpD > 0) { //tant qu'il reste des vies aux deux pokémons, la boucle tourne
				if (i%2 == 0) {		 //c'est au joueur de commencer à jouer
				switch (TypeAttaque) { 
					case ELEMENT :
						attaque (true, pokemonD, pokemonS);
					case NEUTRE :
						attaque (false, pokemonD, pokemonS);
					case FUITE :
						break ;
					case CHANGERDEPOKEMON :
						nouveaupokemon = cliquerSurPokemon ;
						changerPok(nouveaupokemon) ;
					}
				else {	//c'est au tour du pokémon sauvage
					if (Math.random() > 0.5) { //l'attaque est aléatoire avec une proba de 50%
						attaque(false, pokemonS, pokemonD) ; }

					else {
						attaque(true, pokemonS, pokemonD) ; }
				}
				i ++ ; 
			}
			if (hpS <= 0) { //si les vies du pokémon sauvage sont inférieures ou égales à 0 :
				victoire = true ; //la victoire est pour le joueur,
				pokemonS.setisSauvage(false); //le pokémon est capturé,
				pokemonS.setCoord(null); //ses coordonnées sont nulles.
			}
			else {
				victoire = false
			}
			return victoire ;
		}

	
	/**
	 * Demande au joueur de choisir le pokémon à attaquer et le pokémon défenseur 
	 * et renvoie le résultat du combat
	 * @return boolean resultat
	 */
	public String lancerLeCombat() {
		System.out.println("Quel Pokémon voulez-vous attaquer?");
		Pokemon pokemonS = choisirPokemonS();
		String resultat = new String ();
		if (derouleDuCombat(pokemonS) = true) { 
			resultat += "Vous avez gagné! Le pokémon a été capturé";
		}
		else {
			resultat += "Oups, vous avez perdu le combat!";
		}
		return resultat;
	}
	
	/**
	 * Permet à l'utilisateur de choisir le pokémon qu'il veut combattre dans la liste des pokémons proches de lui
	 * @return
	 */
	public Pokemon choisirPokemonS() {
		ArrayList<PokemonDuJeu> PokProches = cliquerSurCarte();
		System.out.println("Proche de vous il y a: " + PokProches);
		Pokemon PokS = ActionListener(PokProches);
		return PokS;
	}
	}
}