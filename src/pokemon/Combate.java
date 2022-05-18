package src.pokemon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Combate {
    private List<Turno> Turnos;
    public static final String PATH = "./log/combate.log";

    public Combate(){
        Turnos = new LinkedList<>();

    }

    public List<Turno> getTurnos() {
        return Turnos;
    }
    public void addTurno (Turno t){
        this.Turnos.add(t);
    }
    
    public void escribirCombate(){
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
