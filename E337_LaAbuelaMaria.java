package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E337_LaAbuelaMaria {

    Scanner sc;

    void caso() {
        boolean encajan = true;
        int[] mandibulaSuperior = new int[6];
        int[] mandibulaInferior = new int[6];

        for (int i = 0; i < 6; i++) {
            mandibulaSuperior[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            mandibulaInferior[i] = sc.nextInt();
        }
        int sumaDientes = mandibulaSuperior[0] + mandibulaInferior[0];
        int contador = 1;
        while (encajan && contador < 6) {
            if (mandibulaSuperior[contador] + mandibulaInferior[contador] != sumaDientes) {
                encajan = false;
            }
            contador++;
        }
        System.out.println(encajan ? "SI" : "NO");
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E337_LaAbuelaMaria().run();
    }
}
