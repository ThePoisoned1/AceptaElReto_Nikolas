import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E630_TorneoDePadel {
    Scanner sc;

    public static void main(String[] args) {
        new E630_TorneoDePadel().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        long jugadores = sc.nextLong();
        int rondas = sc.nextInt();
        if (jugadores == 0 && rondas == 0) {
            return false;
        }
        String gente = sc.next();
        long mitad = jugadores / 2;
        long partidos = 0;
        long der, izq;
        String[] aux = gente.split("(?<=\\G.{" + mitad + "})");
        der = aux[0].replace("01", "1").length();
        izq = aux[1].replace("01", "1").length();
        mitad /= 2;
        for (int i = 0; i < rondas; i++) {
            if (mitad == 0) {
                if (der == 1 && izq == 1)
                    partidos++;
            } else {
                if (der > mitad) {
                    partidos += der - mitad;
                    der = mitad;
                }
                if (izq > mitad) {
                    partidos += izq - mitad;
                    izq = mitad;
                }
                mitad /= 2;
            }
        }
        System.out.println(partidos);
        return true;
    }
}
