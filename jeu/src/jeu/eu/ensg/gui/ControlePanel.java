package jeu.eu.ensg.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Exemple de panneau contenant un bouton avec un évènement sur un autre panneau 
 * qui est passé en paramètre dans le constructeur.
 * 
 *
 */
public class ControlePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public ControlePanel(CartePanel cartePanel) {
		
		this.setSize(1000, 200);
		
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

	}
	
}
