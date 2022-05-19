package src.pokemon;

/**
 * @author @AbyOlimpia @AlexCesur
 */
public class MejoraVel extends Movimiento {

    /**
     * Constructor que hereda de Movimiento, con el nombre del movimiento, el tipo y
     * el consumo de estamina
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     */
    MejoraVel(String nombreMov, Tipo tipoMov, int consumEstamina) {
        super(nombreMov, tipoMov, consumEstamina);
    }

    /**
     * setters y getters
     */
    @Override
    public String[] getArrayMov() {
        // TODO Auto-generated method stub
        return super.getArrayMov();
    }

    @Override
    public int getConsumEstamina() {
        // TODO Auto-generated method stub
        return super.getConsumEstamina();
    }

    @Override
    public String getNombreMov() {
        // TODO Auto-generated method stub
        return super.getNombreMov();
    }

    @Override
    public Tipo getTipoMov() {
        // TODO Auto-generated method stub
        return super.getTipoMov();
    }

    @Override
    public void setArrayMov(String[] arrayMov) {
        // TODO Auto-generated method stub
        super.setArrayMov(arrayMov);
    }

    @Override
    public void setConsumEstamina(int consumEstamina) {
        // TODO Auto-generated method stub
        super.setConsumEstamina(consumEstamina);
    }

    @Override
    public void setNombreMov(String nombreMov) {
        // TODO Auto-generated method stub
        super.setNombreMov(nombreMov);
    }

    @Override
    public void setTipoMov(Tipo tipoMov) {
        // TODO Auto-generated method stub
        super.setTipoMov(tipoMov);
    }

    /*
     * @Override
     * public void aplicarMovimiento(Pokemon pokemon) {
     * 
     * 
     * }
     */

}
