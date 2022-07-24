import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E626_PilinioElJoven {
    Scanner sc;

    public static void main(String[] args) {
        new E626_PilinioElJoven().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    private void caso() {
        String[] fecha = sc.next().split("/");
        int anyo = Integer.parseInt(fecha[2]);
        int mes = Integer.parseInt(fecha[1]);
        if (mes > 2 || (mes == 2 && Integer.parseInt(fecha[0]) == 29)) {
            anyo++;
        }
        while (anyo % 4 != 0) {
            anyo++;
        }
        String anyoString = ("" + anyo).trim();
        while (anyoString.length() < 4) {
            anyoString = "0" + anyoString;
        }
        System.out.println("29/02/" + anyoString);
    }
}
