package src.pokemon.entrenador;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import src.pokemon.Pokemon;

public class Jugador extends Entrenador{

    public Jugador(String paramNombre) {
        super(paramNombre);
        
    }
    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return super.getNombre();
    }@Override
    public int getPokedollar() {
        // TODO Auto-generated method stub
        return super.getPokedollar();
    }

    /*public void moverPokemon( List<Pokemon> equipoJugador){
        List<Pokemon> cajaPokemon = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Cuál Pokimon quieres cambiar?: ");
        int numPokemon = s.nextInt();
        if(numPokemon == 0){
            Collections.swap(equipoJugador, 0, 3);
        }
        else if(numPokemon==1){
            Collections.swap(equipoJugador, 1, 2);
        }
        else if(numPokemon==2){
            Collections.swap(equipoJugador, 2, 1);
        }
        else if(numPokemon==3){
            Collection.swap(equipoJugador, 3, 0);
        }

        System.out.println("Ahora tu equipo de Pokimons es: "+equipoJugador);

    }*/
    public void moverPokemon( Array[] equipoJugador){
        Array[] cajaPokemon = new Array[4];
        Scanner s = new Scanner(System.in);
        System.out.println("Cuál Pokimon quieres cambiar?: ");
        int numPokemon = s.nextInt();
        if(numPokemon == 0){
            equipoJugador[0] =cajaPokemon[0];
        }
        else if(numPokemon==1){
            equipoJugador[1]=cajaPokemon[1];
        }
        else if(numPokemon==2){
            equipoJugador[2]=cajaPokemon[2];
        }
        else if(numPokemon==3){
            equipoJugador[3]=cajaPokemon[3];
        }
        
    

    }
    
    
}
