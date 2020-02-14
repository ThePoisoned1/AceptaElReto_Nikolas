package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E428_TendenciaAlLadoOscuro {

    Scanner sc;

    void caso() {
        long cantMidiclorianos = sc.nextLong();
        int cant4s = 0;
        String midiclorianosBase5 = Long.toString(cantMidiclorianos, 5);
        for (int j = 0; j < midiclorianosBase5.length(); j++) {
            if (midiclorianosBase5.charAt(j) == '4') {
                cant4s++;
            }
            if (cant4s == 2) {
                System.out.println("SI");
                return;
            }
        }
        System.out.println("NO");
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E428_TendenciaAlLadoOscuro().run();
    }
}
