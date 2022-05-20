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
        return super.getNombreMov();
    }

    @Override
    public Tipo getTipoMov() {
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

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {
        if ((pokemon.getVitalidad() - potenciaAtaq) < 0)
            pokemon.setVitalidad(0);
        else
            pokemon.setVitalidad(pokemon.getVitalidad() - potenciaAtaq);
    }
}
