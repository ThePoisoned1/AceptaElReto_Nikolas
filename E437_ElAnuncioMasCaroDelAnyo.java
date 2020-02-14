package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E437_ElAnuncioMasCaroDelAnyo {

    Scanner sc;

    void caso() {
        String[] tiempo = sc.nextLine().split(":");
        int segundos = 60 - Integer.parseInt(tiempo[2]);
        int minutos = 59 - Integer.parseInt(tiempo[1]);
        int horas = 23 - Integer.parseInt(tiempo[0]);
        if (segundos < 0) {
            minutos--;
            segundos -= 60;
        }
        if (minutos < 0) {
            horas--;
            minutos -= 60;
        }
        if (segundos == 60) {
            minutos++;
            segundos = 0;
        }
        if (minutos == 60) {
            horas++;
            minutos = 0;
        }
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E437_ElAnuncioMasCaroDelAnyo().run();
    }
}
