package src.pokemon;

/**
 * @author @AbyOlimpia @AlexCesur
 */
public class MejoraDefSpc extends Movimiento {

    /**
     * Constructor que hereda de movimiento, con el nombre del movimiento, el tipo y
     * el consumo de estamina
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     */
    MejoraDefSpc(String nombreMov, Tipo tipoMov, int consumEstamina) {
        super(nombreMov, tipoMov, consumEstamina);
    }

    /**
     * Setters y Getters
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

    public static int setDefensaSp(int i) {
        return i;
    }

    public void aplicarMejoraDefSpc(Pokemon pokemon) {

    }

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {
        pokemon.setDefensaSp(MejoraDefSpc.setDefensaSp(pokemon.getDefensaSp() + 5));

    }

    public static int setVelocidad(int i) {
        return 0;
    }

}
