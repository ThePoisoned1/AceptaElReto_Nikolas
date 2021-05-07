import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E536_HuertoEcologico {

    Scanner sc;

    class Huerto {

        int tamanyo, cantAbono, cantAgua, distancia;
        String nombre;

        Huerto(int tamanyo, int cantAbono, int cantAgua, int distancia, String nombre) {
            this.tamanyo = tamanyo;
            this.cantAbono = cantAbono;
            this.cantAgua = cantAgua;
            this.distancia = distancia;
            this.nombre = nombre;
        }

    }

    Huerto getMejor(Huerto actual, Huerto mejor) {
        if (actual.tamanyo > mejor.tamanyo) {
            return actual;
        } else if (actual.tamanyo < mejor.tamanyo) {
            return mejor;
        } else {
            if (actual.cantAgua < mejor.cantAgua) {
                return actual;
            } else if (actual.cantAgua > mejor.cantAgua) {
                return mejor;
            } else {
                if (actual.distancia < mejor.distancia) {
                    return actual;
                } else if (actual.distancia > mejor.distancia) {
                    return mejor;
                } else {
                    if (actual.cantAbono < mejor.cantAbono) {
                        return actual;
                    } else if (actual.cantAbono > mejor.cantAbono) {
                        return mejor;
                    }
                }
            }
        }
        return mejor;
    }

    boolean caso() {
        if (!sc.hasNextLine()) {
            return false;
        }
        int numHuertos = Integer.parseInt(sc.nextLine());
        String nombreHuerto;
        int tamanyo, cantAbono, cantAgua, distancia;
        Huerto mejorHuerto = new Huerto(0, 0, 0, 0, ""), huerto;
        for (int i = 0; i < numHuertos; i++) {
            tamanyo = sc.nextInt();
            cantAbono = sc.nextInt();
            cantAgua = sc.nextInt();
            distancia = sc.nextInt();
            nombreHuerto = sc.nextLine().trim();
            if (i == 0) {
                mejorHuerto = new Huerto(tamanyo, cantAbono, cantAgua, distancia, nombreHuerto);
            } else {
                huerto = new Huerto(tamanyo, cantAbono, cantAgua, distancia, nombreHuerto);
                mejorHuerto = getMejor(huerto, mejorHuerto);
            }
        }
        System.out.println(mejorHuerto.nombre);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E536_HuertoEcologico().run();
    }
}
