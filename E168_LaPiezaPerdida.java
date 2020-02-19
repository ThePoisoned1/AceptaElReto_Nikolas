package AceptaElReto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E168_LaPiezaPerdida {

    Scanner sc;

    boolean caso() {
        int cantPiezas = sc.nextInt();
        if (cantPiezas == 0) {
            return false;
        }
        int[] piezas = new int[cantPiezas-1];
        for (int i = 0; i < cantPiezas-1; i++) {
            piezas[i] = sc.nextInt();
        }
        Arrays.sort(piezas);
        if (piezas[0]!=1) {
            System.out.println(1);
            return true;
        }
        for (int i = 1; i < cantPiezas-1; i++) {
            if (piezas[i - 1] != piezas[i] - 1) {
                System.out.println(i+1);
                return true;
            }
        }
        System.out.println(cantPiezas);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E168_LaPiezaPerdida().run();
    }
}
