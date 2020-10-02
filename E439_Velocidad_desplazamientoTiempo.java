package aer;

import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E439_Velocidad_desplazamientoTiempo {

    Scanner sc;

    int SacarTiempo(int velociad, int distancia) {
        int tiempo = distancia / velociad;
        return tiempo;
    }

    int SacarDistancia(int velociad, int tiempo) {
        int distancia = velociad * tiempo;
        return distancia;
    }

    int SacarVelocidad(int distancia, int tiempo) {
        int velocidad = distancia / tiempo;
        return velocidad;
    }

    void caso() {
        String[] datos = sc.nextLine().split(" ");
        char tipoDato1 = datos[0].charAt(0),
                tipoDato2 = datos[1].charAt(0);
        int v, d, t;
        if (tipoDato1 == 'D' && tipoDato2 == 'T') {
            d = Integer.parseInt(datos[0].substring(2, datos[0].length()));
            t = Integer.parseInt(datos[1].substring(2, datos[1].length()));
            System.out.println("V=" + SacarVelocidad(d, t));
        } else if (tipoDato1 == 'T' && tipoDato2 == 'D') {
            t = Integer.parseInt(datos[0].substring(2, datos[0].length()));
            d = Integer.parseInt(datos[1].substring(2, datos[1].length()));
            System.out.println("V=" + SacarVelocidad(d, t));
        } else if (tipoDato1 == 'V' && tipoDato2 == 'T') {
            v = Integer.parseInt(datos[0].substring(2, datos[0].length()));
            t = Integer.parseInt(datos[1].substring(2, datos[1].length()));
            System.out.println("D=" + SacarDistancia(v, t));
        } else if (tipoDato1 == 'T' && tipoDato2 == 'V') {
            t = Integer.parseInt(datos[0].substring(2, datos[0].length()));
            v = Integer.parseInt(datos[1].substring(2, datos[1].length()));
            System.out.println("D=" + SacarDistancia(v, t));
        } else if (tipoDato1 == 'V' && tipoDato2 == 'D') {
            v = Integer.parseInt(datos[0].substring(2, datos[0].length()));
            d = Integer.parseInt(datos[1].substring(2, datos[1].length()));
            System.out.println("T=" + SacarTiempo(v, d));
        } else if (tipoDato1 == 'D' && tipoDato2 == 'V') {
            d = Integer.parseInt(datos[0].substring(2, datos[0].length()));
            v = Integer.parseInt(datos[1].substring(2, datos[1].length()));
            System.out.println("T=" + SacarTiempo(v, d));
        }
    }

    void run() {
        sc = new Scanner(System.in);
        int veces = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < veces; i++) {
            caso();
        }
    }

    public static void main(String[] args) {
        new E439_Velocidad_desplazamientoTiempo().run();
    }
}

