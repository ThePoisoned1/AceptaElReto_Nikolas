import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E533_LaBotellaGanadora {

    Scanner sc;

    void caso() {
        int meta = sc.nextInt() * 1000;
        int suma = 0;
        int cantBotellas;
        int contador = 0;
        boolean metaCumplida = false;
        int botellaGanadora = 0;
        do {
            cantBotellas = sc.nextInt() * 125;
            suma += cantBotellas;
            contador++;
            if (suma >= meta && !metaCumplida) {
                metaCumplida = true;
                botellaGanadora = contador;
            }
        } while (cantBotellas != 0);
        System.out.println(metaCumplida ? botellaGanadora : "SIGAMOS RECICLANDO");
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E533_LaBotellaGanadora().run();
    }
}
