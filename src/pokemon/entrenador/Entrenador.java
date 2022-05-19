package src.pokemon.entrenador;

import java.util.LinkedList;

import src.pokemon.Pokemon;

public class Entrenador {
    private String nombre;
    private int pokedollar;
    private LinkedList<Pokedex> pokemon;

    public Entrenador(String paramNombre) {
        this.nombre=paramNombre;

    }

    public String getNombre() {
        return nombre;
    }

    public int getPokedollar() {
        return pokedollar;
    }

    //prueba2
}
