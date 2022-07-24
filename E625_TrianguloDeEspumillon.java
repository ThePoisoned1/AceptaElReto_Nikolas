import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E625_TrianguloDeEspumillon {
    Scanner sc;

    public static void main(String[] args) {
        new E625_TrianguloDeEspumillon().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {
        int numEspumuillones = sc.nextInt();
        Integer[] espumillones = new Integer[numEspumuillones];
        for (int i = 0; i < espumillones.length; i++) {
            espumillones[i] = sc.nextInt();
        }
        Arrays.sort(espumillones, Collections.reverseOrder());
        for (int i = 0; i < espumillones.length - 2; i++) {
            if (espumillones[i] < (espumillones[i + 1] + espumillones[i + 2])) {
                System.out.println(espumillones[i + 1] + espumillones[i + 2] + espumillones[i]);
                return;
            }
        }
        System.out.println("NO HAY NINGUNO");
    }
}
