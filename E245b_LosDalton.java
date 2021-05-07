import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E245b_LosDalton {

    Scanner sc;

    boolean caso() {
        long numHermanos = sc.nextLong();
        if (numHermanos == 0) {
            return false;
        }
        boolean decrece = true, crece = true;
        long anterior = sc.nextLong(), actual, siguiente;
        for (long i = 1; i < numHermanos - 1; i += 2) {
            actual = sc.nextLong();
            siguiente = sc.nextLong();
            if (decrece && (anterior > actual && actual > siguiente)) {
                crece = false;
            } else if (crece && (anterior < actual && actual < siguiente)) {
                decrece = false;
            } else {
                System.out.println("DESCONOCIDOS");
                sc.nextLine();
                return true;
            }
            anterior = siguiente;
        }
        if (numHermanos % 2 == 0) {
            actual = sc.nextLong();
            if (decrece && anterior > actual) {
                System.out.println("DALTON");
                return true;
            } else if (crece && anterior < actual) {
                System.out.println("DALTON");
                return true;
            } else {
                System.out.println("DESCONOCIDOS");
                return true;
            }
        }
        System.out.println("DALTON");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E245b_LosDalton().run();
    }

}
