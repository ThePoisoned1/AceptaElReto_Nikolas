package AceptaElReto.AC;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author ThePoisoned1
 */
public class E291_ReferenciasCruzadas {

    Scanner sc;
    TreeMap<String, TreeSet<Integer>> palabras;
    TreeSet<Integer> aux;

    boolean caso() {
        int numLineas = Integer.parseInt(sc.nextLine());
        if (numLineas == 0) {
            return false;
        }
        palabras.clear();
        String[] linea;
        for (int i = 1; i <= numLineas; i++) {
            linea = sc.nextLine().toLowerCase().split(" ");
            for (String x : linea) {
                if (x.length() > 2) {
                    if ((!palabras.containsKey(x))) {
                        aux = new TreeSet<>();
                        aux.add(i);
                        palabras.put(x, aux);
                    } else if (palabras.containsKey(x)) {
                        aux = palabras.get(x);
                        aux.add(i);
                        palabras.put(x, aux);
                    }
                }
            }
        }
        for (String i : palabras.keySet()) {
            System.out.print(i);
            while (palabras.get(i).size() > 0) {
                System.out.print(" " + palabras.get(i).pollFirst());
            }
            System.out.println("");
        }
        System.out.println("----");

        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        palabras = new TreeMap<>();
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E291_ReferenciasCruzadas().run();
    }

}
