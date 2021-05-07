import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E528_ElExtranyoCasoDeLaMultiplicacion {

    Scanner sc;

    boolean caso() {

        int cantNumeros = sc.nextInt();
        if (cantNumeros == 0) {
            return false;
        }
        double num;
        long numEnteros = 0;
        long numCeroComa = 0;
        long numCeros = 0;
        long numUnos = 0;
        long combinacionesCeroComa = 0;
        long combinacionesEnteros = 0;
        long combinacionesCeros = 0;
        long combinacionesUnos = 0;
        for (int i = 0; i < cantNumeros; i++) {
            num = Double.parseDouble(sc.next());
            if (num < 1d && num > 0d) {
                combinacionesCeroComa += numCeroComa;
                numCeroComa++;
            } else if (num == 0d) {
                combinacionesCeros += numCeros;
                numCeros++;
            } else if (num == 1d) {
                combinacionesUnos += numUnos;
                numUnos++;
            } else {
                combinacionesEnteros += numEnteros;
                numEnteros++;
            }
        }
        //hay que combinar los numeros con los 0 y los 1, y los 1 y 0 entre si
        System.out.println(combinacionesCeroComa + (numCeros * numCeroComa) + (numUnos * numCeroComa)
                + combinacionesEnteros + (numCeros * numEnteros) + (numUnos * numEnteros)
                + combinacionesCeros + (numCeros * numUnos)
                + combinacionesUnos);
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E528_ElExtranyoCasoDeLaMultiplicacion().run();
    }
}
