package Main ;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import gestionDesPokemons.Famille;
import gestionDesPokemons.Pokemon;

public class ChargerPoke {
    
    public static void main(String[] args) {

        String csvFile = "/Users/lila.cassan/Desktop/PokemonElisabethAiLila/data/pokemon_first_gen.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] headers = reader.readNext(); // ignorer la première ligne qui contient les en-têtes

            List<Pokemon> pokemons = new ArrayList<>();

            Object[] line;
            while ((line = reader.readNext()) != null) {
                String nom = (String) line[0];
                Famille famille = (Famille.fromString((String) line[1]));
                int HP = (int)line[4];

                Pokemon pokemon = new Pokemon(nom, famille, HP);
                pokemons.add(pokemon);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}