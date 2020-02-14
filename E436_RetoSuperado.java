package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E436_RetoSuperado {

    Scanner sc;

    long doblador(long ancho, long alto) {
        long dobleces = 0;
        while (alto * Math.pow(10, 6) >= ancho) {
            ancho = ancho * 2;
            dobleces++;
        }
        return dobleces;
    }

    boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }
        long ancho = sc.nextLong();
        long alto = sc.nextLong();
        sc.nextLine(); //da RTE sin esto
        System.out.println(doblador(ancho, alto));
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E436_RetoSuperado().run();
    }
}
