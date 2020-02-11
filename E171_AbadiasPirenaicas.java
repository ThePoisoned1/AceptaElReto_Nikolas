package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E171_AbadiasPirenaicas {

    public Scanner sc;

    public boolean caso() {
        int numMontanyas = sc.nextInt();
        if (numMontanyas == 0) {
            return false;
        }
        int masAlta = 0, abadias = 0;
        int[] montanyas = new int[numMontanyas];
        for (int i = 0; i < numMontanyas; i++) {
            montanyas[i] = sc.nextInt();
        }
        for (int i = numMontanyas - 1; i >= 0; i--) {
            if (montanyas[i] > masAlta) {
                abadias++;
                masAlta = montanyas[i];
            }
        }

        System.out.println(abadias);
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E171_AbadiasPirenaicas().run();
    }

}
