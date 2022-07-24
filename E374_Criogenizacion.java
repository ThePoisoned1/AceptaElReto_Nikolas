import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E374_Criogenizacion {
    Scanner sc;

    public static void main(String[] args) {
        new E374_Criogenizacion().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {

        long max = 0, m = 0;
        long min = Long.MAX_VALUE, n = 0;
        long num;
        do {
            num = sc.nextLong();
            if (num != 0) {
                if (num > max) {
                    max = num;
                    m = 1;
                } else if (num == max) {
                    m += 1;
                }
                if (num < min) {
                    min = num;
                    n = 1;
                } else if (num == min) {
                    n += 1;
                }
            }
        } while (num != 0);
        System.out.println(min + " " + n + " " + max + " " + m);
    }
}
