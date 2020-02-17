package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E186_YElGanadorEs {

    Scanner sc;
    int[] globosEquipo = new int[20];

    boolean caso() {
        int numEquipos = sc.nextInt();
        int numGlobos = sc.nextInt();
        if (numEquipos == 0 && numGlobos == 0) {
            return false;
        }
        for (int i = 0; i < 20; i++) {
            globosEquipo[i] = 0;
        }
        int equipo;
        for (int i = 0; i < numGlobos; i++) {
            equipo = sc.nextInt();
            sc.nextLine();
            globosEquipo[equipo - 1]++;
        }
        int globosGanador = globosEquipo[0];
        boolean empate = false;
        int equipoGanador = 1;
        for (int i = 1; i < numEquipos; i++) {
            if (globosEquipo[i] > globosGanador) {
                globosGanador = globosEquipo[i];
                equipoGanador = i + 1;
                empate = false;
            } else if (globosEquipo[i] == globosGanador) {
                empate = true;
            }
        }
        System.out.println(empate ? "EMPATE" : equipoGanador);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);

        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E186_YElGanadorEs().run();
    }
}
