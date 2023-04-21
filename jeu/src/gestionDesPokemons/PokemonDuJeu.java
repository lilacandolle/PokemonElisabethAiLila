package gestionDesPokemons;

public class PokemonDuJeu {
	
	private Pokemon pokemon;
	private Coordinate Coord;
	private Boolean isSauvage;
	
	public PokemonDuJeu(Pokemon pokemon, Coordinate Coord, Boolean isSauvage) {
		this.pokemon = pokemon;
		this.Coord = Coord;
		this.isSauvage = isSauvage;
	}
	//get pokemon
	public Pokemon getPokemon() {return this.pokemon;}
	public String getNomPokemon() {return this.pokemon.getNom();}
	public Coordinate getCoord() {return this.Coord;}
	public Boolean getisSauvage() {return this.isSauvage;}
	
	public void setCoord(int x, int y) {
		this.Coord = new Coordinate(x, y);
	}
	
	public void setisSauvage (Boolean issauvage) {
		this.isSauvage = issauvage;
	}
	

}
