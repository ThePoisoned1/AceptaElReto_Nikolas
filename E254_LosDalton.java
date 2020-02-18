package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E254_LosDalton {

    Scanner sc;

    boolean caso() {
        long numHermanos = sc.nextLong();
        if (numHermanos == 0) {
            return false;
        }
        boolean menor = true, mayor = true;
        long anterior = sc.nextLong(), actual;
        for (long i = 1; i < numHermanos; i++) {
            actual = sc.nextLong();
            if (menor && actual < anterior) {
                mayor = false;
            } else if (mayor && actual > anterior) {
                menor = false;
            } else {
                System.out.println("DESCONOCIDOS");
                sc.nextLine();
                return true;
            }
            anterior = actual;
        }
        System.out.println("DALTON");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E254_LosDalton().run();
    }

}
