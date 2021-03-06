package src.pokemon;

/**
 * @author @AbyOlimpia @AlexCesur
 */
public class MejoraAtkSpc extends Movimiento {

    /**
     * Constructor heredado de movimiento, con el nombre del movimiento, el tipo y
     * el consumo de estamina
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     */
    MejoraAtkSpc(String nombreMov, Tipo tipoMov, int consumEstamina) {
        super(nombreMov, tipoMov, consumEstamina);
    }

    /**
     * Setters y getters
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

    @Override
    public void setNombreMov(String nombreMov) {
        super.setNombreMov(nombreMov);
    }

    @Override
    public void setConsumEstamina(int consumEstamina) {
        super.setConsumEstamina(consumEstamina);
    }

    @Override
    public void setTipoMov(Tipo tipoMov) {
        super.setTipoMov(tipoMov);
    }

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {
        pokemon.setAtaqueSp(MejoraAtkSpc.setAtaqueSp(pokemon.getAtaqueSp() + 5));
    }

    private static int setAtaqueSp(int i) {
        return i;
    }

}
