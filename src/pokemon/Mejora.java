package src.pokemon;

public abstract class Mejora extends Movimiento {

    private int numEfecto;
    private String tipoMejora;
    private int cantMejora;

    Mejora(String nombreMov, Tipo tipoMov, int potenciaAtac, int consumEstamina) {
        super(nombreMov, tipoMov, potenciaAtac, consumEstamina);
    }

    @Override
    public int getConsumEstamina() {
        return super.getConsumEstamina();
    }

    @Override
    public Tipo getTipoMov() {
        return super.getTipoMov();
    }

    @Override
    public String[] getArrayMov() {
        return super.getArrayMov();
    }

    @Override
    public String getNombreMov() {
        return super.getNombreMov();
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

    @Override
    public void setArrayMov(String[] arrayMov) {
        super.setArrayMov(arrayMov);
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

}
