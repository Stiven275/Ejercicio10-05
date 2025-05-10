import java.util.*;

public class SistemaTurnos {
    private Queue<Turno> colaTurnos = new LinkedList<>();
    private List<Turno> turnosAtendidos = new ArrayList<>();

    public void agregarTurno(String nombrePaciente) {
        Turno nuevo = new Turno(nombrePaciente);
        colaTurnos.add(nuevo);
        System.out.println("Turno agregado: " + nuevo);
    }

    public void atenderTurno() {
        if (colaTurnos.isEmpty()) {
            System.out.println("No hay turnos pendientes.");
        } else {
            Turno atendido = colaTurnos.poll();
            turnosAtendidos.add(atendido);
            System.out.println("Atendiendo a: " + atendido);
        }
    }

    public void mostrarTurnosPendientes() {
        System.out.println("\nTurnos Pendientes:");
        if (colaTurnos.isEmpty()) {
            System.out.println("No hay turnos pendientes.");
        } else {
            for (Turno t : colaTurnos) {
                System.out.println(t);
            }
        }
    }

        public void mostrarTurnosAtendidos() {
            System.out.println(\nTurnosAtendios)