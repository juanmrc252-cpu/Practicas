package bin;
import bin.Ticket;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Ticket> lista = new ArrayList<>();

    public Agenda() {
        // Puedes iniciar con un ticket si quieres
        LocalDateTime inicio = LocalDateTime.now();
        LocalDateTime fin = inicio.plusHours(2);
        lista.add(new Ticket("4780DAI", 7, inicio, fin));
        }

    // Añadir un ticket a la agenda
    public void agendaAdd(Ticket t) {
        lista.add(t);
    }

    // Mostrar solo tickets vencidos
    public void filtrarVencidos(int zona) {
        for (Ticket t : lista) {
            if (t.getZona() == zona && LocalDateTime.now().isAfter(t.getFin())) {
                System.out.println("Vencido -> " + t);
            }
        }
    }

    // Mostrar solo tickets activos
    public void filtrarActivos(int zona) {
        for (Ticket t : lista) {
            if (t.getZona() == zona && LocalDateTime.now().isBefore(t.getFin())) {
                System.out.println("Activo -> " + t);
            }
        }
    }

    // Mostrar todos los tickets
    public void mostrarTickets() {
        for (Ticket t : lista) {
            System.out.println(t);
        }
    }
}

    