package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E433_RacimosDeUvas {

    Scanner sc;

    long generarRacimo(long uvas) {
        long alturaRacimo = 1;
        while (uvas > 0) {
            uvas -= alturaRacimo;
            alturaRacimo++;
        }
        return alturaRacimo - 1;
    }

    boolean caso() {
        long numUvas = Long.parseLong(sc.nextLine());
        if (numUvas == 0) {
            return false;
        }
        System.out.println(generarRacimo(numUvas));
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E433_RacimosDeUvas().run();
    }

}
