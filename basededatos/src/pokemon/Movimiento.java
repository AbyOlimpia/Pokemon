package pokemon;


public abstract class Movimiento {
    private String nombreMov;
    private Tipo tipoMov;
    private int consumEstamina;
    
    /**
     * Constructor con los parámetros necesarios para los movimientos
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     */

    public Movimiento(String nombreMov, Tipo tipoMov, int consumEstamina) {
        this.nombreMov = nombreMov;
        this.tipoMov = tipoMov;
        this.consumEstamina = consumEstamina;
    }

    /**
     * Getters y Setters
     * 
     * @return
     */
    public int getConsumEstamina() {
        return consumEstamina;
    }

    public String getNombreMov() {
        return nombreMov;

    }

    public Tipo getTipoMov() {
        return tipoMov;

    }

    public void setConsumEstamina(int consumEstamina) {
        this.consumEstamina = consumEstamina;
    }

    public void setNombreMov(String nombreMov) {
        this.nombreMov = nombreMov;
    }

    public void setTipoMov(Tipo tipoMov) {
        this.tipoMov = tipoMov;
    }

    public abstract void aplicarMovimiento(Pokemon pokemon);

}


