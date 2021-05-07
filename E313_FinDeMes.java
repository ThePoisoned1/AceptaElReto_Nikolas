import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E313_FinDeMes {

    Scanner sc;

    void caso() {
        System.out.println(sc.nextInt() + sc.nextInt() >= 0 ? "SI" : "NO");
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E313_FinDeMes().run();
    }
}
