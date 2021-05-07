import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E227_EligiendoCaramelos {

    Scanner sc;

    public void calcularLineaPascal(int tiposCaramelos, int caramelosRecibe) {
        BigInteger anterior = BigInteger.ONE;
        BigInteger siguiente;
        System.out.print(1);
        for (int i = 1; i <= caramelosRecibe; i++) {
            siguiente = anterior.multiply(BigInteger.valueOf(tiposCaramelos + 1 - i));
            siguiente = siguiente.divide(BigInteger.valueOf(i));
            System.out.print(" " + siguiente.mod(BigInteger.valueOf(1000000007)));
            anterior = siguiente;
        }
        System.out.println("");
    }

    public boolean caso() {
        int tiposCaramelos = sc.nextInt();
        int caramelosRecibe = sc.nextInt();
        if (tiposCaramelos == 0 && caramelosRecibe == 0) {
            return false;
        }
        calcularLineaPascal(tiposCaramelos, caramelosRecibe);
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E227_EligiendoCaramelos().run();
    }

}
