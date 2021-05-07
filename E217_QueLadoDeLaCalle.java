import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E217_QueLadoDeLaCalle {

    Scanner sc;

    boolean caso() {
        int vivienda = sc.nextInt();
        if (vivienda == 0) {
            return false;
        }
        System.out.println(vivienda % 2 == 0 ? "DERECHA" : "IZQUIERDA");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E217_QueLadoDeLaCalle().run();
    }
}
