import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E539_FelizDecadaNueva {

    Scanner sc;

    boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }
         int periodo = Math.abs(sc.nextInt() - sc.nextInt());
         sc.nextLine();
            if ((periodo + 1) % 10 == 0) {
                System.out.println("FELIZ DECADA NUEVA");
            } else {
                System.out.println("TOCA ESPERAR");
            }
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E539_FelizDecadaNueva().run();
    }
}
