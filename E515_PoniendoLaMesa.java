import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E515_PoniendoLaMesa {

    Scanner sc;

    boolean caso() {
        int numCopas = sc.nextInt();
        if (numCopas == 0) {
            return false;
        }
        long contador = 0;
        long viajes = 0;
        while (numCopas > 0) {
            if (numCopas % 2 == 0 && contador % 2 != 0) {
                numCopas--;
            }
            numCopas--;
            viajes++;
            contador++;
        }
        System.out.println(viajes);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E515_PoniendoLaMesa().run();
    }
}
