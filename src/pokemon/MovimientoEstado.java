package src.pokemon;

public class MovimientoEstado extends Movimiento {
    private Estado estado;
    private int numTurnos;

    @Override
    public int getConsumEstamina() {

        return super.getConsumEstamina();
    }

    @Override
    public Tipo getTipo() {

        return super.getTipo();

    }

    public Estado getEstado() {
        return estado;
    }

    public int getNumTurnos() {
        return numTurnos;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setNumTurnos(int numTurnos) {
        this.numTurnos = numTurnos;
    }

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {

    }

}