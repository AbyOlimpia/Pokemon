package src.pokemon;

public abstract class Movimiento {
    private int consumEstamina;
    private Tipo tipo;

    public int getConsumEstamina() {
        return consumEstamina;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public abstract void aplicarMovimiento(Pokemon pokemon);
