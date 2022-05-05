package pokemon;

public class Mejora extends Movimiento {
    private int numEfecto;
    private String tipoMejora;
    private int cantMejora;

    @Override
    public int getConsumEstamina() {

        return super.getConsumEstamina();
    }

    @Override
    public Tipo getTipo() {

        return super.getTipo();
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

}
