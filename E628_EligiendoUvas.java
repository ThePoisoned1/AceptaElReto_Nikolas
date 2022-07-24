import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E628_EligiendoUvas {
    Scanner sc;

    public static void main(String[] args) {
        new E628_EligiendoUvas().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }
        long sabor = -1;
        long grosor = -1;
        long minPiel = Long.MAX_VALUE;
        long maxSabor = 0;
        Long[] bestUva = new Long[] { (long) 0, (long) 0 };
        while (sabor > 0 && grosor > 0) {
            sabor = sc.nextLong();
            grosor = sc.nextLong();
            if (sabor > 0 && grosor > 0) {
                if (sabor > maxSabor) {
                    bestUva[0] = sabor;
                    bestUva[1] = grosor;
                    maxSabor = sabor;
                } else if (sabor == maxSabor && grosor < bestUva[1]) {
                    bestUva[0] = sabor;
                    bestUva[1] = grosor;
                }
                if (grosor < minPiel) {
                    minPiel = grosor;
                }
            } else {
                sc.nextLine();
            }
        }
        if (maxSabor != 0)
            System.out.println(bestUva[1] <= minPiel ? bestUva[0] + " " + bestUva[1] : "NO HAY MEJOR");

        return true;
    }

}
