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

    Movimiento(String nombreMov, Tipo tipoMov, int potenciaAtac, int consumEstamina) {
        String[] arrayMov = { "nombre", "del", "mov", "pok" };
        this.nombreMov = nombreMov;
        this.tipoMov = tipoMov;
        this.potenciaAtac = potenciaAtac;
        this.consumEstamina = consumEstamina;
    }

    public int getConsumEstamina() {
        return consumEstamina;
    }

    public String[] getArrayMov() {
        return arrayMov;
    }

    public String getNombreMov() {
        return nombreMov;

    }

    public static int getPotenciaAtac() {
        return potenciaAtac;
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

    public static void setPotenciaAtac(int potenciaAtac) {
        Movimiento.potenciaAtac = potenciaAtac;
    }
}
