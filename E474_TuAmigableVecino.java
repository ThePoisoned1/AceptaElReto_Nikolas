package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E474_TuAmigableVecino {

    Scanner sc;

    void caso() {
        long posSpiderMan = sc.nextLong();
        long bomba1=sc.nextLong();
        long bomba2=sc.nextLong();
        long distanciaTotal;
        if (Math.abs(posSpiderMan - bomba1)
                > Math.abs(posSpiderMan - bomba2)) {

            distanciaTotal = Math.abs(posSpiderMan - bomba2);
            distanciaTotal = distanciaTotal + Math.abs(bomba2 - bomba1);
        } else {
            distanciaTotal = Math.abs(posSpiderMan - bomba1);
            distanciaTotal = distanciaTotal + Math.abs(bomba1 -bomba2);
        }
        System.out.println(distanciaTotal);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E474_TuAmigableVecino().run();
    }
}
