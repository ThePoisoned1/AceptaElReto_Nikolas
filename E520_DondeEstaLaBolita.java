import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E520_DondeEstaLaBolita {

    Scanner sc;

    boolean caso() {
        int cantCubiletes = sc.nextInt();
        int posBolita = sc.nextInt();
        if (cantCubiletes == 0 || posBolita == 0) {
            return false;
        }
        int cubileteA = -1, cubileteB = -1;
        while (cubileteA != 0 && cubileteB != 0) {
            cubileteA = sc.nextInt();
            cubileteB = sc.nextInt();
            if (posBolita == cubileteA) {
                posBolita = cubileteB;
            } else if (posBolita == cubileteB) {
                posBolita = cubileteA;
            }
        }
        System.out.println(posBolita);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E520_DondeEstaLaBolita().run();
    }
}
