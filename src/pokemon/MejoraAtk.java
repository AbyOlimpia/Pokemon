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

    MejoraAtk(String nombreMov, Tipo tipoMov, int consumEstamina, MejorasH mejoraEstadiscticas, int cantMejora) {
        super(nombreMov, tipoMov, consumEstamina, mejoraEstadiscticas, cantMejora);

    }

    /**
     * Getters y Setters
     */
    @Override
    public int getCantMejora() {
        return super.getCantMejora();
    }

    @Override
    public String getNombreMov() {
        return super.getNombreMov();
    }

    @Override
    public int getConsumEstamina() {
        return super.getConsumEstamina();
    }

    @Override
    public String getTipoMejora() {
        return super.getTipoMejora();
    }

    @Override
    public Tipo getTipoMov() {
        return super.getTipoMov();
    }

    @Override
    public int getNumEfecto() {
        return super.getNumEfecto();
    }

    public static int setAtaque(int i) {
        return i;
    }

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {
        pokemon.setAtaque(MejoraAtk.setAtaque(pokemon.getAtaque() + 5));
    }

}
