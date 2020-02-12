package AceptaElReto.AC;

import java.util.Scanner;
import java.util.PriorityQueue;

/**
 *
 * @author ThePoisoned1
 */
public class E289_LoQueCuestaSumar {

    Scanner sc;
    PriorityQueue<Long> numeros;

    boolean caso() {
        int candtidadNumeros = sc.nextInt();
        if (candtidadNumeros == 0) {
            return false;
        }
        numeros.clear();
        for (int i = 0; i < candtidadNumeros; i++) {
            numeros.add(sc.nextLong());
        }
        long sum = 0;
        long x, y;
        while (numeros.size() > 1) {
            x = numeros.poll();
            y = numeros.poll();
            numeros.add(x + y);
            sum += x + y;
        }

        System.out.println(sum);

        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        numeros = new PriorityQueue<>();
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E289_LoQueCuestaSumarb().run();
    }

}
