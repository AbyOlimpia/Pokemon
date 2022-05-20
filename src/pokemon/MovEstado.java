package src.pokemon;

public class MovEstado extends Movimiento {
    private int turnos;
    private Estado estado;

    /**
     * Constructor heredado de movimiento, con el nombre del movimiento, el tipo, el
     * consumo de estamina y el estado que aplica
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     * @param estado
     */
    public MovEstado(String nombreMov, Tipo tipoMov, int consumEstamina, Estado estado, int turnos) {
        super(nombreMov, tipoMov, consumEstamina);
        this.turnos = turnos;
        this.estado = estado;
        setConsumEstamina(turnos * 10);

    }

    /**
     * Override con getters y setters
     */
    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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
        pokemon.setEstado(this.estado);

    }

}
