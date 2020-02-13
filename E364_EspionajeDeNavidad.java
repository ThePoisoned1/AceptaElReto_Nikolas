package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E364_EspionajeDeNavidad {

    Scanner sc;

    String descifrar(String mensaje) {
        String aux, descifrado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            switch (mensaje.charAt(i)) {
                case 'A':
                    aux = "B";
                    break;
                case 'B':
                    aux = "C";
                    break;
                case 'C':
                    aux = "D";
                    break;
                case 'D':
                    aux = "E";
                    break;
                case 'E':
                    aux = "F";
                    break;
                case 'F':
                    aux = "G";
                    break;
                case 'G':
                    aux = "H";
                    break;
                case 'H':
                    aux = "I";
                    break;
                case 'I':
                    aux = "J";
                    break;
                case 'J':
                    aux = "K";
                    break;
                case 'K':
                    aux = "L";
                    break;
                case 'L':
                    aux = "M";
                    break;
                case 'M':
                    aux = "N";
                    break;
                case 'N':
                    aux = "O";
                    break;
                case 'O':
                    aux = "P";
                    break;
                case 'P':
                    aux = "Q";
                    break;
                case 'Q':
                    aux = "R";
                    break;
                case 'R':
                    aux = "S";
                    break;
                case 'S':
                    aux = "T";
                    break;
                case 'T':
                    aux = "U";
                    break;
                case 'U':
                    aux = "V";
                    break;
                case 'V':
                    aux = "W";
                    break;
                case 'W':
                    aux = "X";
                    break;
                case 'X':
                    aux = "Y";
                    break;
                case 'Y':
                    aux = "Z";
                    break;
                case 'Z':
                    aux = "A";
                    break;
                default:
                    aux = " ";

            }
            descifrado = descifrado + aux;
        }
        return descifrado;
    }

    boolean caso() {
        String cifrado = sc.nextLine();
        if (cifrado.equals("FIN")) {
            return false;
        }
        System.out.println(descifrar(cifrado));
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E364_EspionajeDeNavidad().run();
    }

}
