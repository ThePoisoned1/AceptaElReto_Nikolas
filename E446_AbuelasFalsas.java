import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E446_AbuelasFalsas {

    Scanner sc;

    void caso() {
        String nombreNieto = sc.next();
        int cantNombres = Integer.parseInt(sc.next());
        String nombre;
        boolean verdadera = true;
        for (int j = 0; j < cantNombres - 1; j++) {
            nombre = sc.next();
            if (nombreNieto.equals(nombre)) {
                verdadera = false;
            }
        }
        nombre = sc.next();
        if (!verdadera || cantNombres == 1) {
            System.out.println("FALSA");
            return;
        }
        if (nombre.equals(nombreNieto)) {
            System.out.println("VERDADERA");
        } else {
            System.out.println("FALSA");
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
        new E446_AbuelasFalsas().run();
    }
}
