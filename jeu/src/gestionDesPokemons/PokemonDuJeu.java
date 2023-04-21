package gestionDesPokemons;

public class PokemonDuJeu {
	
	private Pokemon pokemon; //les Pokemon du jeu sont des types de Pokemon
	private int id;
	private Coordinate Coord; //les Pokemon du jeu ont des coordonnées, sauf s'ils ont été capturés
	private Boolean isSauvage; //les Pokemon du jeu peuvent être sauvages ou avoir été capturés
	
	// Constructeur
	public PokemonDuJeu(Pokemon pokemon, int id, Coordinate Coord, Boolean isSauvage) {
		this.pokemon = pokemon;
		this.id = id;
		this.Coord = Coord;
		this.isSauvage = isSauvage;
	}
	// Getters des Pokemon du jeu
	public Pokemon getPokemon() {return this.pokemon;}
	public String getNomPokemon() {return this.pokemon.getNom();}
	public int getid() {return this.id;}
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
