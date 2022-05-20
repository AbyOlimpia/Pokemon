package src.mejora;

import src.pokemon.Movimiento;
import src.pokemon.Pokemon;
import src.pokemon.Tipo;

/**
 * @author @AbyOlimpia @AlexCesur
 */
public class MejoraDef extends Movimiento {

    /**
     * Constructor heredado de movimiento con el nombre del movimiento, el tipo y el
     * consumo de estamina
     * 
     * @param nombreMov
     * @param tipoMov
     * @param consumEstamina
     */
    MejoraDef(String nombreMov, Tipo tipoMov, int consumEstamina) {
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

    public static int setDefensa(int i) {
        return i;
    }

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {
   pokemon.setDefensa(MejoraDef.setDefensa(pokemon.getDefensa()+5));
    }

}
