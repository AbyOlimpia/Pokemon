package src.pokemon;

/**
 * @author @AbyOlimpia @AlexCesur
 */
public class MovimientoAtaque extends Movimiento {

    private static int potenciaAtaq;

    /**
     * Constructor heredado de Movimiento, que tiene el nombre del movimiento, el
     * tipo, la potencia y el consumo de estamina
     * 
     * @param nombreMov
     * @param tipoMov
     * @param potenciaAtac
     * @param consumEstamina
     */
    public MovimientoAtaque(String nombreMov, Tipo tipoMov, int potenciaAtac, int consumEstamina) {
        super(nombreMov, tipoMov, potenciaAtac);
        // TODO Auto-generated constructor stub
    }

    /**
     * Todos los getters y setters
     */
    @Override
    public int getConsumEstamina() {

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

    public int getPotenciaAtaq() {
        return potenciaAtaq;
    }

    public void setPotenciaAtaq(int potenciaAtaq) {
        MovimientoAtaque.potenciaAtaq = potenciaAtaq;
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

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {
        if ((pokemon.getVitalidad() - potenciaAtaq) < 0)
            pokemon.setVitalidad(0);
        else
            pokemon.setVitalidad(pokemon.getVitalidad() - potenciaAtaq);
    }
    //formula pokemon
    //comparar tipo movimiento y tipo rival.geTipo

    

}
