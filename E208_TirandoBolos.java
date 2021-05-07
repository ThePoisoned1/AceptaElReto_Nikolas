import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E208_TirandoBolos {
    Scanner sc;

    public static void main(String[] args) {
        new E208_TirandoBolos().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        long filas = sc.nextInt();
        long filaGolpeada = sc.nextInt();
        if (filas <= 0 || filaGolpeada <= 0) {
            return false;
        }
        long filasAfectadas = filas - filaGolpeada + 1;
        System.out.println(((filas * (1 + filas)) / 2) - (((filasAfectadas) * (1 + filasAfectadas)) / 2));
        return true;
    }

}
