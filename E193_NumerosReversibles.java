import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E193_NumerosReversibles {

    Scanner sc;

    boolean caso() {
        String numero = sc.next();
        if (numero.equals("0")) {
            return false;
        }
        StringBuilder revertido = new StringBuilder(numero);
        revertido.reverse();
        if (revertido.charAt(0)=='0') {
            System.out.println("NO");
            return true;
        }
        String suma = Long.toString(Long.parseLong(numero) + Long.parseLong(revertido.toString()));
        for (int i = 0; i < suma.length(); i++) {
            if (Integer.parseInt(Character.toString(suma.charAt(i)))%2==0) {
                System.out.println("NO");
                return true;
            }
        }
        System.out.println("SI");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E193_NumerosReversibles().run();
    }
}
