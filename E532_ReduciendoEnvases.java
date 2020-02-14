package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E532_ReduciendoEnvases {

    Scanner sc;

    void caso() {
        System.out.println(Math.abs(sc.nextInt() - sc.nextInt()));
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E532_ReduciendoEnvases().run();
    }
}
