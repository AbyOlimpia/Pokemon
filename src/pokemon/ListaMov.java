package src.pokemon;

import java.util.LinkedList;
import java.util.Random;

public class ListaMov {

    public static LinkedList<Movimiento> movimientosAtaque = new LinkedList<>();
    public static LinkedList<Movimiento> movimientosMejora = new LinkedList<>();

    public static void inicializarListasDeMovimientos(){

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

         // TODO: Todos estos van dentro de la lista de mejora
         movimientosMejora.add(new MejoraAtk("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraAtk("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraAtk("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraAtkSpc("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraAtkSpc("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraAtkSpc("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraDef("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraDef("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraDef("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraDefSpc("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraDefSpc("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraDefSpc("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraVel("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraVel("El Afilador", Tipo.ELECTRICO, 3));
         movimientosMejora.add(new MejoraVel("El Afilador", Tipo.ELECTRICO, 3));

    }

    public static LinkedList<Movimiento> devolverListaAtaques() {
        return movimientosAtaque;
    }

    public static LinkedList<Movimiento> devolverListaMejora() {
        return movimientosMejora;
    }

    public static Movimiento devolverMovimientoRandom(LinkedList<Movimiento> movimientosAtaque, LinkedList<Movimiento> movimientosMejora ) {
        Random rnd = new Random();
        int indice = rnd.nextInt(movimientosAtaque.size());
        int index =rnd.nextInt(movimientosMejora.size());
        return movimientosAtaque.get(indice);
    }

}
