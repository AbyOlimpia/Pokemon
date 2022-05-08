package src.pokemon;

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
    private LinkedList<Movimiento> movimientos;
    private Estado estados;
    private Tipo tipo;

    Pokemon(String paramNombre) {
        this.nombre = paramNombre;
        this.vitalidad = (int) (Math.random() * 10);
        this.ataque = (int) (Math.random() * 10);
        this.defensa = (int) (Math.random() * 10);
        this.ataqueSp = (int) (Math.random() * 10);
        this.defensaSp = (int) (Math.random() * 10);
        this.estamina = 100;
        this.nivel = 1;
        this.fertilidad = 5;
    }

    public LinkedList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getVitalidad() {
        return vitalidad;
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

    public void setMovimientos(LinkedList<Movimiento> movimientos) {
        this.movimientos = movimientos;
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

    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }

    public void setMote(String mote) {
        this.mote = mote;

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

    public int atacar(Pokemon pokemon, Movimiento movimiento) {
        if (pokemon.getTipo() == Efectividad.SUPER_EFICAZ){
            pokemon.setAtaque((int)1.5*pokemon.getAtaque())
        }else if (pokemon.getTipo()==Efectividad.EFECTIVO){
                pokemon.setAtaque((int)1*pokemon.getAtaque());

            }else if(pokemon.getTipo()==Efectividad.POCO_EFICAZ){
                pokemon.setAtaque((int)0.5*pokemon.getAtaque());

            }


        movimiento.aplicarMovimiento(pokemon);

        return 7;
    }

    public void aplicarMejora(Mejora mejora){
        mejora.aplicarMovimiento(MejoraAtk.class(this));
        

    }

    public int nivelSubid(int expGanada) {
        if (expGanada >= nivel * 10) {
            nivel++;
            return nivel;
        } else {
            return nivel;

        }

        /*
         * public String toString(){
         * return "Nombre = "+this.nombre+" Nivel = "+this.nivel;
         * 
         * }
         */

    }
}
