package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E101_CuadradosDiabolicosYEsotericos {

    Scanner sc;
    int constanteMagica;
    int dimensiones;
    int[][] cuadrado;
    int cantNumeros;

    boolean comprobarEsoterico() {
        int constanteMagica2 = 4 * constanteMagica / dimensiones;
        if (constanteMagica2 != cuadrado[0][0]
                + cuadrado[dimensiones-1][dimensiones-1]
                + cuadrado[0][dimensiones-1]
                + cuadrado[dimensiones-1][0]) {
            return false;
        }
        int mitad = dimensiones / 2;
        if (dimensiones % 2 == 0) {
            if (2 * constanteMagica2 != cuadrado[0][mitad]
                    + cuadrado[0][mitad - 1]
                    + cuadrado[mitad][0]
                    + cuadrado[mitad - 1][0]
                    + cuadrado[dimensiones-1][mitad]
                    + cuadrado[dimensiones-1][mitad - 1]
                    + cuadrado[mitad][dimensiones-1]
                    + cuadrado[mitad - 1][dimensiones-1]) {
                return false;
            }
            if (constanteMagica2 != cuadrado[mitad][mitad]
                    + cuadrado[mitad][mitad - 1]
                    + cuadrado[mitad - 1][mitad - 1]
                    + cuadrado[mitad - 1][mitad]) {
                return false;
            }
        } else {
            if (constanteMagica2 != cuadrado[0][mitad]
                    + cuadrado[mitad][0]
                    + cuadrado[mitad][dimensiones-1]
                    + cuadrado[dimensiones-1][mitad]) {
                return false;
            }
            if (constanteMagica2 != 4 * cuadrado[mitad][mitad]) {
                return false;
            }
        }
        return true;
    }

    boolean sumaDiagonales() {
        int sumaDiagonales = 0;
        int sumaDiagonales2 = 0;
        for (int i = 0; i < dimensiones; i++) {
            sumaDiagonales += cuadrado[i][i];
            sumaDiagonales2 += cuadrado[i][dimensiones - i - 1];
        }
        return !(sumaDiagonales != constanteMagica || sumaDiagonales2 != constanteMagica);
    }

    boolean sumaColumnas() {
        int sumaColumnas;
        for (int i = 0; i < dimensiones; i++) {
            sumaColumnas = 0;
            for (int j = 0; j < dimensiones; j++) {
                sumaColumnas += cuadrado[j][i];
            }
            if (sumaColumnas != constanteMagica) {
                return false;
            }
        }
        return true;
    }

    boolean caso() {
        dimensiones = sc.nextInt();
        if (dimensiones == 0) {
            return false;
        }
        cuadrado = new int[dimensiones][dimensiones];
        cantNumeros = dimensiones * dimensiones;
        int[] numerosUsados = new int[cantNumeros];
        int sumaLineas;
        boolean esoterico = true;
        for (int i = 0; i < dimensiones; i++) {
            sumaLineas = 0;
            for (int j = 0; j < dimensiones; j++) {
                cuadrado[i][j] = sc.nextInt();
                sumaLineas += cuadrado[i][j];
                if (cuadrado[i][j] > cantNumeros) {
                    esoterico = false;
                }
                if (esoterico) {
                    if (numerosUsados[(int) cuadrado[i][j] - 1] == 1) {
                        esoterico = false;
                    } else {
                        numerosUsados[(int) cuadrado[i][j] - 1] = 1;
                    }
                }
            }
            if (i == 0) {
                constanteMagica = sumaLineas;
            }
            if (sumaLineas != constanteMagica) {
                System.out.println("NO");
                sc.nextLine();
                return true;
            }
        }
        if (!sumaColumnas() || !sumaDiagonales()) {
            System.out.println("NO");
            sc.nextLine();
            return true;
        }
        if (!esoterico) {
            System.out.println("DIABOLICO");
            return true;
        } else {
            if (comprobarEsoterico()) {
                System.out.println("ESOTERICO");
            } else {
                System.out.println("DIABOLICO");
            }

        }
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E101_CuadradosDiabolicosYEsotericos().run();
    }
}
