package AceptaElReto.AC;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E431_GeneticaJedi {

    Scanner sc;

    boolean caso() {
        int numFamilias = sc.nextInt();
        if (numFamilias == 0) {
            return false;
        }
        int[] ninyos = new int[numFamilias];
        int hijos, transmite, mejor, aux;
        for (int i = 0; i < numFamilias; i++) {
            hijos = sc.nextInt();
            transmite = sc.nextInt();
            mejor = transmite * sc.nextInt();
            for (int j = 1; j < hijos; j++) {
                aux = sc.nextInt();
                if (transmite * aux > mejor) {
                    mejor = transmite * aux;
                }
            }
            ninyos[i] = mejor;
        }
        Arrays.sort(ninyos);
        for (int i = ninyos.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(ninyos[i] + " ");
            } else {
                System.out.println(ninyos[i]);
            }
        }
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E431_GeneticaJedi().run();
    }
}
