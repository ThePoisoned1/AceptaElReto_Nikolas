package AceptaElReto;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author ThePoisoned1
 */
public class E270_MePilloElToro {

    Scanner sc;
    TreeMap<String, Integer> clase;

    void editarAlumno(String nombre, int puntaje) {
        if (clase.containsKey(nombre)) {
            clase.put(nombre, clase.get(nombre) + puntaje);
        } else {
            clase.put(nombre, puntaje);
        }
    }

    boolean caso() {
        int ejerciciosParaCorregir = Integer.parseInt(sc.nextLine());
        if (ejerciciosParaCorregir == 0) {
            return false;
        }
        clase = new TreeMap<>();
        String nombre, resultado;
        for (int i = 0; i < ejerciciosParaCorregir; i++) {
            nombre = sc.nextLine();
            resultado = sc.nextLine();
            if (resultado.equals("CORRECTO")) {
                editarAlumno(nombre, 1);
            } else {
                editarAlumno(nombre, -1);
            }
        }
        for (String i : clase.keySet()) {
            if (clase.get(i)!=0) {
                System.out.println(i+", "+clase.get(i));
            }
        }
        System.out.println("---");
        return true;
    }

    void run() {
        sc = new Scanner(System.in);
        while (caso()) {
        }
    }

    public static void main(String[] args) {
        new E270_MePilloElToro().run();
    }
}
