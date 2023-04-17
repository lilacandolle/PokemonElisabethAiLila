package gestionDesPokemons;

public class PokemonDuJeu {
	
	private Pokemon pokemon;
	private int id;
	private Coordinate Coord;
	private Boolean isSauvage;
	
	private PokemonDuJeu(Pokemon pokemon, int id, Coordinate Coord, Boolean isSauvage) {
		this.pokemon = pokemon;
		this.id = id;
		this.Coord = Coord;
		this.isSauvage = isSauvage;
	}
	
	public String getNomPokemon() {return this.pokemon.getNom();}
	public int getid() {return this.id;}
	public Coordinate getCoord() {return this.Coord;}
	public Boolean getisSauvage() {return this.isSauvage;}
	
	private Coordinate setCoord(Coordinate coord) {
		this.Coord = coord;
	}
	
	private Boolean setisSauvage(Boolean issauvage) {
		this.isSauvage = issauvage;
	}
	

}
