package gestionDesPokemons;
import java.util.Random ;

public class PokemonDuJeu {
	
	private Pokemon pokemon;
	private Coordinate Coord;
	private Boolean isSauvage;
	private Random rand = new Random();
	
	public PokemonDuJeu(Pokemon pokemon, Boolean isSauvage) {
		this.pokemon = pokemon;
		this.Coord = genereCoord();
		this.isSauvage = isSauvage;
	}

	public Coordinate genereCoord() {
		int x = rand.nextInt(1000);
		int y = rand.nextInt(800);
		return new Coordinate(x, y);
	}

	//get pokemon
	public Pokemon getPokemon() {return this.pokemon;}
	public String getNomPokemon() {return this.pokemon.getNom();}
	public Coordinate getCoord() {return this.Coord;}
	public Boolean getisSauvage() {return this.isSauvage;}
	
	public void setCoord(int x, int y) {
		this.Coord = new Coordinate(x, y);
	}

	public void setCoord(Coordinate coord) {
		this.Coord = coord;
	}
	
	public void setisSauvage (Boolean issauvage) {
		this.isSauvage = issauvage;
	}
	

}
