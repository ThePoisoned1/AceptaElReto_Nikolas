import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E165_NumeroHyperPar {

    Scanner sc;

    public boolean caso() {
        String numero = sc.nextLine();
        if (Integer.parseInt(numero) < 0) {
            return false;
        }
        for (int i = 0; i < numero.length(); i++) {
            if (Character.getNumericValue(numero.charAt(i)) % 2 != 0) {
                System.out.println("NO");
                return true;
            }
        }
         System.out.println("SI");
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E165_NumeroHyperPar().run();
    }
}
