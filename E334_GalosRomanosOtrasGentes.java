import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E334_GalosRomanosOtrasGentes {
    Scanner sc;

    public static void main(String[] args) {
        new E334_GalosRomanosOtrasGentes().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {
        String nombre = sc.nextLine().trim();
        boolean galo = nombre.endsWith("IX");
        boolean romano = nombre.endsWith("US") || nombre.endsWith("UM");
        boolean godo = nombre.endsWith("IC");
        boolean griego = nombre.endsWith("AS");
        boolean normando = nombre.endsWith("AF");
        boolean breton = nombre.endsWith("IS") || nombre.endsWith("OS") || nombre.endsWith("AX");
        boolean hispano = nombre.endsWith("EZ");
        boolean indio = nombre.endsWith("A");
        boolean picto = nombre.startsWith("MAC");
        if (picto && (galo || romano || godo || griego || normando || breton || hispano || indio)) {
            System.out.println("MULATO");
            return;
        }
        if (galo) {
            System.out.println("GALO");
        } else if (romano) {
            System.out.println("ROMANO");
        } else if (godo) {
            System.out.println("GODO");
        } else if (griego) {
            System.out.println("GRIEGO");
        } else if (normando) {
            System.out.println("NORMANDO");
        } else if (breton) {
            System.out.println("BRETON");
        } else if (hispano) {
            System.out.println("HISPANO");
        } else if (indio) {
            System.out.println("INDIO");
        } else if (picto) {
            System.out.println("PICTO");
        } else {
            System.out.println("PLUS ULTRA");
        }
    }
}
