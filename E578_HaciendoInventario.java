import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author ThePoisoned1
 */
public class E578_HaciendoInventario {
    Scanner sc;

    public static void main(String[] args) {
        new E578_HaciendoInventario().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        int cant = Integer.parseInt(sc.nextLine());
        if (cant == 0) {
            return false;
        }
        Set<String> productos = new TreeSet<>();
        for (int i = 0; i < cant; i++) {
            productos.add(sc.nextLine().toLowerCase());
        }
        System.out.println(productos.size());
        return true;
    }
}
