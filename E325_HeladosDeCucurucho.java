package AceptaElReto.AC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E325_HeladosDeCucurucho {

    Scanner sc;
    ArrayList<String> helados;

    public void mezcla(int bolasChocolate, int bolasVainilla, String x) {

        if (bolasChocolate == 0 && bolasVainilla == 0) {
            helados.add(x);
        }
        if (bolasChocolate > 0) {
            mezcla(bolasChocolate - 1, bolasVainilla, x + "C");
        }
        if (bolasVainilla > 0) {
            mezcla(bolasChocolate, bolasVainilla - 1, x + "V");
        }

    }

    void caso() {
        int bolasChocolate = sc.nextInt();
        int bolasVainilla = sc.nextInt();
        helados.clear();
        String helado = "";
        mezcla(bolasChocolate, bolasVainilla, helado);
        Collections.sort(helados);
        for (int j = 0; j < helados.size(); j++) {
            if (j != helados.size() - 1) {
                System.out.print(helados.get(j) + " ");
            } else {
                System.out.println(helados.get(j));
            }
        }
    }

    void run() {
        sc = new Scanner(System.in);
        helados = new ArrayList<>();
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E325_HeladosDeCucurucho().run();
    }
}
