package bin;

import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda(); // Creamos la agenda
        int numero;

        do {
            System.out.println("\nIntroduce un número para elegir una opción:");
            System.out.println("0 - Salir");
            System.out.println("1 - Añadir ticket");
            System.out.println("2 - Filtrar vencidos (zona 2)");
            System.out.println("3 - Filtrar activos (zona 2)");
            System.out.println("4 - Mostrar todos los tickets");

            numero = sc.nextInt();
            sc.nextLine(); // Consumir salto de línea pendiente

            if (numero == 0) {
                System.out.println("Saliendo...");
                break;

            } else if (numero == 1) {
                System.out.println("Introduce los datos del ticket a registrar");
                System.out.print("Matrícula: ");
                String matricula = sc.nextLine();

                System.out.print("Zona: ");
                int zona = sc.nextInt();
                sc.nextLine(); // Consumir salto de línea

                LocalDateTime inicio = LocalDateTime.now();
                LocalDateTime fin = inicio.plusHours(2); // Ejemplo de duración

                Ticket t = new Ticket(matricula, zona, inicio, fin);
                agenda.agendaAdd(t);
                System.out.println("Ticket añadido correctamente.");

            } else if (numero == 2) {
                System.out.println("Introduce numero de zona");
                int zona = sc.nextInt();
                agenda.filtrarVencidos(zona);

            } else if (numero == 3) {
                System.out.println("Introduce numero de zona");
                int zona = sc.nextInt();
                agenda.filtrarActivos(zona);

            } else if (numero == 4) {
                agenda.mostrarTickets();

            } else {
                System.out.println("Opción no válida");
            }

        } while (numero != 0);

        sc.close();
    }
}
