package src.pokemon;

/**
 * @author @AbyOlimpia @AlexCesur
 */
import java.util.LinkedList;
import java.util.Random;

public class ListaMov {

    /**
     * LinkedLists con los diferentes tipos de movimientos
     */
    public static LinkedList<Movimiento> movimientosAtaque = new LinkedList<>();
    public static LinkedList<Movimiento> movimientosMejora = new LinkedList<>();
    public static LinkedList<Movimiento> movimientosEstado = new LinkedList<>();

    public static void inicializarListasDeMovimientos() {

        // Movimientos de Ataque

        movimientosAtaque.add(new MovimientoAtaque("Pistola Agua", Tipo.AGUA, 10, 3));
        movimientosAtaque.add(new MovimientoAtaque("Surf", Tipo.AGUA, 30, 5));
        movimientosAtaque.add(new MovimientoAtaque("Hidrobomba", Tipo.AGUA, 50, 10));
        movimientosAtaque.add(new MovimientoAtaque("Hidropulso Agua", Tipo.AGUA, 20, 3));
        movimientosAtaque.add(new MovimientoAtaque("Salmuera", Tipo.AGUA, 40, 3));
        movimientosAtaque.add(new MovimientoAtaque("Ascuas", Tipo.FUEGO, 10, 3));
        movimientosAtaque.add(new MovimientoAtaque("Lanzallamas", Tipo.FUEGO, 20, 3));
        movimientosAtaque.add(new MovimientoAtaque("Fuego Sagrado", Tipo.FUEGO, 60, 3));
        movimientosAtaque.add(new MovimientoAtaque("Llamarada", Tipo.FUEGO, 30, 3));
        movimientosAtaque.add(new MovimientoAtaque("Infierno", Tipo.FUEGO, 50, 3));
        movimientosAtaque.add(new MovimientoAtaque("Látigo cepa", Tipo.PLANTA, 10, 3));
        movimientosAtaque.add(new MovimientoAtaque("Follaje", Tipo.PLANTA, 20, 3));
        movimientosAtaque.add(new MovimientoAtaque("Mazazo", Tipo.PLANTA, 30, 3));
        movimientosAtaque.add(new MovimientoAtaque("Tormenta Floral", Tipo.PLANTA, 40, 3));
        movimientosAtaque.add(new MovimientoAtaque("Planta Feroz", Tipo.PLANTA, 50, 3));
        movimientosAtaque.add(new MovimientoAtaque("Chispitas UwU", Tipo.ELECTRICO, 10, 3));
        movimientosAtaque.add(new MovimientoAtaque("Raio", Tipo.ELECTRICO, 20, 3));
        movimientosAtaque.add(new MovimientoAtaque("Trueno", Tipo.ELECTRICO, 30, 3));
        movimientosAtaque.add(new MovimientoAtaque("Voltio Cruel", Tipo.ELECTRICO, 40, 3));
        movimientosAtaque.add(new MovimientoAtaque("Cañón Plasma", Tipo.ELECTRICO, 50, 3));
        movimientosAtaque.add(new MovimientoAtaque("Terratemblor", Tipo.TIERRA, 10, 3));
        movimientosAtaque.add(new MovimientoAtaque("Terremoto", Tipo.TIERRA, 20, 3));
        movimientosAtaque.add(new MovimientoAtaque("Tierra Viva", Tipo.TIERRA, 30, 3));
        movimientosAtaque.add(new MovimientoAtaque("Fisura", Tipo.TIERRA, 40, 3));
        movimientosAtaque.add(new MovimientoAtaque("Filo del Abismo", Tipo.TIERRA, 50, 3));
        movimientosAtaque.add(new MovimientoAtaque("Ataque Ala", Tipo.VOLADOR, 10, 3));
        movimientosAtaque.add(new MovimientoAtaque("Vendaval", Tipo.VOLADOR, 20, 3));
        movimientosAtaque.add(new MovimientoAtaque("Golpe Aéreo", Tipo.VOLADOR, 30, 3));
        movimientosAtaque.add(new MovimientoAtaque("Vuelo", Tipo.VOLADOR, 40, 3));
        movimientosAtaque.add(new MovimientoAtaque("Pájaro Asado", Tipo.VOLADOR, 50, 3));

        // Movimientos de Mejora

        movimientosMejora.add(new MejoraAtk("El Afilador", Tipo.ELECTRICO, 3));
        movimientosMejora.add(new MejoraAtk("El Tapicero", Tipo.TIERRA, 3));
        movimientosMejora.add(new MejoraAtk("La Jungla", Tipo.PLANTA, 3));
        movimientosMejora.add(new MejoraAtkSpc("Clase con Paco", Tipo.AGUA, 3));
        movimientosMejora.add(new MejoraAtkSpc("Clase con Luis Regino", Tipo.FUEGO, 3));
        movimientosMejora.add(new MejoraAtkSpc("Piensalo un poco", Tipo.AGUA, 3));
        movimientosMejora.add(new MejoraDef("Crimpar", Tipo.ELECTRICO, 3));
        movimientosMejora.add(new MejoraDef("La dobleU", Tipo.FUEGO, 3));
        movimientosMejora.add(new MejoraDef("El Panadero", Tipo.PLANTA, 3));
        movimientosMejora.add(new MejoraDefSpc("Push/Pull", Tipo.ELECTRICO, 3));
        movimientosMejora.add(new MejoraDefSpc("Umbrello", Tipo.FUEGO, 3));
        movimientosMejora.add(new MejoraDefSpc("Commit", Tipo.VOLADOR, 3));
        movimientosMejora.add(new MejoraVel("Chocobon", Tipo.TIERRA, 3));
        movimientosMejora.add(new MejoraVel("Fernando Fariña", Tipo.VOLADOR, 3));
        movimientosMejora.add(new MejoraVel("Un café rápido", Tipo.FUEGO, 3));

        // Movimientos de Estado

        movimientosEstado.add(new MovEstado("Espora", Tipo.PLANTA, 3, Estado.DORMIDO));
        movimientosEstado.add(new MovEstado("Fuego Fatuo", Tipo.TIERRA, 3, Estado.QUEMADO));
        movimientosEstado.add(new MovEstado("Fallo de Voltaje", Tipo.ELECTRICO, 3, Estado.PARALIZADO));

    }

    /**
     * Métodos para obtener la lista de ataques y mejoras
     * 
     * @return
     */

    public static LinkedList<Movimiento> devolverListaAtaques() {
        return movimientosAtaque;
    }

    public static LinkedList<Movimiento> devolverListaMejora() {
        return movimientosMejora;
    }

    /**
     * Método para conseguir un movimiento random
     * 
     * @return
     */

    public static Movimiento devolverMovimientoRandom() {
        Random rnd = new Random();
        int indice = rnd.nextInt(movimientosAtaque.size());
        return movimientosAtaque.get(indice);
    }

}
