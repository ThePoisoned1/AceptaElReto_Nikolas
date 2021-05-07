import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E293_Artropodos {

    Scanner sc;

    void caso() {
        System.out.println(sc.nextInt() * 6
                + sc.nextInt() * 8
                + sc.nextInt() * 10
                + sc.nextInt() * 2 * sc.nextInt());
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E293_Artropodos().run();
    }

}
