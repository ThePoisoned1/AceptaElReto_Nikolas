import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E149_SanFermines {

    Scanner sc;

    boolean caso() {
        if (!sc.hasNext()) {
            return false;
        }
        int numToros = sc.nextInt();
        int velocidadToro, velocidadPersona = 0;
        for (int i = 0; i < numToros; i++) {
            velocidadToro = sc.nextInt();
            if (velocidadToro > velocidadPersona) {
                velocidadPersona = velocidadToro;
            }
        }
        System.out.println(velocidadPersona);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E149_SanFermines().run();
    }
}
