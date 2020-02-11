package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E190_DividirFactoriales {

    Scanner sc;

    public boolean caso() {
        int num = sc.nextInt();
        int den = sc.nextInt();
        if (num < den) {
            return false;
        }
        long sum = 1;
        for (int i = num; i > den; i--) {
            sum = sum * i;
        }
        System.out.println(sum);
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E190_DividirFactoriales().run();
    }
}
