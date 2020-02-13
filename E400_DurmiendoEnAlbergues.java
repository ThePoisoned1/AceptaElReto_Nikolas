package AceptaElReto.AC;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E400_DurmiendoEnAlbergues {

    Scanner sc;

    boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }
        String albergue = sc.nextLine();
        int distancia = -1;
        int ultimaOcupada = -1;
        int maximaDistancia = -1;
        for (int i = 0; i < albergue.length(); i++) {
            if (albergue.charAt(i) == 'X') {
                distancia = -1;
                ultimaOcupada = i;
            }
            if (albergue.charAt(i) == '.') {
                distancia++;
            }
            if (ultimaOcupada < 0) {
                if (distancia > maximaDistancia) {
                    maximaDistancia = distancia;
                }
            } else if (albergue.charAt(albergue.length() - 1) != 'X' && i == albergue.length() - 1 && distancia > maximaDistancia) {
                maximaDistancia = distancia;
            } else {
                if (Math.floor(distancia / 2) > maximaDistancia) {
                    maximaDistancia = (int) Math.floor(distancia / 2);
                }
            }
        }
        System.out.println(maximaDistancia);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E400_DurmiendoEnAlbergues().run();
    }
}
