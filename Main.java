import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaTurnos sistema = new SistemaTurnos();
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del paciente: ");
                    String nombre = scanner.nextLine();
                    sistema.agregarTurno(nombre);
                    break;
                case 2:
                    sistema.atenderTurno();
                    break;
                case 3:
                    sistema.mostrarTurnosPendientes();
                    break;
                case 4:
                    sistema.mostrarTurnosAtendidos();
                    break;
                case 5:
                    System.out.print("Ingrese el ID del turno a cancelar: ");
                    int id = scanner.nextInt();
                    sistema.cancelarTurno(id);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println(" Sistema de Turnos Médicos");
        System.out.println("1. Agregar turno");
        System.out.println("2. Atender turno");
        System.out.println("3. Ver turnos pendientes");
        System.out.println("4. Ver turnos atendidos");
        System.out.println("5. Cancelar turno");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}