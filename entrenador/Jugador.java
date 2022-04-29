package entrenador;

import pokemon.Pokemon;

public class Jugador extends Entrenador{

    private Pokemon teamJugador;
    private Pokemon teamSecJugador;

    Jugador(String paramNombre) {
        super(paramNombre);
        //TODO Auto-generated constructor stub
    }
    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return super.getNombre();
    }
    @Override
    public int getPokedollar() {
        // TODO Auto-generated method stub
        return super.getPokedollar();
    }
    @Override
    public Pokemon getTeam() {
        // TODO Auto-generated method stub
        return super.getTeam();
    }
    @Override
    public Pokemon getTeamSec() {
        // TODO Auto-generated method stub
        return super.getTeamSec();
    }
    public Pokemon getTeamJugador() {
        return teamJugador;
    }
    public Pokemon getTeamSecJugador() {
        return teamSecJugador;
    }

    
}
