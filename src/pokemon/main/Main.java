package src.pokemon.main;

import java.util.LinkedList;
import src.pokemon.ListaMov;
import src.pokemon.Movimiento;
import src.pokemon.Pokedex;
import src.pokemon.Pokemon;
import src.pokemon.Tipo;
import src.pokemon.entrenador.Jugador;
import src.pokemon.entrenador.Rival;

public class Main {
    public static void main(String[] args) {

        Jugador j1 = new Jugador("Jugador");
        Rival j2 = new Rival("Rival");
        Pokemon p1 = new Pokemon("Articuno", 1, Tipo.FUEGO, 0, 10);
        Pokemon p2 = new Pokemon("Raichu", 1, Tipo.AGUA, 0, 5);

        Pokedex.inicializarPokedex();
        LinkedList<Pokemon> listaPokemonJugador = new LinkedList<>();
        LinkedList<Pokemon> listaPokemonRival = new LinkedList<>();
        listaPokemonJugador.add(Pokedex.devolverPokemonRandom());
        listaPokemonJugador.add(Pokedex.devolverPokemonRandom());
        listaPokemonJugador.add(Pokedex.devolverPokemonRandom());
        listaPokemonJugador.add(Pokedex.devolverPokemonRandom());
        listaPokemonRival.add(Pokedex.devolverPokemonRandom());
        listaPokemonRival.add(Pokedex.devolverPokemonRandom());
        listaPokemonRival.add(Pokedex.devolverPokemonRandom());
        listaPokemonRival.add(Pokedex.devolverPokemonRandom());
        j1.setPokemon(listaPokemonJugador);
        j2.setPokemon(listaPokemonRival);
        j1.mostrarPokemon(listaPokemonJugador);

        ListaMov.inicializarListasDeMovimientos();
        LinkedList<Movimiento> listaMovimientosPkmnJugador = new LinkedList<>();
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomAtaque());
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomAtaque());
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomMejora());
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomMejora());
        p1.setMovimientos(listaMovimientosPkmnJugador);
        p1.mostrarMov(listaMovimientosPkmnJugador);

    }

}