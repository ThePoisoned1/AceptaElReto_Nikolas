import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E104_Moviles {

    Scanner sc;

    public int equilibrio() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == 0) {
            a = equilibrio();
        }
        if (c == 0) {
            c = equilibrio();
        }

        if (b * a == c * d) {
            return a + c;
        }
        return 0;
    }

    public boolean caso() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == 0 && b == 0 && c == 0 && d == 0) {
            return false;
        }

        if (a == 0) {
            a = equilibrio();
        }
        if (c == 0) {
            c = equilibrio();
        }

        if (b * a == c * d && (a != 0 && c != 0)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E104_Moviles().run();
    }
}
