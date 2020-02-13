package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E300_PalabrasPentavocalicas {

    Scanner sc;

    void caso() {
        String palabra = sc.nextLine();
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;
        for (int k = 0; k < palabra.length(); k++) {
            switch (palabra.charAt(k)) {
                case 'a':
                    a = true;
                    break;
                case 'e':
                    e = true;
                    break;
                case 'i':
                    i = true;
                    break;
                case 'o':
                    o = true;
                    break;
                case 'u':
                    u = true;
                    break;
            }
            if (a && e && i && o && u) {
                System.out.println("SI");
                return;
            }
        }
        System.out.println("NO");
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
        new E300_PalabrasPentavocalicas().run();
    }
}
