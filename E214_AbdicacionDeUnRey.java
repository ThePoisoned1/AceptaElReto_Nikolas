import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E214_AbdicacionDeUnRey {

    Scanner sc;
    HashMap<String, Integer> dinastia = new HashMap<>();

    public boolean caso() {
        int numeroReyes = sc.nextInt();
        if (numeroReyes == 0) {
            return false;
        }

        dinastia.clear();
        String rey;
        for (int i = 0; i < numeroReyes; i++) {
            rey = sc.next();
            if (dinastia.containsKey(rey)) {
                dinastia.put(rey, dinastia.get(rey) + 1);
            } else {
                dinastia.put(rey, 1);
            }
        }
        numeroReyes = sc.nextInt();

        for (int i = 0; i < numeroReyes; i++) {
            rey = sc.next();
            if (dinastia.containsKey(rey)) {
                dinastia.put(rey, dinastia.get(rey) + 1);
            } else {
                dinastia.put(rey, 1);
            }
            System.out.println(dinastia.get(rey));
        }
        System.out.println("");
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E214_AbdicacionDeUnRey().run();
    }
}
