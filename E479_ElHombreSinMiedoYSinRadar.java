import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E479_ElHombreSinMiedoYSinRadar {

    Scanner sc;
    String[] campo;

    public String comprobar(String[] orden) {
        int dist = 0;
        boolean villano = false;
        int pos;

        if (orden[2].equals("IZQUIERDA")) {
            pos = Integer.parseInt(orden[1]) - 1;
            while (pos >= 0 && !villano) {
                if (campo[Integer.parseInt(orden[0]) - 1].charAt(pos) == 'X') {
                    villano = true;
                } else {
                    pos--;
                    dist++;
                }

            }
        } else if (orden[2].equals("DERECHA")) {
            pos = Integer.parseInt(orden[1]) - 1;
            while (pos < campo[0].length() && !villano) {
                if (campo[Integer.parseInt(orden[0]) - 1].charAt(pos) == 'X') {
                    villano = true;
                } else {
                    pos++;
                    dist++;
                }

            }
        } else if (orden[2].equals("ARRIBA")) {
            pos = Integer.parseInt(orden[0]) - 1;
            while (pos >= 0 && !villano) {
                if (campo[pos].charAt(Integer.parseInt(orden[1]) - 1) == 'X') {
                    villano = true;
                } else {
                    pos--;
                    dist++;
                }
            }
        } else {
            pos = Integer.parseInt(orden[0]) - 1;
            while (pos < campo.length && !villano) {
                if (campo[pos].charAt(Integer.parseInt(orden[1]) - 1) == 'X') {
                    villano = true;
                } else {
                    pos++;
                    dist++;
                }
            }
        }
        if (villano) {
            return Integer.toString(dist);
        } else {
            return "NINGUNO";
        }
    }

    public boolean caso() {
        int alto = sc.nextInt();
        int ancho = sc.nextInt();
        sc.nextLine();
        if (alto==0&&ancho==0) {
            return false;
        }

        campo = new String[alto];
        for (int i = 0; i < alto; i++) {
            campo[i] = sc.nextLine();
        }
        int numPruebas = Integer.parseInt(sc.nextLine());
        String[] orden;
        for (int i = 0; i < numPruebas; i++) {
            orden = sc.nextLine().split(" ");
            System.out.println(comprobar(orden));
        }
        System.out.println("---");
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        while (caso()) {

        }
    }

    public static void main(String[] args) {
        new E479_ElHombreSinMiedoYSinRadar().run();
    }
}
