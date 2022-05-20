package src.pokemon.entrenador;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Scanner;

import src.pokemon.Pokemon;

public class Jugador extends Entrenador {

    public Jugador(String paramNombre) {
        super(paramNombre);

    }

    @Override
    public LinkedList<Pokemon> getPokemon() {
        return super.getPokemon();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getPokedollar() {
        return super.getPokedollar();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setPokedollar(int pokedollar) {
        super.setPokedollar(pokedollar);
    }

    @Override
    public void setPokemon(LinkedList<Pokemon> pokemon) {
        super.setPokemon(pokemon);
    }

    /*
     * public void moverPokemon( List<Pokemon> equipoJugador){
     * List<Pokemon> cajaPokemon = new ArrayList<>();
     * Scanner s = new Scanner(System.in);
     * System.out.println("Cuál Pokimon quieres cambiar?: ");
     * int numPokemon = s.nextInt();
     * if(numPokemon == 0){
     * Collections.swap(equipoJugador, 0, 3);
     * }
     * else if(numPokemon==1){
     * Collections.swap(equipoJugador, 1, 2);
     * }
     * else if(numPokemon==2){
     * Collections.swap(equipoJugador, 2, 1);
     * }
     * else if(numPokemon==3){
     * Collection.swap(equipoJugador, 3, 0);
     * }
     * 
     * System.out.println("Ahora tu equipo de Pokimons es: "+equipoJugador);
     * 
     * }
     */
    /**
     * Método para mover un Pokemon a otra caja pasando como parámetro un Array
     * 
     * @param equipoJugador
     */
    public void moverPokemon(Array[] equipoJugador) {
        Array[] cajaPokemon = new Array[4];
        Scanner s = new Scanner(System.in);
        System.out.println("Cuál Pokimon quieres cambiar?: ");
        int numPokemon = s.nextInt();
        if (numPokemon == 0) {
            equipoJugador[0] = cajaPokemon[0];
        } else if (numPokemon == 1) {
            equipoJugador[1] = cajaPokemon[1];
        } else if (numPokemon == 2) {
            equipoJugador[2] = cajaPokemon[2];
        } else if (numPokemon == 3) {
            equipoJugador[3] = cajaPokemon[3];
        }

    }

    public String toString() {
        return "Nombre Jugador = " + getNombre() + ", Pokemons del entrenador: " + getPokemon();
    }

    /**
     * Método para mostrar la lista de Pokemon, mediante un bucle for
     * 
     * @param list
     */
    public void mostrarPokemon(LinkedList<Pokemon> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNombre());

        }

    }

}
