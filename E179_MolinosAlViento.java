import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E179_MolinosAlViento {

    Scanner sc;

    boolean caso() {
        int cantMolinos = sc.nextInt();
        if (cantMolinos == 0) {
            return false;
        }
        int[] energiaMolinos = new int[cantMolinos + 1];
        for (int i = 1; i <= cantMolinos; i++) {
            energiaMolinos[i] = energiaMolinos[i - 1] + sc.nextInt();
        }
        int numConsultas = sc.nextInt();
        int inicio, fin;
        for (int i = 0; i < numConsultas; i++) {
            inicio = sc.nextInt();
            fin = sc.nextInt();
            System.out.println(energiaMolinos[fin] - energiaMolinos[inicio - 1]);
        }
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E179_MolinosAlViento().run();
    }
}
