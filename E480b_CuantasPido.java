package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E480b_CuantasPido {

    Scanner sc;

    void caso() {
        int cantUvas = sc.nextInt();
        int fallan = sc.nextInt();
        int deCada = sc.nextInt();

        int vecesRelacion = cantUvas / deCada;
        int uvasMalas = vecesRelacion * fallan;
        int uvasContadas = vecesRelacion * deCada;
        int i = 0;
        while (uvasContadas < cantUvas) {
            if (i < fallan) {
                uvasMalas++;
            }
            i++;
            uvasContadas++;
        }
        System.out.println(uvasMalas);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E480b_CuantasPido().run();
    }
}
