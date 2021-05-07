import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E513_EmpleadoDelAnyo {

    Scanner sc;

    public void caso() {
        int numDias = sc.nextInt();
        sc.nextLine();
        long media;
        long suma = 0;
        long trabajosDia;
        for (long i = 1; i <= numDias; i++) {
            if (i == 1) {
                media = sc.nextInt();
                suma = media;
                trabajosDia = media;
                System.out.print(trabajosDia);
            } else {
                media = sc.nextInt();
                trabajosDia = (i * media) - suma;
                suma += trabajosDia;
                System.out.print(" " + trabajosDia);
            }
        }
        sc.nextLine();
        System.out.println("");
    }

    public void run() {
        sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E513_EmpleadoDelAnyo().run();
    }
}
