package gestionDesPokemons;
import java.util.Random ;

public class PokemonDuJeu {
	
	private Pokemon pokemon;
	private int id;
	private Coordinate Coord;
	private Boolean isSauvage;
	
	public PokemonDuJeu(Pokemon pokemon, int id, Boolean isSauvage) {
		this.pokemon = pokemon;
		this.id = id;
		this.Coord = genereCoord();
		this.isSauvage = isSauvage;
	}

	public Coordinate genereCoord() {
		Random r1 = new Random();
		Random r2 = new Random();
		int x = r1.nextInt(1000);
		int y = r2.nextInt(800);
		Coordinate coord_Pok = new Coordinate(x, y);
		return coord_Pok;
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
