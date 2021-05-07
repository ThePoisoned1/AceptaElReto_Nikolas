import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E587_GorrosDeColores {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new E587_GorrosDeColores().run();
    }

    private void run() {
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            caso();
        }
    }

    private void caso() {
        int cont = 0;
        String s = sc.nextLine();
        for (int j = 0; j < s.length() - 1; j++) {
            if (j % 2 == 0) {
                if (s.charAt(j) == s.charAt(j + 1))
                    cont++;
            } else {
                cont++;
            }
        }
        System.out.println(cont + 1);
    }
}
