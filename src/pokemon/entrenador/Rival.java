package src.pokemon.entrenador;

import java.util.LinkedList;

import src.pokemon.Pokemon;

public class Rival extends Entrenador {

    public Rival(String paramNombre) {
        super(paramNombre);

    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return super.getNombre();
    }

    @Override
    public int getPokedollar() {
        return super.getPokedollar();
    }

    @Override
    public LinkedList<Pokemon> getPokemon() {
        return super.getPokemon();
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

}
