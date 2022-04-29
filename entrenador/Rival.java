package entrenador;

import pokemon.Pokemon;

public class Rival extends Entrenador {
    Rival(String paramNombre) {
        super(paramNombre);
        // TODO Auto-generated constructor stub
    }

    private Pokemon teamRi;

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

    public Pokemon getTeamRi() {
        return teamRi;
    }

}
