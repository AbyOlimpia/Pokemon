package src.pokemon.main;

import src.pokemon.Movimiento;
import src.pokemon.Pokemon;
import src.pokemon.Tipo;

public class Main {
    public static void main(String[] args) {

        String arrayMov[] = { "látigo", "rugido", "arañazo", "placaje" };

        Pokemon p1 = new Pokemon("Alejandro", 1, Tipo.FUEGO, 0);
        Pokemon p2 = new Pokemon("Raichu", 1, Tipo.AGUA, 0);

        System.out.println(p1.comprobarTipos(p2)); 
        //System.out.println(p1.atacar(p2, p1.comprobarTipos(p2)));
        // p1.atacar(p2, arrayMov[1]);

    }

}
