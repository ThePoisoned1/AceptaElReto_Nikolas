package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E529_LoginLogout {

    Scanner sc;

    void caso() {
        String log = sc.next();
        int usuariosActuales = 0, usuariosMaximos = 0;
        for (int i = 0; i < log.length(); i++) {
            switch (log.charAt(i)) {
                case 'O':
                    if (usuariosActuales == 0) {
                        usuariosMaximos++;
                    } else {
                        usuariosActuales--;
                    }
                    break;
                case 'I':
                    usuariosActuales++;
                    break;
            }
            if (usuariosActuales>usuariosMaximos) {
                usuariosMaximos=usuariosActuales;
            }
        }
        System.out.println(usuariosMaximos);
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E529_LoginLogout().run();
    }
}
