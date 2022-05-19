package src.pokemon;

/**
 * @author @AbyOlimpia @AlexCesur
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Lista con los turnos y el path donde escribir el Log
 */
public class Combate {
    private List<Turno> Turnos;
    public static final String PATH = "./log/combate.log";

    /**
     * Método para obtener y añadir turnos
     */

    public Combate() {
        Turnos = new LinkedList<>();

    }

    public List<Turno> getTurnos() {
        return Turnos;
    }

    public void addTurno(Turno t) {
        this.Turnos.add(t);
    }

    /**
     * Método para escribir el combate en el log
     */

    public void escribirCombate() {
        File fichero = new File(PATH);
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Turno turno : Turnos) {
                bw.write("Turno" + turno.getNumeroTurno() + ": \n");
                bw.write("Entrenador" + turno.getAccionEntrenador() + "\n");
                bw.write("Rival" + turno.getAccionRival() + "\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
