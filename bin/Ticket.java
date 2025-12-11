package bin;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {

    private String matricula;
    private int zona;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private int duracion;

    public Ticket(String matricula, int zona, LocalDateTime inicio, LocalDateTime fin) {
        this.matricula = matricula;
        this.zona = zona;
        this.inicio = inicio;
        this.fin = fin;
        
        // calcular duración en minutos
        this.duracion = (int) Duration.between(inicio, fin).toMinutes();
    }

    public String getMatricula() {
        return matricula;
    }

    public int getZona() {
        return zona;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula +
               ", Zona: " + zona +
               ", Inicio: " + inicio +
               ", Fin: " + fin +
               ", Duración: " + duracion + " minutos";
    }

    public boolean vencido(LocalDateTime hora) {
        return hora.isAfter(fin);
    }
}
