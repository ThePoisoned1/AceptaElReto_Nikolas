import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E148_Nochevieja {

    Scanner sc;

    boolean caso() {
        String[] horaMin = sc.next().split(":");
        int hora = Integer.parseInt(horaMin[0]);
        int minuto = Integer.parseInt(horaMin[1]);
        if (hora == 0 && minuto == 0) {
            return false;
        }
        System.out.println(((23 - hora) * 60) + (60 - minuto));
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E148_Nochevieja().run();
    }
}
