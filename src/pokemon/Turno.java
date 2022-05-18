package src.pokemon;

public class Turno {
    private int numeroTurno;
    private String accionEntrenador;
    private String accionRival;

    public Turno(int numeroT, String accionE, String accionR){
        this.numeroTurno = numeroT;
        this.accionEntrenador = accionE;
        this.accionRival = accionR;
    }
    public String getAccionEntrenador() {
        return accionEntrenador;
    }
    public String getAccionRival() {
        return accionRival;
    }
    public int getNumeroTurno() {
        return numeroTurno;
    }
    public void setAccionEntrenador(String accionEntrenador) {
        this.accionEntrenador = accionEntrenador;
    }
    public void setAccionRival(String accionRival) {
        this.accionRival = accionRival;
    }
    public void setNumeroTurno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }
    
}
