import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E622_LaMediaPromedia {
    Scanner sc;

    public static void main(String[] args) {
        new E622_LaMediaPromedia().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        int num = sc.nextInt();
        if (num == 0) {
            return false;
        }
        int media = 0;
        for (int i = 0; i < num; i++) {
            media += sc.nextInt();
        }
        int promesa = sc.nextInt();
        // m+x = p*(num+1)
        // x = p*(num+1)-m
        double ultimaNota = promesa * (num + 1) - media;
        if (ultimaNota % 1 != 0 || ultimaNota > 10 || ultimaNota < 0) {
            System.out.println("IMPOSIBLE");
        } else {
            System.out.println((int) ultimaNota);
        }
        return true;
    }
}