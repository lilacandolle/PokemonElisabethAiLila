package gestionDesPokemons;

public class PokemonDuJeu {
	
	private Pokemon pokemon;
	private int id;
	private Coordinate Coord;
	private Boolean isSauvage;
	
	public PokemonDuJeu(Pokemon pokemon, int id, Coordinate Coord, Boolean isSauvage) {
		this.pokemon = pokemon;
		this.id = id;
		this.Coord = Coord;
		this.isSauvage = isSauvage;
	}
	//get pokemon
	public Pokemon getPokemon() {return this.pokemon;}
	public String getNomPokemon() {return this.pokemon.getNom();}
	public int getid() {return this.id;}
	public Coordinate getCoord() {return this.Coord;}
	public Boolean getisSauvage() {return this.isSauvage;}
	
	public void setCoord(int x, int y) {
		this.Coord = new Coordinate(x, y);
	}
	
	public void setisSauvage (Boolean issauvage) {
		this.isSauvage = issauvage;
	}
	

}
