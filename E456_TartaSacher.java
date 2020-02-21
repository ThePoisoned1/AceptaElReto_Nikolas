package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E456_TartaSacher {

    Scanner sc;

    void caso() {
        int cuadradosTableta = sc.nextInt() * sc.nextInt();
        int necesita = sc.nextInt();
        int tabletas = necesita / cuadradosTableta;
        System.out.println(necesita % cuadradosTableta == 0 ? tabletas : (tabletas + 1));
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E456_TartaSacher().run();
    }
}
