package entrenador;

import pokemon.Pokemon;

public class Jugador extends Entrenador{

    private int[] almacenamiento;


    Jugador(String paramNombre) {
        super(paramNombre);
        
    }
    @Override
    public Pokemon[] getTeam() {
        // TODO Auto-generated method stub
        return super.getTeam();
    }
    @Override
    public Pokemon[] getTeamSec() {
        // TODO Auto-generated method stub
        return super.getTeamSec();
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
    public int[] getAlmacenamiento() {
        return almacenamiento;
    }
}
