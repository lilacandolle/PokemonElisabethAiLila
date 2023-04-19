package Main ;

public class chargerPoke {

        public static void main(String[] args) {

            String pathFile = "/PokemonElisabethAiLila/data/pokemon_first_gen.csv" ;
            String line = " " ;

            try {
                BufferedReader br = new BufferedReader(new FileReader(pathFile)) ;
                while((line = br.readLine()) != null)
                    System.out.println(line) ;
                System.out.println("File found") ;
            }
            catch (FileNotFoundException e) {
                e.printStackTrace() ;
                System.out.println("File not found");
            }
            catch (IOException e) {
                e.printStackTrace() ;
            }
        }
}