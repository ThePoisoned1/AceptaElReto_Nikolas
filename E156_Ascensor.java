package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E156_Ascensor {

    Scanner sc;

    boolean caso() {
        int planta = sc.nextInt();
        if (planta < 0) {
            return false;
        }
        int suma = 0, plantaSiguiente = 0;
        while (plantaSiguiente >= 0) {
            plantaSiguiente = sc.nextInt();
            if (plantaSiguiente >= 0) {
                suma += Math.abs(planta - plantaSiguiente);
                planta = plantaSiguiente;
            }
        }
        System.out.println(suma);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E156_Ascensor().run();
    }
}
