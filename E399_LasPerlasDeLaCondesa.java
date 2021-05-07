import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E399_LasPerlasDeLaCondesa {

    Scanner sc;
    ArrayList<Integer> tamanyos;

    boolean caso() {

        tamanyos.clear();
        String ladoDerecho = "";
        String LadoIzquierdo = "";
        int num = 1;
        while (num != 0) {
            num = sc.nextInt();
            if (num != 0) {
                tamanyos.add(num);
            }
        }
        if (tamanyos.isEmpty()) {
            return false;
        }
        if (tamanyos.size() % 2 == 0) {
            System.out.println("NO");
            return true;
        }
        if (tamanyos.size() == 1) {
            System.out.println(tamanyos.get(0));
            return true;
        }
        Collections.sort(tamanyos);
        for (int i = 1; i < tamanyos.size() - 1; i += 2) {
            if ((int) tamanyos.get(i) == (int) tamanyos.get(i - 1) && tamanyos.get(i) < tamanyos.get(i + 1)) {
                LadoIzquierdo += " " + Integer.toString(tamanyos.get(i));
                ladoDerecho = Integer.toString(tamanyos.get(i)) + " " + ladoDerecho;
            } else {
                System.out.println("NO");
                return true;
            }

        }
        if (tamanyos.size() > 1) {
            System.out.println((LadoIzquierdo.trim() + " " + tamanyos.get(tamanyos.size() - 1) + " " + ladoDerecho.trim()));
        }
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        tamanyos = new ArrayList<>();
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E399_LasPerlasDeLaCondesa().run();
    }
}
