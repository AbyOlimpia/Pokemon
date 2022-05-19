package src.pokemon.main;

import java.util.LinkedList;

import src.pokemon.ListaMov;
import src.pokemon.Movimiento;
import src.pokemon.Pokemon;
import src.pokemon.Tipo;
import src.pokemon.entrenador.Entrenador;
import src.pokemon.entrenador.Jugador;

public class Main {
    public static void main(String[] args) {

        String arrayMov[] = { "látigo", "rugido", "arañazo", "placaje" };

        Jugador j1 = new Jugador("AAA");
        Pokemon p1 = new Pokemon("Articuno", 1, Tipo.FUEGO, 0, null);
        Pokemon p2 = new Pokemon("Raichu", 1, Tipo.AGUA, 0, null);

        ListaMov.inicializarListasDeMovimientos();

        LinkedList<Movimiento> listaMovimientosPkmnJugador = new LinkedList<>();
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomAtaque());
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomAtaque());
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomAtaque());
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomMejora());

        p1.setMovimientos(listaMovimientosPkmnJugador);

        p1.mostrarMov(listaMovimientosPkmnJugador);
        // j1.moverPokemon(//array pokemons);

    }
}