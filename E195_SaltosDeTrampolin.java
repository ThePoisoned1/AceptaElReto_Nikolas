import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E195_SaltosDeTrampolin {

    Scanner sc;

    boolean caso() {
        if (!sc.hasNext()) {
            return false;
        }
        double[] puntuaciones = new double[7];
        for (int i = 0; i < 7; i++) {
            puntuaciones[i] = Double.parseDouble(sc.next());
        }
        Arrays.sort(puntuaciones);
        double puntuacion = (puntuaciones[2] + puntuaciones[3] + puntuaciones[4]) * 2;
        if (puntuacion == (int) puntuacion) {
            System.out.println((int) puntuacion);
        } else {
            System.out.println((int) puntuacion++);
        }
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E195_SaltosDeTrampolin().run();
    }
}
