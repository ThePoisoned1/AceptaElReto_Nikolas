import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E524_CompeYTencia {
    Scanner sc;

    class Cesta implements Comparable<Cesta> {
        int precioCompe;
        int precioTencia;
        int diferencia;

        Cesta(int compe, int tencia) {
            this.precioCompe = compe;
            this.precioTencia = tencia;
            this.diferencia = compe - tencia;

        }

        @Override
        public int compareTo(Cesta o) {
            return this.diferencia < o.diferencia ? -1 : 1;
        }
    }

    public static void main(String[] args) {
        new E524_CompeYTencia().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        int compras = sc.nextInt();
        if (compras == 0) {
            return false;
        }
        int minCompe = sc.nextInt();
        int minTencia = sc.nextInt();
        long sum = 0;
        Queue<Cesta> cestas = new PriorityQueue<>();
        int[] preciosCompe = new int[compras];
        for (int i = 0; i < compras; i++) {
            preciosCompe[i] = sc.nextInt();
        }
        for (int i = 0; i < compras; i++) {
            cestas.add(new Cesta(preciosCompe[i], sc.nextInt()));
        }
        // printCestas(cestas);
        for (int i = 0; i < minCompe; i++) {
            sum += cestas.poll().precioCompe;
        }
        for (int i = 0; i < compras-minCompe-minTencia; i++) {
            sum += Math.min(cestas.peek().precioCompe, cestas.poll().precioTencia);
        }
        for (int i = 0; i < minTencia; i++) {
            sum += cestas.poll().precioTencia;
        }
        // printCestas(cestas);
        System.out.println(sum);
        return true;
    }

    // void printCestas(List<Cesta> cestas) {
    // for (Cesta cesta : cestas) {
    // System.out.print("[" + cesta.precioCompe + "," + cesta.precioTencia + "]");
    // }
    // System.out.println();
    // }
}
