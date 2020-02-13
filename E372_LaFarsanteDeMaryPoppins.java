package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E372_LaFarsanteDeMaryPoppins {

    Scanner sc;

    void caso() {
        String palabra = sc.next();
        char[] palabraPoppins = new char[palabra.length()];
        boolean primeraMayuscula = false;
        if (Character.isUpperCase(palabra.charAt(0))) {
            primeraMayuscula = true;
            palabra = palabra.toLowerCase();
        }
        for (int j = 0; j < palabra.length(); j++) {
            palabraPoppins[j] = palabra.charAt(palabra.length() - 1 - j);
        }
        if (primeraMayuscula) {
            palabraPoppins[0] = Character.toUpperCase(palabraPoppins[0]);
        }
        System.out.println(palabraPoppins);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E372_LaFarsanteDeMaryPoppins().run();
    }
}
