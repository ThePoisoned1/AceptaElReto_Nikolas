import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E624_DoblandoCalcetines {
    Scanner sc;

    public static void main(String[] args) {
        new E624_DoblandoCalcetines().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        int num = sc.nextInt();
        if (num == 0) {
            return false;
        }
        ArrayList<Integer> abiertos = new ArrayList<>();
        int max = 0;
        int numAbiertos = 0;
        int calcetin;
        for (int i = 0; i < num; i++) {
            calcetin = sc.nextInt();
            if (abiertos.contains(calcetin)) {
                abiertos.remove((Object) calcetin);
                numAbiertos--;
            } else {
                abiertos.add(calcetin);
                numAbiertos++;
                if (max < numAbiertos) {
                    max = numAbiertos;
                }
            }
        }
        System.out.println(max);
        return true;
    }
}
