import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E522_LaDesconfianzaDeLaASALE {

    Scanner sc;

    int checkValorLetra(int pos, String palabra) {
        char letra = palabra.charAt(pos);
        switch (letra) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                if (pos < palabra.length() - 1
                        && palabra.charAt(pos + 1) == 'h') {
                    return 4;
                }
                return 3;
            case 'd':
                return 5;
            case 'e':
                return 6;
            case 'f':
                return 7;
            case 'g':
                return 8;
            case 'h':
                return 9;
            case 'i':
                return 10;
            case 'j':
                return 11;
            case 'k':
                return 12;
            case 'l':
                if (pos < palabra.length() - 1
                        && palabra.charAt(pos + 1) == 'l') {
                    return 14;
                }
                return 13;
            case 'm':
                return 15;
            case 'n':
                return 16;
            case 'o':
                return 17;
            case 'p':
                return 18;
            case 'q':
                return 19;
            case 'r':
                return 20;
            case 's':
                return 21;
            case 't':
                return 22;
            case 'u':
                return 23;
            case 'v':
                return 24;
            case 'w':
                return 25;
            case 'x':
                return 26;
            case 'y':
                return 27;
            case 'z':
                return 28;
        }

        return 1;
    }

    boolean caso() {
        if (!sc.hasNext()) {
            return false;
        }
        String palabra1 = sc.next();
        String palabra2 = sc.next();
        int longPalabra1 = palabra1.length();
        int longPalabra2 = palabra2.length();
        int posPalabra1 = 0;
        int posPalabra2 = 0;
        int valorLetraPalabra1;
        int valorLetraPalabra2;
        while (longPalabra1 > posPalabra1 && longPalabra2 > posPalabra2) {
            valorLetraPalabra1 = checkValorLetra(posPalabra1, palabra1);
            valorLetraPalabra2 = checkValorLetra(posPalabra2, palabra2);
            if (valorLetraPalabra1 > valorLetraPalabra2) {
                System.out.println(palabra2);
                return true;
            } else if (valorLetraPalabra2 > valorLetraPalabra1) {
                System.out.println(palabra1);
                return true;
            }
            if (valorLetraPalabra1 == 14 || valorLetraPalabra1 == 4) {
                posPalabra1++;
            }
            if (valorLetraPalabra2 == 14 || valorLetraPalabra2 == 4) {
                posPalabra2++;
            }
            posPalabra1++;
            posPalabra2++;
        }
        if (longPalabra1 > longPalabra2) {
            System.out.println(palabra2);
        } else {
            System.out.println(palabra1);
        }
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E522_LaDesconfianzaDeLaASALE().run();
    }
}
