import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E583_EncuestaComprometedora {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new E583_EncuestaComprometedora().run();
    }

    private void run() {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            caso();
        }
    }

    private void caso() {
        double rComprometedora = sc.nextInt();
        double rNoComprometedora = sc.nextInt();
        sc.nextLine();
        double salida = ((rComprometedora - (rComprometedora + rNoComprometedora) / 2) * 100)
                / (rComprometedora - (rComprometedora + rNoComprometedora) / 2 + rNoComprometedora);
        System.out.println((int) salida);
    }
}
