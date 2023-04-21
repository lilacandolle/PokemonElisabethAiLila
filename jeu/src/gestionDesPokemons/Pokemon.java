package gestionDesPokemons;

public class Pokemon {
	
	private String nom;
	private Famille famille;
	private int HP;
	
	public Pokemon(String nom, Famille famille, int HP) {
		this.nom = nom;
		this.famille = famille;
		this.HP = HP;
	}
	
	public String getNom() { return this.nom;}
	public Famille getFamille() {return this.famille;}
	public int getHP() {return this.HP;}
	
}