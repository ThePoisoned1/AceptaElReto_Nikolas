import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E581_EscapandoDeSusanita {
    Scanner sc;

    public static void main(String[] args) {
        new E581_EscapandoDeSusanita().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }

    }

    private void caso() {
        int numAmigos = sc.nextInt();
        int salto = sc.nextInt() - 1;
        List<Integer> coro = new ArrayList<>();
        for (int i = 1; i <= numAmigos; i++) {
            coro.add(i);
        }
        int pos = 0;
        int size = coro.size();
        while (size > 1) {
            pos = (pos + salto) % (size);
            coro.remove(pos);
            size--;
        }
        System.out.println(coro.get(0));
    }
}
