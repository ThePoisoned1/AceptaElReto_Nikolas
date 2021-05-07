import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E290_AlturaDeUnArbolBinario {

    Scanner sc;
    int pos;
    String arbol;

    int hallarAltura() {
        int aux1 = 0, aux2 = 0;

        if (pos < arbol.length() && arbol.charAt(pos) == '*') {
            pos++;
            aux1 = hallarAltura() + 1;
        } else {
            pos++;
        }
        if (pos < arbol.length() && arbol.charAt(pos) == '*') {
            pos++;
            aux2 = hallarAltura() + 1;
        } else {
            pos++;
        }
        if (aux1 > aux2) {
            return aux1;
        } else {
            return aux2;
        }
    }

    void caso() {
        arbol = sc.next();
        pos = 0;
        int hMax = 0;
        if (arbol.charAt(0) == '*') {
            hMax += hallarAltura();
        }
        System.out.println(hMax);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E290_AlturaDeUnArbolBinario().run();
    }
}
