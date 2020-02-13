package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E365_EnLaColaDePapaNoel {

    Scanner sc;

    void caso() {
        int numNinyos = sc.nextInt();
        int posAitor = sc.nextInt();
        int[] regalos = new int[numNinyos];
        for (int j = 0; j < numNinyos; j++) {
            regalos[j] = sc.nextInt();
        }

        int minutosEspera = 0;
        while (regalos[posAitor - 1] > 0) {
            for (int k = 0; k < numNinyos; k++) {
                if (regalos[k] > 0 && regalos[posAitor - 1] > 0) {
                    regalos[k]--;
                    minutosEspera += 2;
                }
            }
        }
        System.out.println(minutosEspera);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E365_EnLaColaDePapaNoel().run();
    }
}
