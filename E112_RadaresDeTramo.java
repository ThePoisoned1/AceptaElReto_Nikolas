import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E112_RadaresDeTramo {

    Scanner sc;

    boolean caso() {
        int tramo = sc.nextInt();
        int velocidadMaxima = sc.nextInt();
        int tiempoTarda = sc.nextInt();
        if (tramo == 0 && velocidadMaxima == 0 && tiempoTarda == 0) {
            return false;
        }
        if (tramo <= 0 || velocidadMaxima<=0 || tiempoTarda <= 0) {
            System.out.println("ERROR");
            return true;
        }
        double velocidadMedia = (double) tramo / tiempoTarda;
        velocidadMedia *= 3.6;
        if (velocidadMedia >= velocidadMaxima) {
            System.out.println(velocidadMedia >= velocidadMaxima * 1.2 ? "PUNTOS" : "MULTA");

        } else {
            System.out.println("OK");
        }
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E112_RadaresDeTramo().run();
    }
}
