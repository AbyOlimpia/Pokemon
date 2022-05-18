package src.pokemon.main;

import java.util.LinkedList;

import src.pokemon.ListaMov;
import src.pokemon.Movimiento;
import src.pokemon.Pokemon;
import src.pokemon.Tipo;

public class Main {
    public static void main(String[] args) {

        String arrayMov[] = { "látigo", "rugido", "arañazo", "placaje" };

        Pokemon p1 = new Pokemon("Alejandro", 1, Tipo.FUEGO, 0);
        Pokemon p2 = new Pokemon("Raichu", 1, Tipo.AGUA, 0);

        ListaMov.inicializarListasDeMovimientos();

        LinkedList<Movimiento> listaMovimientosPkmnJugador = new LinkedList<>();
        listaMovimientosPkmnJugador.add(ListaMov.devolverListaAtaques().get());

        p1.setMovimientos(listaMovimientosPkmnJugador);

      

    }
}
