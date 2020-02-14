package AceptaElReto.AC;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E542_LaTiaManuela {

    Scanner sc;

    void caso() {
        int[] dimensionesJuguete = new int[3];
        int[] dimensionesCaja = new int[3];
        dimensionesJuguete[0] = sc.nextInt();
        dimensionesJuguete[1] = sc.nextInt();
        dimensionesJuguete[2] = sc.nextInt();
        dimensionesCaja[0] = sc.nextInt();
        dimensionesCaja[1] = sc.nextInt();
        dimensionesCaja[2] = sc.nextInt();
        sc.nextLine();
        Arrays.sort(dimensionesJuguete);
        Arrays.sort(dimensionesCaja);
        if (dimensionesJuguete[0] < dimensionesCaja[0]
                && dimensionesJuguete[1] < dimensionesCaja[1]
                && dimensionesJuguete[2] < dimensionesCaja[2]) {
            System.out.println("SIRVE");
        } else {
            System.out.println("NO SIRVE");
        }
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E542_LaTiaManuela().run();
    }
}
