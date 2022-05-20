package src.pokemon.entrenador;

import java.util.LinkedList;

import src.pokemon.Pokedex;
/**
 * @author @AbyOlimpia @AlexCesur
 */
import src.pokemon.Pokemon;

public class Entrenador {
    private String nombre;
    private int pokedollar;
    private LinkedList<Pokemon> pokemon;

    Entrenador(String paramNombre) {
        this.nombre = paramNombre;
        pokemon = new LinkedList<>();
        pokemon.add(Pokedex.devolverPokemonRandom());
        pokemon.add(Pokedex.devolverPokemonRandom());
        pokemon.add(Pokedex.devolverPokemonRandom());
        pokemon.add(Pokedex.devolverPokemonRandom());

    }

    public String getNombre() {
        return nombre;
    }

    public int getPokedollar() {
        return pokedollar;
    }

    public LinkedList<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPokedollar(int pokedollar) {
        this.pokedollar = pokedollar;
    }

    public void setPokemon(LinkedList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * Método para mejorar la defensa, la defensa especial y la vitalidad
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
     * Método para mejorar el ataque, el ataque especial y la velocidad
     * Con un coste de (30 * el nivel del pokemon a mejorar) Pokedóllares
     * 
     * @param pokemon
     */
    public void entrenamientoFurioso(Pokemon pokemon) {
        pokedollar = pokedollar - 30 * pokemon.getNivel();
        pokemon.setAtaque(pokemon.getAtaque() + 5);
        pokemon.setAtaqueSp(pokemon.getAtaqueSp() + 5);
        pokemon.setVelocidad(pokemon.getVelocidad() + 5);
    }

    /**
     * Método para mejorar la velocidad, el ataque, la defensa y la vitalidad
     * Con un coste de (40 * el nivel del pokemon a mejorar) Pokedóllares
     * 
     * @param pokemon
     */

    public void entrenamientoFuncional(Pokemon pokemon) {
        pokedollar = pokedollar - 40 * pokemon.getNivel();
        pokemon.setVelocidad(pokemon.getVelocidad() + 5);
        pokemon.setAtaque(pokemon.getAtaque() + 5);
        pokemon.setDefensa(pokemon.getDefensa() + 5);
        pokemon.setVitalidad(pokemon.getVitalidad() + 5);
    }

    /**
     * Método para mejorar la velocidad, el ataque especial, la defensa
     * especial y la vitalidad
     * Con un coste de (40 * el nivel del pokemon a mejorar) Pokedóllares
     * 
     * @param pokemon
     */

    public void entrenamientoOnirico(Pokemon pokemon) {
        pokedollar = pokedollar - 40 * pokemon.getNivel();
        pokemon.setVelocidad(pokemon.getVelocidad() + 5);
        pokemon.setAtaqueSp(pokemon.getAtaqueSp() + 5);
        pokemon.setDefensaSp(pokemon.getDefensaSp() + 5);
        pokemon.setVitalidad(pokemon.getVitalidad() + 5);
    }

}
