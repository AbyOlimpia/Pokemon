package src.pokemon;

public abstract class Movimiento {
    private String nombreMov;
    private Tipo tipoMov;
    private static int potenciaAtac;
    private int consumEstamina;
    private String[] arrayMov;
    // en el main crear y poner el nombre, la potencia y la estamina gastada en cada
    // ataque

    // HP = HP -(PotenciaMov + Ataque.this - defensa.rival.pokemon *
    // efectividadDelTipoMov)
    /*
     * if(daño=<0)
     * daño =1;
     */

    /**
     * Constructor con los parámetros necesarios para los movimientos
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     */

    public Movimiento(String nombreMov, Tipo tipoMov, int consumEstamina) {
        String[] arrayMov = { "nombre", "del", "mov", "pok" };
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

    public String[] getArrayMov() {
        return arrayMov;
    }

    public String getNombreMov() {
        return nombreMov;

    }

    public Tipo getTipoMov() {
        return tipoMov;

    }

    public void setArrayMov(String[] arrayMov) {
        this.arrayMov = arrayMov;
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

}
