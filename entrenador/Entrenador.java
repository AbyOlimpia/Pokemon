package entrenador;

import pokemon.Pokemon;

public class Entrenador {
    private Pokemon[] team;
    private Pokemon[] teamSec;
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

    public Pokemon[] getTeam() {
        return team;
    }

    public Pokemon[] getTeamSec() {
        return teamSec;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPokedollar(int pokedollar) {
        this.pokedollar = pokedollar;
    }

    public void setTeam(Pokemon[] team) {
        this.team = team;
    }

    public void setTeamSec(Pokemon[] teamSec) {
        this.teamSec = teamSec;

    }

}
