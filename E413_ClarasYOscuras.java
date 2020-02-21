package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E413_ClarasYOscuras {

    Scanner sc;

    void caso() {
        int ancho = sc.nextInt();
        int alto = sc.nextInt();
        int numOscuros = alto * ancho / 2;
        if (alto * ancho % 2 == 0) {
            System.out.println(numOscuros + " " + numOscuros);
        } else {
            System.out.println((numOscuros + 1) + " " + numOscuros);
        }
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E413_ClarasYOscuras().run();
    }
}
