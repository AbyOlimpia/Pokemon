package src.pokemon;

public class MovEstado extends Movimiento {

    /**
     * Constructor heredado de movimiento, con el nombre del movimiento, el tipo, el
     * consumo de estamina y el estado que aplica
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     * @param estado
     */
    public MovEstado(String nombreMov, Tipo tipoMov, int consumEstamina, Estado estado) {
        super(nombreMov, tipoMov, consumEstamina);
        // TODO Auto-generated constructor stub
    }

    /**
     * Override con getters y setters
     */

    @Override
    public String[] getArrayMov() {
        // TODO Auto-generated method stub
        return super.getArrayMov();
    }

    @Override
    public int getConsumEstamina() {
        // TODO Auto-generated method stub
        return super.getConsumEstamina();
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

}
