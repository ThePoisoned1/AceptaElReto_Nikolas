package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E228_CodificacionEspejo {

    Scanner sc;
    int pos;
    String input;

    public String codificacionMensaje() {
        String derecha = "", izquierda = "";
        if (input.charAt(pos) != ' ') {
            pos++;
            derecha = input.charAt(pos - 1) + codificacionMensaje();
        } else {
            pos++;
        }
        if (input.charAt(pos) != ' ') {
            pos++;
            izquierda = input.charAt(pos - 1) + codificacionMensaje();
        } else {
            pos++;
        }
        return izquierda + derecha;
    }

    public boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }
        input = sc.nextLine();
        pos = 0;
        if (input.charAt(pos) != ' ') {
            pos++;
            System.out.println(input.charAt(0) + codificacionMensaje());
        }
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E228_CodificacionEspejo().run();
    }
}
