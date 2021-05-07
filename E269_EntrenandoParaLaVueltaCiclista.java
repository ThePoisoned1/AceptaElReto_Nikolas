import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E269_EntrenandoParaLaVueltaCiclista {

    Scanner sc;

    void caso() {
        String[] distancias = sc.nextLine().split(" ");
        int dist = 0;
        int aux = 0;
        for (String i : distancias) {
            if (!i.equals("0")) {
                aux += Integer.parseInt(i);
                dist = dist + 2 * aux;
            }
        }
        System.out.println(dist);

    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E269_EntrenandoParaLaVueltaCiclista().run();
    }
}
