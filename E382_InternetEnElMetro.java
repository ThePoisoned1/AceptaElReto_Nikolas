package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E382_InternetEnElMetro {

    Scanner sc;

    void caso() {
        long longitudTunel = sc.nextInt();
        long numeroAntenas = sc.nextInt();
        long rangoInferior, rangoSuperiorAnterior = 0, rangoSuperior, posicion, radio;
        for (int i = 0; i < numeroAntenas; i++) {
            posicion = sc.nextInt();
            radio = sc.nextInt();
            rangoInferior = posicion - radio;
            rangoSuperior = posicion + radio;
            if (rangoInferior <= rangoSuperiorAnterior) {
                rangoSuperiorAnterior = Math.max(rangoSuperior, rangoSuperiorAnterior);
            }
        }
        System.out.println(rangoSuperiorAnterior >= longitudTunel ? "SI" : "NO");
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E382_InternetEnElMetro().run();
    }
}
