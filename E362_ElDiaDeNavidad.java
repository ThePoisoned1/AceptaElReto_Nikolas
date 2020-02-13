package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E362_ElDiaDeNavidad {

    Scanner sc;

    void caso() {
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        if (dia == 25 && mes == 12) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E362_ElDiaDeNavidad().run();
    }
}
