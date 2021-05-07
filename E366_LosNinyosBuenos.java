import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E366_LosNinyosBuenos {

    Scanner sc;

    class ninyo implements Comparable<ninyo> {

        int puntos;
        int pesoRegalos;

        ninyo(int puntos, int pesoRegalos) {
            this.puntos = puntos;
            this.pesoRegalos = pesoRegalos;
        }

        @Override
        public int compareTo(ninyo o) {
            if (this.puntos > o.puntos) {
                return -1;
            } else if (this.puntos < o.puntos) {
                return 1;
            } else {
                if (this.pesoRegalos < o.pesoRegalos) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }

    public boolean caso() {
        int numeroNinyos = sc.nextInt();
        if (numeroNinyos == 0) {
            return false;
        }
        ninyo[] ninyos = new ninyo[numeroNinyos];
        for (int i = 0; i < numeroNinyos; i++) {
            ninyos[i] = new ninyo(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(ninyos);
        for (int i = 0; i < numeroNinyos; i++) {
            System.out.println(ninyos[i].puntos + " " + ninyos[i].pesoRegalos);
        }
        System.out.println("");
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E366_LosNinyosBuenos().run();
    }
}
