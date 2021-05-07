import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E161_CalculoDeLaMediana {

    Scanner sc;

    boolean caso() {
        int cantDatos = sc.nextInt();
        if (cantDatos == 0) {
            return false;
        }
        int[] numeros = new int[cantDatos];
        for (int i = 0; i < cantDatos; i++) {
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        if (cantDatos % 2 == 0) {
            System.out.println(numeros[cantDatos / 2] + numeros[(cantDatos / 2) - 1]);
        } else {
            System.out.println(numeros[cantDatos / 2] * 2);
        }
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E161_CalculoDeLaMediana().run();
    }
}
