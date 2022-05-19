package src.pokemon;

/**
 * @author @AbyOlimpia @AlexCesur
 */
public class MovimientoEstado extends Movimiento {

    private Estado estado;
    private int numTurnos;

    /**
     * Constructor heredado de movimiento para saber el nombre, el tipo y el consumo
     * de estamina
     * 
     * @param nombreMov
     * @param tipoMov
     * @param potenciaAtac
     * @param consumEstamina
     */
    MovimientoEstado(String nombreMov, Tipo tipoMov, int consumEstamina) {
        super(nombreMov, tipoMov, consumEstamina);
    }

    @Override
    public int getConsumEstamina() {

        return super.getConsumEstamina();
    }

    @Override
    public String[] getArrayMov() {
        return super.getArrayMov();
    }

    @Override
    public String getNombreMov() {
        return super.getNombreMov();
    }

    @Override
    public Tipo getTipoMov() {
        return super.getTipoMov();
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
    public void setArrayMov(String[] arrayMov) {
        super.setArrayMov(arrayMov);
    }

    @Override
    public void setConsumEstamina(int consumEstamina) {
        super.setConsumEstamina(consumEstamina);
    }

    @Override
    public void setNombreMov(String nombreMov) {
        super.setNombreMov(nombreMov);
    }

    @Override
    public void setTipoMov(Tipo tipoMov) {
        super.setTipoMov(tipoMov);
    }

    /*
     * @Override
     * public void aplicarMovimiento(Pokemon pokemon) {
     * 
     * }
     */

}