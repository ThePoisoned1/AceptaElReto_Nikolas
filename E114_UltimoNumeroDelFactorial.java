import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E114_UltimoNumeroDelFactorial {

  Scanner sc;

    public boolean caso() {
        long num = sc.nextLong();
        if (num >= 5) {
            System.out.println(0);
        } else if (num == 4) {
            System.out.println(4);
        } else if (num == 3) {
            System.out.println(6);
        } else if (num == 2) {
            System.out.println(2);
        } else if (num == 1 || num == 0) {
            System.out.println(1);
        }
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E114_UltimoNumeroDelFactorial().run();
    }
}
