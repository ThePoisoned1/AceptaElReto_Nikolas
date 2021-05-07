import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E438_Esgritura {

    Scanner sc = new Scanner(System.in);

    boolean caso() {
        if (!sc.hasNext()) {
            return false;
        }
        int numLetras = 0, numEx = 0;
        String mensaje = sc.nextLine();
        for (int i = 0; i < mensaje.length(); i++) {
            if (Character.isLetter(mensaje.charAt(i))) {
                numLetras++;
            } else if (mensaje.charAt(i) == '!') {
                numEx++;
            }
        }
        System.out.println(numEx > numLetras ? "ESGRITO" : "escrito");
        return true;
    }

    void run() {
        while (caso());
    }

    public static void main(String[] args) {
        new E438_Esgritura().run();
    }
}
