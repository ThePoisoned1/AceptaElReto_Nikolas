package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E340_CuadradosConCerillas {

    Scanner sc;

    void caso() {
        int alto = sc.nextInt();
        int ancho = sc.nextInt();
        System.out.println((alto * (ancho + 1)) + (ancho * (alto + 1)));
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E340_CuadradosConCerillas().run();
    }
}
