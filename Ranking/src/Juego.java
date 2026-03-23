import java.util.Scanner;
import java.util.Random;

public class Juego {
    private final int MAX_INTENTOS = 5;

    public int iniciarPartida() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int numeroSecreto = rnd.nextInt(10) + 1;
        int intentos = 0;

        System.out.println(" Nueva Partida");
        System.out.println("Adivina el número del 1 al 10 (Tienes " + MAX_INTENTOS + " intentos)");

        while (intentos < MAX_INTENTOS) {
            System.out.print("Intento #" + (intentos + 1) + ": ");
            int apuesta = sc.nextInt();
            intentos++;

            if (apuesta == numeroSecreto) {
                System.out.println("¡Ganaste! Lo lograste en " + intentos + " intentos.");
                return (MAX_INTENTOS - intentos + 1) * 100;
            } else {
                System.out.println("No es ese número...");
            }
        }

        System.out.println("Perdiste. El número era: " + numeroSecreto);
        return 0;
    }
}