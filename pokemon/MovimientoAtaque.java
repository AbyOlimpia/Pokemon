package pokemon;

public class MovimientoAtaque extends Movimiento {
    private int potenciaAtaq;

    @Override
    public int getConsumEstamina() {
        
        return super.getConsumEstamina();
    }

    @Override
    public Tipo getTipo() {
        
        return super.getTipo();
    }

    public int getPotenciaAtaq() {
        return potenciaAtaq;
    }

    public void setPotenciaAtaq(int potenciaAtaq) {
        this.potenciaAtaq = potenciaAtaq;
    }

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {
        
    }

}
