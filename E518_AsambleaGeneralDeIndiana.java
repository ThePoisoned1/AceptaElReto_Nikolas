package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E518_AsambleaGeneralDeIndiana {

    Scanner sc;

    boolean comprobarDiaMes(int dia, int mes) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia <= 31) {
                    return true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia <= 30) {
                    return true;
                }
                break;
            case 2:
                if (dia <= 28) {
                    return true;
                }
                break;
        }
        return false;
    }

    boolean caso() {
        String[] pi = sc.next().split("\\.");//las "\\"son necesarias para poder hacer el split en un .
        if (pi[0].equals("0") && pi[1].equals("00")) {
            return false;
        }
        int mes = Integer.parseInt(pi[0]);
        if (mes > 12 || mes <= 0) {
            System.out.println("NO");
            return true;
        }
        int dia = Integer.parseInt(pi[1]);
        if (dia <= 0 || dia > 31) {
            System.out.println("NO");
            return true;
        }
        System.out.println(comprobarDiaMes(dia, mes) ? "SI" : "NO");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E518_AsambleaGeneralDeIndiana().run();
    }
}
