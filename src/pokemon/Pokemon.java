package src.pokemon;

import java.util.LinkedList;

/**
 * @author @AbyOlimpia @AlexCesur
 */
public class Pokemon {
    private String nombre;
    private String mote;
    protected float vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueSp;
    private int defensaSp;
    private int estamina;
    private int nivel;
    private int fertilidad;
    private LinkedList<Movimiento> movimientos;
    private Estado estado;
    private Tipo tipo;
    private int numPokedex;
    private int velocidad;

    public Pokemon() {

    }

    /**
     * Constructor con los parámetros necesarios para crear un pokémon
     * 
     * @param nom_pokemon
     * @param nivel
     * @param tipo
     * @param num_pokedex
     */

    public Pokemon(String nom_pokemon, int nivel, Tipo tipo, int num_pokedex, int velocidad,
            LinkedList<Movimiento> movimientos) {
        this.nombre = nom_pokemon;
        this.vitalidad = (int) (Math.random() * 10);
        this.ataque = (int) (Math.random() * 10);
        this.defensa = (int) (Math.random() * 10);
        this.ataqueSp = (int) (Math.random() * 10);
        this.defensaSp = (int) (Math.random() * 10);
        this.estamina = 100;
        this.nivel = 1;
        this.fertilidad = 5;
        this.tipo = tipo;
        this.numPokedex = num_pokedex;
        movimientos = new LinkedList<>();
        this.velocidad = velocidad;
    }

    /**
     * return de LinkedList para obtener toda la lista de movimientos
     * Todos los getters y setters
     * 
     * @return
     */
    public LinkedList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public float getVitalidad() {
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
        return estado;
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

    public void setVitalidad(float f) {
        this.vitalidad = f;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNomPokemon(String nomPokemon) {
        this.nombre = nomPokemon;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Método para identificar la efectividad del ataque
     * 
     * @param p2
     * @return
     */

    public Efectividad comprobarTipos(Pokemon p2) {
        if (this.getTipo() == Tipo.AGUA && p2.getTipo() == Tipo.FUEGO || p2.getTipo() == Tipo.TIERRA)
            return Efectividad.SUPER_EFICAZ;
        else if (this.getTipo() == Tipo.VOLADOR
                && (p2.getTipo() == Tipo.TIERRA || p2.getTipo() == Tipo.PLANTA || p2.getTipo() == Tipo.FUEGO))
            return Efectividad.SUPER_EFICAZ;
        else if (this.getTipo() == Tipo.FUEGO && (p2.getTipo() == Tipo.PLANTA))
            return Efectividad.SUPER_EFICAZ;
        else if (this.getTipo() == Tipo.ELECTRICO && (p2.getTipo() == Tipo.AGUA || p2.getTipo() == Tipo.VOLADOR))
            return Efectividad.SUPER_EFICAZ;
        else if (this.getTipo() == Tipo.PLANTA && (p2.getTipo() == Tipo.AGUA))
            return Efectividad.SUPER_EFICAZ;
        else if (this.getTipo() == Tipo.FUEGO && (p2.getTipo() == Tipo.VOLADOR || (p2.getTipo() == Tipo.ELECTRICO)))
            return Efectividad.EFICAZ;
        else if (this.getTipo() == Tipo.AGUA && (p2.getTipo() == Tipo.VOLADOR))
            return Efectividad.EFICAZ;
        else if (this.getTipo() == Tipo.VOLADOR && (p2.getTipo() == Tipo.AGUA))
            return Efectividad.EFICAZ;
        else if (this.getTipo() == Tipo.ELECTRICO && (p2.getTipo() == Tipo.PLANTA || (p2.getTipo() == Tipo.FUEGO)))
            return Efectividad.EFICAZ;
        else if (this.getTipo() == Tipo.PLANTA && (p2.getTipo() == Tipo.ELECTRICO))
            return Efectividad.EFICAZ;
        return Efectividad.POCO_EFICAZ;
    }

    /**
     * Ajuste de ataque si es Super Eficaz, Eficaz o Poco Eficaz
     * 
     * @param pokemon
     * @param listaMovimientosPkmnJugador
     * @return
     */
    public float atacar(Pokemon pokemon, int posicionAtaque) {
        for(int i =0;i<movimientos.size();i++){
        if(posicionAtaque == i){
             movimientos.get(i);
        }
        
        
        
            /*Movimiento movimiento = this.getMovimientos().get(posicionAtaque);
        movimiento.aplicarMovimiento(pokemon);*/
        
        
        }
        return posicionAtaque;
    }



    /**
     * Método para subir el nivel
     * 
     * @param expGanada
     * @return
     */

    public int nivelSubid(int expGanada) {
        if (expGanada >= nivel * 10) {
            nivel++;
            return nivel;
        } else {
            return nivel;
        }
    }

    public void mostrarMov(LinkedList<Movimiento> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNombreMov());

        }

    }

    public String toString() {
        return "Nombre Pokemon = " + this.nombre + ", nivel del Pokemon = " + this.nivel + ", vida total = "
                + this.vitalidad +" ,ataque del Pokemon: "+ this.ataque;

    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
