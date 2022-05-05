package pokemon;

import java.util.LinkedList;

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
    private LinkedList movimiento;
    private int exp;
    private Efectividad efectividad;
    // lista de movimientos. Crear una lista con los diferentes movimientos o array

    Pokemon(String paramNombre) {
        this.nombre = paramNombre;
    }
    public LinkedList getMovimiento() {
        return movimiento;
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

    public Efectividad getEfectividad() {
        return efectividad;
    }

    public int getExp() {
        return exp;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setAtaqueSp(int ataqueSp) {
        this.ataqueSp = ataqueSp;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setDefensaSp(int defensaSp) {
        this.defensaSp = defensaSp;
    }

    public void setEstados(Estado estados) {
        this.estados = estados;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public void setMovimiento(LinkedList movimiento) {
        this.movimiento = movimiento;
    
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public void setEfectividad(Efectividad efectividad) {
        this.efectividad = efectividad;
    }

    public Efectividad comprobarTipos(Pokemon p1, Pokemon p2) {
        if (p1.getTipo() == Tipo.AGUA && p2.getTipo() == Tipo.FUEGO || p2.getTipo() == Tipo.TIERRA)
            return Efectividad.SUPER_EFICAZ;
        else if (p1.getTipo() == Tipo.VOLADOR && (p2.getTipo() == Tipo.TIERRA || p2.getTipo() == Tipo.PLANTA))
            return Efectividad.SUPER_EFICAZ;
        if (p1.getTipo() == Tipo.FUEGO && (p2.getTipo() == Tipo.PLANTA))
            return Efectividad.SUPER_EFICAZ;
        if (p1.getTipo() == Tipo.ELECTRICO && (p2.getTipo() == Tipo.AGUA || p2.getTipo() == Tipo.VOLADOR))
            return Efectividad.SUPER_EFICAZ;
        if (p1.getTipo() == Tipo.PLANTA && (p2.getTipo() == Tipo.AGUA))
            return Efectividad.SUPER_EFICAZ;
        return Efectividad.POCO_EFICAZ;
    }

    public int atacar(Pokemon pokemon) {
        if()
        
        return 7;
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
