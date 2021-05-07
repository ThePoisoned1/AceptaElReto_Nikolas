import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E184_ElSuenyoDeLosConcursantes {

    Scanner sc;

    int getHora(int hora) {
        switch (hora) {
            case 22:
                return 0;
            case 23:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            default:
                return 0;

        }
    }

    int[] getSuenyo(String[] inicio, String[] fin) {
        int[] duerme = new int[2];
        duerme[1] = Integer.parseInt(fin[1]) - Integer.parseInt(inicio[1]);
        int horaDuerme = getHora(Integer.parseInt(inicio[0]));
        int horaDespierta = getHora(Integer.parseInt(fin[0]));
        duerme[0] = horaDespierta - horaDuerme;
        if (duerme[1] < 0) {
            duerme[1] += 60;
            duerme[0]--;
        }
        return duerme;
    }

    boolean caso() {
        int numNoches = sc.nextInt();
        if (numNoches == 0) {
            return false;
        }
        String[] periodoSuenyo;
        String[] inicio, fin;
        int[] suenyo;
        int horasTotalesSuenyo = 0, minutosTotalesSuenyo = 0;
        for (int i = 0; i < numNoches; i++) {
            periodoSuenyo = sc.next().split("-");
            inicio = periodoSuenyo[0].split(":");
            fin = periodoSuenyo[1].split(":");
            suenyo = getSuenyo(inicio, fin);
            horasTotalesSuenyo += suenyo[0];
            minutosTotalesSuenyo += suenyo[1];
        }
        while (minutosTotalesSuenyo > 59) {
            minutosTotalesSuenyo -= 60;
            horasTotalesSuenyo++;
        }
        System.out.printf("%02d", horasTotalesSuenyo);
        System.out.print(":");
        System.out.printf("%02d", minutosTotalesSuenyo);
        System.out.println("");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E184_ElSuenyoDeLosConcursantes().run();
    }
}
