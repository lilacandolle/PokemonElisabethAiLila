

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Main.*;
import gestionDesPokemons.*;
import gui.*;
import gui.CartePanel;
import gui.ControlePanel;
import gui.FichePanel;

/**
 * Lancement de l'application graphique
 * 
 * @author Marie-Dominique
 *
 */
public class MainApplication {

	/**
	 * Méthode main pour lancer le programme.
	 * @param args
	 */
	public static void main(String[] args) {
		List<Pokemon> Pokemons = ChargerPoke.loadPokemon();
		ArrayList<PokemonDuJeu> listePokemonDuJeu = new ArrayList<PokemonDuJeu>();
		for (int i=0; i<=7; i++) {
			for (int j=0; j<Pokemons.size(); j++){
				Pokemon pokemon = Pokemons.get(j);
				PokemonDuJeu pok = new PokemonDuJeu(pokemon, true);
				listePokemonDuJeu.add(pok);
			}
		}
		Jeu_general.creerMDJ(listePokemonDuJeu, 5);
		// Look and Feel dépend de l'OS.
		try {
			String os = System.getProperty("os.name").toLowerCase();
			
			// For windows os
			if (os.contains("windows")) {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			}
			// For linux os
			if ((os.contains("linux")) || (os.contains("unix"))) {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			}
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		final JFrame fen = new JFrame();
		fen.setSize(1000, 800);

		// just a JPanel extension, add to any swing/awt container
		final CartePanel mapPanel = new CartePanel(); 

		fen.setLayout(new BorderLayout());
		
		fen.add(BorderLayout.CENTER, mapPanel);
		fen.add(BorderLayout.EAST, new FichePanel());
		fen.add(BorderLayout.SOUTH, new ControlePanel(mapPanel));
		
		
		fen.setLocationRelativeTo(null);
		fen.setResizable(false);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setTitle("Jeu Pokémon");

		fen.setVisible(true);
	}

}
