import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Tarea> listaTareas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println(" GESTIÓN DE TAREAS ");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Ver Tareas");
            System.out.println("3. Actualizar Estado");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");

            switch (opcion) {
                case 1 -> agregarNuevaTarea();
                case 2 -> listarTareas();
                case 3 -> modificarEstado();
                case 4 -> System.out.println("Cerrando aplicación...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static void agregarNuevaTarea() {
        System.out.print("Nombre de la tarea: ");
        String nom = sc.nextLine();
        System.out.print("Empleado (Autor): ");
        String aut = sc.nextLine();
        System.out.print("Descripción: ");
        String desc = sc.nextLine();
        System.out.print("Duración (min): ");
        int dur = Integer.parseInt(sc.nextLine());

        listaTareas.add(new Tarea(nom, aut, desc, dur, "Pendiente"));
        System.out.println("Tarea registrada con éxito.");
    }

    private static void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
        } else {
            System.out.println("\nLISTA DE TAREAS REGISTRADAS:");
            for (Tarea t : listaTareas) {
                System.out.println(t);
            }
        }
    }

    private static void modificarEstado() {
        System.out.print("Nombre de la tarea a buscar: ");
        String buscar = sc.nextLine();

        for (Tarea t : listaTareas) {
            if (t.getNombre().equalsIgnoreCase(buscar)) {
                System.out.print("Nuevo estado (Pendiente/En proceso/Completada): ");
                t.setEstado(sc.nextLine());
                System.out.println("Estado actualizado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ninguna tarea con ese nombre.");
    }
}
