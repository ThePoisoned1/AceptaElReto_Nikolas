package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E347_HaciendoPajaritasDePapel {

    Scanner sc;

    boolean caso() {
        int ancho = sc.nextInt();
        int alto = sc.nextInt();
        if (ancho == 0 && alto == 0) {
            return false;
        }
       int pajaritas = 0;
        while (ancho >= 10 && alto >= 10) {
            if (ancho > alto) {
                pajaritas += ancho / alto;
                ancho = ancho % alto;
            } else {
                pajaritas += alto / ancho;
                alto = alto % ancho;

            }
        }
        System.out.println(pajaritas);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E347_HaciendoPajaritasDePapel().run();
    }

}
