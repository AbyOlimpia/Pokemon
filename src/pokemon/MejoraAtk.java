package src.pokemon;

/**
 * @author @AbyOlimpia @AlexCesur
 */
public class MejoraAtk extends Mejora {

    /**
     * Constructor heredado de movimiento, con el nombre del movimiento, el tipo y
     * el consumo de estamina
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     */
    MejoraAtk(String nombreMov, Tipo tipoMov, int consumEstamina) {
        super(nombreMov, tipoMov, consumEstamina);
    }

    /**
     * Getters y Setters
     */
    @Override
    public int getCantMejora() {
        // TODO Auto-generated method stub
        return super.getCantMejora();
    }

    @Override
    public String getNombreMov() {
        // TODO Auto-generated method stub
        return super.getNombreMov();
    }

    @Override
    public int getConsumEstamina() {
        // TODO Auto-generated method stub
        return super.getConsumEstamina();
    }

    @Override
    public String getTipoMejora() {
        // TODO Auto-generated method stub
        return super.getTipoMejora();
    }

    @Override
    public Tipo getTipoMov() {
        // TODO Auto-generated method stub
        return super.getTipoMov();
    }

    @Override
    public int getNumEfecto() {
        // TODO Auto-generated method stub
        return super.getNumEfecto();
    }

}
