import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> ranking = new HashMap<>();
        Juego partida = new Juego();

        String respuesta;

        do {
            System.out.print("Nombre del jugador: ");
            String nombre = sc.next();

            int puntos = partida.iniciarPartida();

            ranking.put(nombre, puntos);

            System.out.print("¿Otro jugador quiere intentar? (s/n): ");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("s"));

        mostrarRanking(ranking);
    }

    public static void mostrarRanking(HashMap<String, Integer> ranking) {
        System.out.println("==============================");
        System.out.println("       RANKING FINAL         ");
        System.out.println("==============================");


        List<Map.Entry<String, Integer>> listaRanking = new ArrayList<>(ranking.entrySet());

        listaRanking.sort((jugador1, jugador2) -> jugador2.getValue().compareTo(jugador1.getValue()));

        int pos = 1;
        for (Map.Entry<String, Integer> entrada : listaRanking) {
            System.out.printf("%d. %-15s | %d pts%n", pos, entrada.getKey(), entrada.getValue());
            pos++;
        }
    }
}
