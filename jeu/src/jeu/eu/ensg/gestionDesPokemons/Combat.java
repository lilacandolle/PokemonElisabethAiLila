package gestionDesPokemons ;

public class Combat {
    private Pokemon pokemonS = //pokemon choisit par le joueur ;
    private Pokemon pokemonD ;
    private int hpS = pokemonS.getHP() ;
    private int hpD = pokemonD.getHP() ;
    
    public changerPok() {
        pokemonD = clique(pokemonMDJ) ;
    }

    public attaque(typAtk, Pokemon PA, Pokemon DD) {
        Famille famA = getFamille(PA) ;
        Famille famD = getFamille(PD) ;
        if typAtk
    }

    public fuite() {
        //quitte le combat
    }

    public static void main(String[] args) {
        
        public int i = 0 ;
        changerPok()

        while (hpS>0 && hpD>0) {

            if (i % 2 = 0) {
                PA = pokemonD ;
                DD = PokemonS ;

                //Le joueur clique sur une option
                if (clique = fuite) {
                    fuite()
                }

                if (clique = attaque_neutre) {
                    attaque(neutre, PA, DD)
                }

                if (clique = attaque_element) {
                    attaque(element, PA, DD)
                }

                if (clique = changerPok) {
                    changerPok()
                }
            }

            else {
                PA = pokemonS ;
                DD = pokemonD ;
                if (random > 0.5) {
                    attaque(neutre, PA, DD)
                }
                else {
                    attaque(element, PA, DD)
                }
            }

            i += 1
        }
    }
}