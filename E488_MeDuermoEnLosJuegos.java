package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E488_MeDuermoEnLosJuegos {

    Scanner sc;

    void caso() {
        int nPuntos = sc.nextInt();
        int energia = sc.nextInt();
        long pGuardado, pGuardadoAnterior = sc.nextLong(), inicioSesion = 0;
        int sesiones = 1;
        for (int i = 1; i < nPuntos; i++) {
            pGuardado = sc.nextLong();
            if (pGuardado - inicioSesion > energia) {
                sesiones++;
                inicioSesion = pGuardadoAnterior;
            } else if (pGuardado - inicioSesion == energia) {
                sesiones++;
                inicioSesion = pGuardado;
            }
            pGuardadoAnterior = pGuardado;
        }
        System.out.println(pGuardadoAnterior == inicioSesion ? sesiones - 1 : sesiones);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E488_MeDuermoEnLosJuegos().run();
    }
}
