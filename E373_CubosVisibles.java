import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E373_CubosVisibles {
    Scanner sc;

    public static void main(String[] args) {
        new E373_CubosVisibles().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {

        long n = sc.nextLong();
        long corners = 8;
        long edges = (n - 2) * 12;
        long centers = (n - 2) * (n - 2) * 6;
        System.out.println(corners + edges + centers);

    }
}
