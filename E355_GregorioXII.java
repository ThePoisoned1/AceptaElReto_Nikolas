import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E355_GregorioXII {

    Scanner sc;

    void caso() {
        int anyo = sc.nextInt();
        if (anyo % 4 == 0) {
            if (anyo % 100 == 0) {
                if (anyo % 400 == 0) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
            } else {
                System.out.println("29");
            }
        } else {
            System.out.println("28");
        }
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E355_GregorioXII().run();
    }
}
