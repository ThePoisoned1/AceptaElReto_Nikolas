package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E460_BaseRaizDe10 {

    Scanner sc;

    boolean caso() {
        if (!sc.hasNext()) {
            return false;
        }
        StringBuilder numero = new StringBuilder(sc.next());
        for (int i = 1; i < numero.length(); i += 2) {
            numero.insert(i, "0");
        }
        System.out.println(numero);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E460_BaseRaizDe10().run();
    }
}
