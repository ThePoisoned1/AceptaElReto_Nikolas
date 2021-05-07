import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E512_DonerSospechoso {

    Scanner sc;

    void caso() {
        int kilosConejo = sc.nextInt();
        int kilosCaballo = sc.nextInt();
        System.out.println((int) kilosConejo * 100 / (kilosConejo + kilosCaballo));
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E512_DonerSospechoso().run();
    }
}
