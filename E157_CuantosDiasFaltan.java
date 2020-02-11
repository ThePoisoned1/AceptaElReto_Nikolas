package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E157_CuantosDiasFaltan {

    Scanner sc;
    final int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void caso() {
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int faltan = diasMeses[mes - 1] - dia;
        for (int i = mes; i < 12; i++) {
            faltan += diasMeses[i];
        }
        System.out.println(faltan);
    }

    public void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E157_CuantosDiasFaltan().run();
    }
}
