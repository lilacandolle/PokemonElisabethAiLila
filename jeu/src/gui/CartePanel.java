package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JPanel;

import gestionDesPokemons.PokemonDuJeu;

/**
 * Exemple de panneau contenant un espace où on peut dessiner.
 * 
 *
 */
public class CartePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private List<PokemonDuJeu> pokes;

	/**
	 * Constructeur.
	 */
	public CartePanel(List<PokemonDuJeu> pokes) {
		this.pokes = pokes;
	}

	

	/**
	 * Méthodes de dessin appelée après le constructeur
	 * ou quand on appelle la méthode repaint
	 */
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		// On dessine 10 points bleus
		for (PokemonDuJeu poke : pokes) {
			g2D.setPaint(Color.red);
			g.fillOval(poke.getCoord().getX(), poke.getCoord().getY(), 10, 10);
		}
		
		if (!this.message.equals("")) {
			g2D.setColor(Color.RED);
			g2D.setFont(new Font("TimesRoman", Font.PLAIN, 36)); 
			g.drawString(message, 250, 50);
		}
	}
	
	private String message = "";
	
	public void ajoutMessage(String message) {
		this.message = message;
		this.repaint();
	}
	
}
