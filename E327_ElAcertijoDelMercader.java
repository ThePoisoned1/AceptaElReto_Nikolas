import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ThePoisoned1
 */
public class E327_ElAcertijoDelMercader {

    Scanner sc;
    ArrayList<Integer> divisores;
    long[][] potenciasPrimos = new long[30][30];
    long maximo;
    final long INF = 1000000000;
    int contador;

    public void multiplicador(int numDivisores) {
        long numGenerado = 1;
        for (int i = 0; i < numDivisores; ++i) {
            if (potenciasPrimos[i][divisores.get(i) - 2] == 0) {
                return;
            }
            numGenerado *= potenciasPrimos[i][divisores.get(i) - 2];
            if (numGenerado > maximo) {
                return;
            }
        }
        if (numGenerado < maximo) {
            maximo = numGenerado;
        }
    }

    public void calcularDivisores(int a, int numDivisores) {
        int lim;
        if (a == 1) {
            multiplicador(numDivisores);
            return;
        }
        if (a > 31) {
            lim = 31;
        } else {
            lim = a;
        }
        for (int i = lim; i >= 2; i--) {
            if (a % i == 0) {
                divisores.add(numDivisores, i);
                calcularDivisores(a / i, numDivisores + 1);
            }
        }
    }

    public boolean esPrimo(long n) {
        for (int i = 0; i < contador; ++i) {
            if (n % potenciasPrimos[i][0] == 0) {
                return false;
            }
        }
        return true;
    }

    public void calcularPrimos(long limite) {
        contador = 0;
        for (long i = 2; i < INF; i++) {
            if (esPrimo(i)) {
                potenciasPrimos[contador][0] = i;
                for (int j = 1; j < 30; j++) {
                    potenciasPrimos[contador][j] = (long) Math.pow(i, j + 1);
                    if (potenciasPrimos[contador][j] > INF) {
                        break;
                    }
                }
                contador++;
                if (contador == limite) {
                    return;
                }
            }
        }

    }

    public boolean caso() {
        int num = sc.nextInt();
        if (num == 0) {
            return false;
        }
        if (num > 1344) {
            System.out.println("+INF");
            return true;
        }
        divisores = new ArrayList<>();
        maximo = INF + 1;
        calcularDivisores(num, 0);
        System.out.println(maximo == 1000000001 ? "+INF" : maximo);
        return true;
    }

    public void run() {
        sc = new Scanner(System.in);
        calcularPrimos(30);
        while (caso()) {

        }
    }

    public static void main(String[] args) {
        new E327_ElAcertijoDelMercader().run();
    }
}
