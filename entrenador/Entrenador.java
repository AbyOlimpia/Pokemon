package entrenador;

import src.pokemon.Pokemon;

public class Entrenador {
    private Pokemon team;
    private Pokemon teamSec;
    private String nombre;
    private int pokedollar;

    Entrenador(String paramNombre) {
        this.nombre = paramNombre;

    }

    public String getNombre() {
        return nombre;
    }

    public int getPokedollar() {
        return pokedollar;
    }

    public Pokemon getTeam() {
        return team;
    }

    public Pokemon getTeamSec() {
        return teamSec;
    }

    // prueba2
}
