package src.pokemon;

public class Movimientos {
    
    private TipoMovimientos tipo;
    private claseMovimientos clase;

    private int potencia;
    private int estaminaConsumida;

    private String nombre;
    private String descripcion;

    public Movimientos(TipoMovimientos tipo, claseMovimientos clase, int potencia, int estaminaConsumida, String nombre, String descripcion){
        this.tipo = tipo;
        this.clase = clase;
        this.estaminaConsumida = estaminaConsumida;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public claseMovimientos getClase() {
        return clase;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getEstaminaConsumida() {
        return estaminaConsumida;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPotencia() {
        return potencia;
    }
    public TipoMovimientos getTipo() {
        return tipo;
    }
    

}
