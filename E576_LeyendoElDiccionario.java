import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E576_LeyendoElDiccionario {
    Scanner sc;

    public static void main(String[] args) {
        new E576_LeyendoElDiccionario().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        int tiempoPorDef = sc.nextInt();
        if (tiempoPorDef == 0) {
            return false;
        }
        int definiciones = sc.nextInt();
        int tiempoTotal = definiciones * tiempoPorDef;
        while (definiciones != 0) {
            definiciones = sc.nextInt();
            tiempoTotal += tiempoPorDef * definiciones;
        }
        System.out.printf("%02d:%02d:%02d", tiempoTotal / 3600, tiempoTotal / 60 % 60, tiempoTotal % 60);
        System.out.println();
        return true;
    }
}
