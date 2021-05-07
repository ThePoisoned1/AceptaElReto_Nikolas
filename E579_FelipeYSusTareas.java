import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author ThePoisoned1
 */
public class E579_FelipeYSusTareas {
    Scanner sc;

    public static void main(String[] args) {
        new E579_FelipeYSusTareas().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        int cant = sc.nextInt();
        if (cant == 0) {
            return false;
        }
        Map<Integer, ArrayList<Integer>> tareas = new TreeMap<>();
        int prioridad;
        for (int i = 0; i < cant; i++) {
            prioridad = sc.nextInt();
            if (tareas.containsKey(prioridad)) {
                tareas.get(prioridad).add(sc.nextInt());
            } else {
                tareas.put(prioridad, new ArrayList<Integer>());
                tareas.get(prioridad).add(sc.nextInt());
            }
        }
        String out = "";
        String aux;
        for (Integer p : tareas.keySet()) {
            aux = "";
            Collections.sort(tareas.get(p));
            for (Integer tamanno : tareas.get(p)) {
                aux += p + " " + tamanno + "\n";
            }
            out = aux + out;
        }
        System.out.println(out + "---");
        return true;
    }
}
