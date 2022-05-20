package src.pokemon.main;

import java.util.LinkedList;
import src.pokemon.ListaMov;
import src.pokemon.Movimiento;
import src.pokemon.Pokemon;
import src.pokemon.Tipo;
import src.pokemon.entrenador.Jugador;

public class Main {
    public static void main(String[] args) {
        
        //creacion de switch()


        Jugador j1 = new Jugador("ª");
        Pokemon p1 = new Pokemon("Articuno", 1, Tipo.FUEGO, 0, 10,null);
        Pokemon p2 = new Pokemon("Raichu", 1, Tipo.AGUA, 0, 5, null);

        ListaMov.inicializarListasDeMovimientos();

        LinkedList<Movimiento> listaMovimientosPkmnJugador = new LinkedList<>();
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomAtaque());
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomAtaque());
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomMejora());
        listaMovimientosPkmnJugador.add(ListaMov.devolverMovimientoRandomMejora());

        p1.setMovimientos(listaMovimientosPkmnJugador);

        p1.mostrarMov(listaMovimientosPkmnJugador);
        // j1.moverPokemon(//array pokemons);
        System.out.println(ListaMov.devolverListaMejora().get(0).getNombreMov());
        
        System.out.println(p1.toString());
        //p1.setEstados(ListaMov.movimientosEstado);
        System.out.println(p2.getVitalidad());

        //p1.atacar(p2, listaMovimientosPkmnJugador);
        System.out.println(p2.getVitalidad());

        //p1.atacar(p2, 0);
        
        
        
       /* System.out.println();
        System.out.println(p1.getAtaque());*/
        
    }
}