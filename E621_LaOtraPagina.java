import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E621_LaOtraPagina {
    Scanner sc;

    public static void main(String[] args) {
        new E621_LaOtraPagina().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? num + 1 : num - 1);

    }
}
