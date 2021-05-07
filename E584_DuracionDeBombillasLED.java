import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E584_DuracionDeBombillasLED {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new E584_DuracionDeBombillasLED().run();
    }

    private void run() {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            caso();
        }
    }

    private void caso() {
        int horas = sc.nextInt();
        int encendidos = sc.nextInt();
        int horasEncendidos = sc.nextInt();
        sc.nextLine();
        int totalHorasEncendidos = encendidos * horasEncendidos;
        if (horas > totalHorasEncendidos) {
            System.out.println("ENCENDIDOS");
        } else if (horas < totalHorasEncendidos) {
            System.out.println("HORAS");
        } else {
            System.out.println("AMBAS");
        }
    }
}
