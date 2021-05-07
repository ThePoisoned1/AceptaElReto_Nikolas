import java.util.Scanner;

/**
 *
 * @author thePoisoned1
 */
public class E376_SietePicos {

    Scanner sc;

    boolean caso() {
        int numAlturas = sc.nextInt();
        if (numAlturas == 0) {
            return false;
        }
        int[] alturas = new int[numAlturas];
        for (int i = 0; i < numAlturas; i++) {
            alturas[i] = sc.nextInt();
        }
        int numPicos = 0;

        if (alturas[0] > alturas[alturas.length - 1] && alturas[0] > alturas[1]) {
            numPicos++;
        }
        if (alturas[alturas.length - 2] < alturas[alturas.length - 1] && alturas[alturas.length - 1] > alturas[0]) {
            numPicos++;
        }
        for (int i = 1; i < numAlturas - 1; i++) {
            if (alturas[i - 1] < alturas[i] && alturas[i] > alturas[i + 1]) {
                numPicos++;
                i++;
            }
        }
        System.out.println(numPicos);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E376_SietePicos().run();
    }
}
