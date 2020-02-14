package AceptaElReto.AC;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E534_TrasElFestival {

    Scanner sc;

    boolean caso() {
        int numCubos = sc.nextInt();
        if (numCubos == 0) {
            return false;
        }
        int[] basuras = new int[numCubos];
        for (int i = 0; i < numCubos; i++) {
            basuras[i] = sc.nextInt();
        }
        Arrays.sort(basuras);
        int distancia = 0;
        for (int i = numCubos - 1; i > 0; i = i - 2) {
            if (distancia < Math.abs(basuras[i] - basuras[i - 1])) {
                distancia = Math.abs(basuras[i] - basuras[i - 1]);
            }
        }
        System.out.println(distancia);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E534_TrasElFestival().run();
    }
}
