package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E363_LasCalorias {

    Scanner sc;

    boolean caso() {
        int calorias = sc.nextInt();
        if (calorias == 0) {
            return false;
        }
        int numComilonas = sc.nextInt();
        int total = 0;
        for (int i = 0; i < numComilonas; i++) {
            total += sc.nextInt();
        }
        int numEntrenamientos = total / calorias;
        if (total % calorias != 0) {
            numEntrenamientos++;
        }
        System.out.println(numEntrenamientos);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E363_LasCalorias().run();
    }
}
