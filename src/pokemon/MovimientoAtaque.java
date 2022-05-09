package src.pokemon;

public class MovimientoAtaque extends Movimiento {

    private int potenciaAtaq;

    MovimientoAtaque(String nombreMov, Tipo tipoMov, int potenciaAtac, int consumEstamina) {
        super(nombreMov, tipoMov, potenciaAtac, consumEstamina);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getConsumEstamina() {

        return super.getConsumEstamina();
    }

    @Override
    public String[] getArrayMov() {
        // TODO Auto-generated method stub
        return super.getArrayMov();
    }

    @Override
    public String getNombreMov() {
        // TODO Auto-generated method stub
        return super.getNombreMov();
    }

    @Override
    public Tipo getTipoMov() {
        // TODO Auto-generated method stub
        return super.getTipoMov();

    }

    public int getPotenciaAtaq() {
        return potenciaAtaq;
    }

    public void setPotenciaAtaq(int potenciaAtaq) {
        this.potenciaAtaq = potenciaAtaq;
    }

    @Override
    public void setArrayMov(String[] arrayMov) {
        // TODO Auto-generated method stub
        super.setArrayMov(arrayMov);
    }

    @Override
    public void setConsumEstamina(int consumEstamina) {
        // TODO Auto-generated method stub
        super.setConsumEstamina(consumEstamina);
    }

    @Override
    public void setNombreMov(String nombreMov) {
        // TODO Auto-generated method stub
        super.setNombreMov(nombreMov);
    }

    @Override
    public void setTipoMov(Tipo tipoMov) {
        // TODO Auto-generated method stub
        super.setTipoMov(tipoMov);
    }

    /*
     * @Override
     * public void aplicarMovimiento(Pokemon pokemon) {
     * 
     * }
     */

}
