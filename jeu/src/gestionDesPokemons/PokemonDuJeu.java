package gestionDesPokemons;
import java.util.Random ;

public class PokemonDuJeu {
	
	private Pokemon pokemon; //les Pokemon du jeu sont des types de Pokemon
	private Coordinate Coord; //les Pokemon du jeu ont des coordonnées, sauf s'ils ont été capturés
	private Boolean isSauvage; //les Pokemon du jeu peuvent être sauvages ou avoir été capturés
	
	// Constructeur
	public PokemonDuJeu(Pokemon pokemon, Coordinate Coord, Boolean isSauvage) {

		this.pokemon = pokemon;
		this.Coord = Coord;

		this.isSauvage = isSauvage;
	}
  
  // Génère des coordonnées aléatoires
	public Coordinate genereCoord() {
		int x = rand.nextInt(1000);
		int y = rand.nextInt(800);
		return new Coordinate(x, y);
	}

	// Getters des Pokemon du jeu
	public Pokemon getPokemon() {return this.pokemon;}
	public String getNomPokemon() {return this.pokemon.getNom();}
	public Coordinate getCoord() {return this.Coord;}
	public Boolean getisSauvage() {return this.isSauvage;}
	
	// Setters des Pokemon du jeu
	public void setCoord(int x, int y) {
		this.Coord = new Coordinate(x, y);
	}
	public void setisSauvage (Boolean issauvage) {
		this.isSauvage = issauvage;
	}
	

}
