package gestionDesPokemons;

public class Pokemon {
	
	private String nom;
	private Famille famille;
	private int HP;
	
	private Pokemon(String nom, Famille famille, int HP) {
		this.nom = nom;
		this.famille = famille;
		this.HP = HP;
	}
	
	public String getNom() { return this.nom;}
	public String getFamille() {return this.famille;}
	public int getHP() {return this.HP;}
	
}
