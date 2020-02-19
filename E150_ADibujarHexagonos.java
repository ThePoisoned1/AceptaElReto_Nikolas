package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E150_ADibujarHexagonos {

    Scanner sc;

    boolean caso() {
        int lado = sc.nextInt();
        String caracter = sc.next();
        if (lado == 0 && caracter.equals("0")) {
            return false;
        }
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < lado + (i * 2); j++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }

        for (int i = 1; i < lado; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < lado + (lado - i - 1) * 2; j++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }

        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E150_ADibujarHexagonos().run();
    }
}
