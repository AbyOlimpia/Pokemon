package pokemon;

import java.util.LinkedList;
public class Movimiento {
    private LinkedList movimiento;
    private int consumEstamina;
    private Tipo tipo;

    public int getConsumEstamina() {
        return consumEstamina;
    }
    public LinkedList getMovimiento() {
        return movimiento;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
