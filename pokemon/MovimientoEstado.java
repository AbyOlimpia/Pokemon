package pokemon;

public class MovimientoEstado extends Movimiento {
    private Estado estado;
    private int numTurnos;
    private int dañoQuemadura;

    @Override
    public int getConsumEstamina() {
        // TODO Auto-generated method stub
        return super.getConsumEstamina();
    }

    @Override
    public Tipo getTipo() {
        // TODO Auto-generated method stub
        return super.getTipo();
    }

    public int getDañoQuemadura() {
        return dañoQuemadura;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getNumTurnos() {
        return numTurnos;
    }

}
