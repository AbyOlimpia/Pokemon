package src.pokemon.entrenador;

import java.util.LinkedList;

/**
 * @author @AbyOlimpia @AlexCesur
 */
import src.pokemon.Pokemon;

public class Entrenador {
    private String nombre;
    private int pokedollar;
    //private LinkedList<Pokedex> pokemon;

    Entrenador(String paramNombre) {
        this.nombre = paramNombre;

    }

    public String getNombre() {
        return nombre;
    }

    public int getPokedollar() {
        return pokedollar;
    }

    /**
     * Con este método mejoramos la defensa, la defensa especial y la vitalidad
     * Con un coste de (20 * el nivel del pokemon a mejorar) Pokedóllares
     * 
     * @param pokemon
     */
    public void entrenamientoPesado(Pokemon pokemon) {
        pokedollar = pokedollar - 20 * pokemon.getNivel();
        pokemon.setDefensaSp(pokemon.getDefensaSp() + 5);
        pokemon.setDefensa(pokemon.getDefensa() + 5);
        pokemon.setVitalidad(pokemon.getVitalidad() + 5);
    }

    /**
     * Con este método mejoramos el ataque, el ataque especial y la vitalidad
     * Con un coste de (30 * el nivel del pokemon a mejorar) Pokedóllares
     * 
     * @param pokemon
     */
    public void entrenamientoFurioso(Pokemon pokemon) {
        pokedollar = pokedollar - 30 * pokemon.getNivel();
        pokemon.setAtaque(pokemon.getAtaque() + 5);
        pokemon.setAtaqueSp(pokemon.getAtaqueSp() + 5);
        pokemon.setVitalidad(pokemon.getVitalidad() + 5);
    }

}
