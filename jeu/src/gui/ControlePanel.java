package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import gestionDesPokemons.TypeAttaque;

/**
 * Exemple de panneau contenant un bouton avec un évènement sur un autre panneau 
 * qui est passé en paramètre dans le constructeur.
 * 
 *
 */
public class ControlePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public ControlePanel(CartePanel cartePanel) {
		
		this.setSize(1000, 800);
		
		// On construit un bouton
		JButton clic = new JButton("Clic ici");
		clic.setBounds(50, 50, 20, 100);
		this.add(clic);  
		clic.setVisible(true);
		
		// On ajoute un évènement sur le bouton
		clic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartePanel.ajoutMessage("Ici, hello !");
			}
		});

		//des bouttons pour choisir les actions
		JButton attaqueElement = new JButton("attaque élément", null) ;
		attaqueElement.setBounds(50, 50, 20, 100);
		this.add(attaqueElement) ;
		attaqueElement.setVisible(true);
		attaqueElement.addActionListener(new ActionListener() {
			TypeAttaque = ELEMENT ;
		});

		//on ajoute une méthode qui permet de récupérer les coordonnées d'un clic sur la carte et les retourne sous forme d'un tableau d'entiers
		cartePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int[] coord = new int[2];
				coord[0] = e.getX();
				coord[1] = e.getY();
				cartePanel.ajoutMessage("Coordonnées du clic : " + coord[0] + " " + coord[1]);
			}
		});





	}
	
}
