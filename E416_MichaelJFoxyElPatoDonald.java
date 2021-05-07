import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E416_MichaelJFoxyElPatoDonald {

    Scanner sc;

    public boolean mismoCumpleanyos(ArrayList<String> bDays) {
        Collections.sort(bDays);
        for (int i = 1; i < bDays.size(); i++) {
            if (bDays.get(i).equals(bDays.get(i - 1))) {
                return true;
            }
        }
        return false;
    }

    public boolean caso() {
        int in = Integer.parseInt(sc.nextLine());
        if (in == 0) {
            return false;
        }
        ArrayList<String> bDays = new ArrayList<>();
        String input = sc.nextLine();
        int barras = 0;
        String cumple = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '/') {
                barras++;
            }
            cumple += input.charAt(i);
            if (barras == 2) {
                barras = 0;
                i += 5;
                bDays.add(cumple);
                cumple = "";
            }
        }

        System.out.println(mismoCumpleanyos(bDays) ? "SI":"NO");

        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E416_MichaelJFoxyElPatoDonald().run();
    }
}

