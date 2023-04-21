package Main;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import gestionDesPokemons.Famille;
import gestionDesPokemons.Pokemon;
 
public class ChargerPoke{
    private ChargerPoke() {
    }
 
    public static void loadPokemon() {
 
        String csvFile = "data/pokemon_first_gen.csv";
 
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line = reader.readLine(); // ignorer la première ligne qui contient les en-têtes
            String[] headers = line.split(",");
 
            List<Pokemon> pokemons = new ArrayList<>();
 
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                String nom = values[0];
                Famille famille = Famille.fromString(values[1]);
                int HP = Integer.parseInt(values[4]);
 
                Pokemon pokemon = new Pokemon(nom, famille, HP);
                pokemons.add(pokemon);
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}