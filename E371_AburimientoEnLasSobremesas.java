import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E371_AburimientoEnLasSobremesas {

    Scanner sc;

    boolean caso() {
        int lado = sc.nextInt();
        if (lado == 0) {
            return false;
        }
        System.out.println((lado * (lado + 1) / 2) * 3);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E371_AburimientoEnLasSobremesas().run();
    }
}
