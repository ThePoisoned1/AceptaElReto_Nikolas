import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E440_EscalandoElEverest {

    Scanner sc;

    boolean caso() {
        int numEscaladores = sc.nextInt();
        if (numEscaladores == 0) {
            return false;
        }
        int numGrupos = 1, grupoMax = 0, grupoMin = 10001, grupo = 1;
        long v, vPrimero = sc.nextLong();
        for (int i = 1; i < numEscaladores; i++) {
            v = sc.nextLong();
            if (v < vPrimero) {
                numGrupos++;
                if (grupo > grupoMax) {
                    grupoMax = grupo;
                }
                if (grupo < grupoMin) {
                    grupoMin = grupo;
                }
                grupo = 1;
                vPrimero = v;
            } else {
                grupo++;
            }
        }
        if (grupo > grupoMax) {
            grupoMax = grupo;
        }
        if (grupo < grupoMin) {
            grupoMin = grupo;
        }
        System.out.println(numGrupos + " " + grupoMin + " " + grupoMax);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso());
    }

    public static void main(String[] args) {
        new E440_EscalandoElEverest().run();
    }
}
