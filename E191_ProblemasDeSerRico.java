package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E191_ProblemasDeSerRico {

    Scanner sc;

    public void caso() {
        int numeroCompartimentos = sc.nextInt();
        int nasGrande = sc.nextInt();
        int disminucion = sc.nextInt();
        int total = 0;
        for (int j = 0; j < numeroCompartimentos; j++) {
            total += masGrande;
            masGrande -= disminucion;
        }
        System.out.println(total);
    }

    public void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E191_ProblemasDeSerRico().run();
    }

}
