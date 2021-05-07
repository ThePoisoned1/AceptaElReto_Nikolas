import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E577_CucharadasDeSopa {
    Scanner sc;

    public static void main(String[] args) {
        new E577_CucharadasDeSopa().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }

    }

    private void caso() {
        int diceQueToma = sc.nextInt();
        int diceQueQuedan = sc.nextInt();
        int total = sc.nextInt();
        int seReparten = total - diceQueToma;
        System.out.println(seReparten <= diceQueQuedan ? seReparten + 1 : total - (total - diceQueQuedan) + 1);
    }
}
