package pokemon;

public class Pokemon {
    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueSp;
    private int defensaSp;
    private int estamina;
    private int nivel;
    private int fertilidad = 5;
    private Estado estados;
    private Tipo tipo;
    private Movimiento movimiento;
    private int exp;
    // lista de movimientos. Crear una lista con los diferentes movimientos o array

    Pokemon(String paramNombre) {
        this.nombre = paramNombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueSp() {
        return ataqueSp;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getDefensaSp() {
        return defensaSp;
    }

    public Estado getEstados() {
        return estados;
    }

    public int getEstamina() {
        return estamina;
    }

    public int getFertilidad() {
        return fertilidad;

    }

    public String getMote() {
        return mote;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getVitalidad() {
        return vitalidad;

    }

    public Movimiento getMovimiento() {
        return movimiento;
    }

    public int atacar(Pokemon pokemon) {
        return ataque;
    }

    public int nivelSubid(int expGanada) {
        if (expGanada >= nivel * 10) {
            nivel++;
            return nivel;
        } else {
            return nivel;
        }

    }

}
