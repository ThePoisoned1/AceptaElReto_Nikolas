import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E623_ElJokerDeLaPrimitiva {
    Scanner sc;

    public static void main(String[] args) {
        new E623_ElJokerDeLaPrimitiva().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {
        String[] ganador = sc.next().split("");
        String[] num = sc.next().split("");
        Arrays.sort(ganador);
        Arrays.sort(num);
        boolean correct = true;

        for (int i = 0; i < ganador.length; i++) {
            if (!ganador[i].equals(num[i])) {
                correct = false;
                break;
            }
        }
        System.out.println(correct ? "GANA" : "PIERDE");

    }
}
