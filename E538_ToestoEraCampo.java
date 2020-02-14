package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E538_ToestoEraCampo {

    Scanner sc;

    boolean caso() {
        int edadAbuelo = sc.nextInt();
        int edadIglesia = sc.nextInt();
        if (edadAbuelo == 0 && edadIglesia == 0) {
            return false;
        }
        System.out.println(edadAbuelo >= edadIglesia ? "CUERDO" : "SENIL");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E538_ToestoEraCampo().run();
    }
}
