package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E434_RomanceEnElPalomar {

    Scanner sc;

    void caso() {
        long palomas = sc.nextLong();
        long cajas = sc.nextLong();
        System.out.println(palomas > cajas ? "PRINCIPIO" : "ROMANCE");
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E434_RomanceEnElPalomar().run();
    }
}

