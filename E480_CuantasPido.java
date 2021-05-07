import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E480_CuantasPido {

    Scanner sc;

    void caso() {
        int cantUvas = sc.nextInt();
        int fallan = sc.nextInt();
        int deCada = sc.nextInt();

        int vecesRelacion = cantUvas / deCada;
        int uvasMalas = vecesRelacion * fallan;
        int faltan = cantUvas % deCada;
        if (faltan <= fallan) {
            uvasMalas += faltan;
        } else {
            uvasMalas += fallan;
        }

        System.out.println(uvasMalas);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E480_CuantasPido().run();
    }
}
