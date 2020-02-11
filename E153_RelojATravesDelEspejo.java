package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E153_RelojATravesDelEspejo {

    Scanner sc;

    public int getMinutoEspejo(int minuto) {
        if (minuto == 0) {
            return 0;
        }
        return 60 - minuto;
    }

    public int getHoraEspejo(int hora, int minuto) {
        switch (hora) {
            case 1:
                hora = 11;
                break;
            case 2:
                hora = 10;
                break;
            case 3:
                hora = 9;
                break;
            case 4:
                hora = 8;
                break;
            case 5:
                hora = 7;
                break;
            case 7:
                hora = 5;
                break;
            case 8:
                hora = 4;
                break;
            case 9:
                hora = 3;
                break;
            case 10:
                hora = 2;
                break;
            case 11:
                hora = 1;
                break;
        }
        if (minuto != 0) {
            hora--;
        }
        if (hora == 0) {
            hora = 12;
        }
        return hora;
    }

    public void caso() {
        String[] time = sc.nextLine().split(":");
        int hora = Integer.parseInt(time[0]);
        int minuto = Integer.parseInt(time[1]);
        hora = getHoraEspejo(hora, minuto);
        System.out.printf("%02d", hora);
        System.out.print(":");

        System.out.printf("%02d", getMinutoEspejo(minuto));
        System.out.println("");
    }

    public void run() {
        sc = new Scanner(System.in);
        int veces = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E153_RelojATravesDelEspejo().run();
    }
}
