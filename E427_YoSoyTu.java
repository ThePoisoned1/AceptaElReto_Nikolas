import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E427_YoSoyTu {

    Scanner sc;

    void caso() {
        String persona = sc.nextLine();
        String parentesco = sc.nextLine();
        if (persona.equals("Luke") && parentesco.equals("padre")) {
            System.out.println("TOP SECRET");
        } else {
            System.out.println(persona + ", yo soy tu " + parentesco);
        }
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E427_YoSoyTu().run();
    }
}
