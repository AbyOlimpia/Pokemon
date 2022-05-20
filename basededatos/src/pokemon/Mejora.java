package pokemon;

/**
 * @author @AbyOlimpia @AlexCesur
 */
public class Mejora extends Movimiento {

    private int numEfecto;
    private String tipoMejora;
    private int cantMejora;
    protected MejoraStats mejoraEstadisticas;

    /**
     * Constructor para las mejoras heredado de movimiento
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     */
    Mejora(String nombreMov, Tipo tipoMov, int consumEstamina, MejoraStats mejoraEstadiscticas, int cantMejora) {
        super(nombreMov, tipoMov, consumEstamina);
        this.cantMejora = cantMejora;
        this.mejoraEstadisticas = mejoraEstadiscticas;
    }

    /**
     * setters y getters
     */
    @Override
    public int getConsumEstamina() {
        return super.getConsumEstamina();
    }

    @Override
    public Tipo getTipoMov() {
        return super.getTipoMov();
    }

    @Override
    public String getNombreMov() {
        return super.getNombreMov();
    }

    public MejoraStats getMejoraEstadisticas() {
        return mejoraEstadisticas;
    }

    public int getCantMejora() {
        return cantMejora;
    }

    public int getNumEfecto() {
        return numEfecto;
    }

    public String getTipoMejora() {
        return tipoMejora;
    }

    public void setCantMejora(int cantMejora) {
        this.cantMejora = cantMejora;
    }

    public void setNumEfecto(int numEfecto) {
        this.numEfecto = numEfecto;
    }

    public void setTipoMejora(String tipoMejora) {
        this.tipoMejora = tipoMejora;
    }

    public void setMejoraEstadisticas(MejoraStats mejoraEstadisticas) {
        this.mejoraEstadisticas = mejoraEstadisticas;
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
        MejoraStats mejoraEstast = mejoraEstadisticas;
        if (mejoraEstast == MejoraStats.ATAQUE) {
            pokemon.setAtaque(cantMejora + pokemon.getAtaque());
        } else if (mejoraEstast == MejoraStats.ATAQUE_ESPECIAL) {
            pokemon.setAtaqueSp((cantMejora + pokemon.getAtaqueSp()));

        } else if (mejoraEstast == MejoraStats.DEFENSA) {
            pokemon.setDefensa(cantMejora + pokemon.getAtaqueSp());

        } else if (mejoraEstast == MejoraStats.DEFENSA_ESPECIAL) {
            pokemon.setDefensaSp(cantMejora + pokemon.getAtaqueSp());

        } else if (mejoraEstast == MejoraStats.VELOCIDAD) {
            pokemon.setVelocidad(cantMejora + pokemon.getAtaqueSp());
        }

    }
}
