package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E475_CameosDeStanLee {

    Scanner sc;

    void caso() {
        int numCameos = 0;
        int porogresoCameo = 0;
        String texto = sc.nextLine().toLowerCase();
        for (int j = 0; j < texto.length(); j++) {
            if ((texto.charAt(j) == 's') && porogresoCameo == 0) {
                porogresoCameo = 1;
            } else if (texto.charAt(j) == 't' && porogresoCameo == 1) {
                porogresoCameo = 2;
            } else if (texto.charAt(j) == 'a' && porogresoCameo == 2) {
                porogresoCameo = 3;
            } else if (texto.charAt(j) == 'n' && porogresoCameo == 3) {
                porogresoCameo = 4;
            } else if (texto.charAt(j) == 'l' && porogresoCameo == 4) {
                porogresoCameo = 5;
            } else if (texto.charAt(j) == 'e' && porogresoCameo == 5) {
                porogresoCameo = 6;
            } else if (texto.charAt(j) == 'e' && porogresoCameo == 6) {
                porogresoCameo = 0;
                numCameos++;
            }
        }
        System.out.println(numCameos);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E475_CameosDeStanLee().run();
    }
}
