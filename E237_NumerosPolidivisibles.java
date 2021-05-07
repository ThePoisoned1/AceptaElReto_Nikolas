import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E237_NumerosPolidivisibles {

    Scanner sc;

    public boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }
        String num = sc.nextLine();
        String aux;

        for (int i = 1; i <= num.length(); i++) {
            aux = "";
            for (int j = 0; j < i; j++) {
                aux = aux + num.charAt(j);
            }
            if (Long.parseLong(aux) % i != 0) {
                System.out.println("NO POLIDIVISIBLE");
                return true;
            }
        }
        System.out.println("POLIDIVISIBLE");
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E237_NumerosPolidivisibles().run();
    }
}
